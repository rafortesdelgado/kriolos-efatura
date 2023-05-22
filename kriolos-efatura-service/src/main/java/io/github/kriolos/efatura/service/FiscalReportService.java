package io.github.kriolos.efatura.service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;
import io.github.kriolos.efatura.clientapi.generated.model.DfeListPaginationResponse;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseDfePayload;
import io.github.kriolos.efatura.service.enums.DfeDocumentTypeEnum;
import io.github.kriolos.efatura.service.enums.IssueDirection;

public class FiscalReportService {

    private DfeApi dfeApi;

    public FiscalReportService(DfeApi dfeApi) {
        this.dfeApi = dfeApi;
    }

    public void getMod106(String year) {
        try {

            DfeListPaginationResponse result = dfeApi.dfeResourceGetDfeSummaryListV2(
                    null, // data de fim de autorizacao,
                    null, // data de inicio de autorizacao,
                    null,
                    getFilterByDocTypeForMod106(), // "1,2,3,5", // DocumentTypeCode
                    null,
                    null,
                    null,
                    IssueDirection.Recepcao, // direcao
                    year,
                    "10000", // itens por page
                    null, // led code
                    null,
                    null,
                    null,
                    "1");

            List<String> list = result.getPayload().getItems().stream()
                    .map((Object d) -> {
                        if (d instanceof HashMap<?, ?>) {
                            @SuppressWarnings("unchecked")
                            HashMap<String, String> map = (HashMap<String, String>) d;
                            return map.get("Id");
                        }
                        return null;
                    })
                    .collect(Collectors.toList());

            List<PayloadProcessingResponseDfePayload> dfes = list.stream()
                    .parallel()
                    .map(ds -> {
                        try {
                            return dfeApi.dfeResourceGetDfeById(ds, "1").getPayload();
                        } catch (ApiException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        return null;
                    })
                    .filter(l -> l != null)
                    .collect(Collectors.toList());

            ExportToCsv.ExportDfeSummary(dfes, new Mod106LineMapper()::addLineToModDoc);

        } catch (ApiException e) {
            System.out.println(e.getCode());
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());

            e.printStackTrace();
        }
    }

    private static String getFilterByDocTypeForMod106() {

        return Stream.of(
                DfeDocumentTypeEnum.FTE,
                DfeDocumentTypeEnum.FRE,
                DfeDocumentTypeEnum.TVE,
                DfeDocumentTypeEnum.NCE)
                .map(t -> t.getValue() + "")
                .collect(Collectors.joining(","));
    }


    public void getMod107(String year) {
        try {

            DfeListPaginationResponse result = dfeApi.dfeResourceGetDfeSummaryListV2(
                    null, // data de fim de autorizacao,
                    null, // data de inicio de autorizacao,
                    null,
                    getFilterByDocTypeForMod106(), // "1,2,3,5", // DocumentTypeCode
                    null,
                    null,
                    null,
                    IssueDirection.Emissao, // direcao
                    year,
                    "10000", // itens por page
                    null, // led code
                    null,
                    null,
                    null,
                    "1");

            List<String> list = result.getPayload().getItems().stream()
                    .map((Object d) -> {
                        if (d instanceof HashMap<?, ?>) {
                            @SuppressWarnings("unchecked")
                            HashMap<String, String> map = (HashMap<String, String>) d;
                            return map.get("Id");
                        }
                        return null;
                    })
                    .collect(Collectors.toList());

            List<PayloadProcessingResponseDfePayload> dfes = list.stream()
                    .parallel()
                    .map(ds -> {
                        try {
                            return dfeApi.dfeResourceGetDfeById(ds, "1").getPayload();
                        } catch (ApiException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        return null;
                    })
                    .filter(l -> l != null)
                    .collect(Collectors.toList());

            ExportToCsv.ExportDfeSummary(dfes,new Mod107LineMapper()::addLineToModDoc);

        } catch (ApiException e) {
            System.out.println(e.getCode());
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());

            e.printStackTrace();
        }
    }
}
