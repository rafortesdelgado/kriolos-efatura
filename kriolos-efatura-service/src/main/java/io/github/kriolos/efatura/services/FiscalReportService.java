package io.github.kriolos.efatura.services;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.kriolos.efatura.Program;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;
import io.github.kriolos.efatura.clientapi.generated.model.Dfe;
import io.github.kriolos.efatura.clientapi.generated.model.DfeListPaginationResponse;
import io.github.kriolos.efatura.enums.DfeDocumentTypeEnum;
import io.github.kriolos.efatura.enums.IssueDirection;
import io.github.kriolos.efatura.models.Mod106LineMapper;
import io.github.kriolos.efatura.models.Mod107LineMapper;

public class FiscalReportService {

    private DfeApi dfeApi;

    public FiscalReportService(DfeApi dfeApi) {
        this.dfeApi = dfeApi;
    }

    private static String _startDate = "2024-05-01";    
    //private static String endDate = "2023-11-01";
    private static String _endDate = null;

    public void getMod106Suppliers(String year) 
    {
        getMod106Suppliers(year , FiscalReportService._startDate, FiscalReportService._endDate);
    }
    public void getMod106Suppliers(String year, String startDate, String endDate) {
        try {
            DfeListPaginationResponse result = dfeApi.dfeResourceGetDfeSummaryListV2(
                    endDate, // data de fim de autorizacao,
                    startDate, // data de inicio de autorizacao,
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

            List<Dfe> dfes = list.stream() 
                    .parallel()
                    .map(ds -> {
                        try {
                            return dfeApi.dfeResourceGetDfeById(ds, "1").getPayload();
                        } catch (ApiException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        catch (Exception e) {
                            //throw e ;
                            System.out.println(":::::ERROR:::::"+ Program.cliName + ":::::" + ds);
                            // TODO Auto-generated catch block
                            //e.printStackTrace();
                        }
                        return null;
                    })
                    .filter(l -> l != null)
                    .collect(Collectors.toList());

            ExportToCsv.ExportDfeSummary(dfes, Program.cliName +"_forn_", new Mod106LineMapper()::addLineToModDoc);

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
                DfeDocumentTypeEnum.FTE
                ,DfeDocumentTypeEnum.FRE
                ,DfeDocumentTypeEnum.TVE
                ,DfeDocumentTypeEnum.NCE
                ,DfeDocumentTypeEnum.NDE
                ,DfeDocumentTypeEnum.DVE
            )
                .map(t -> t.getValue() + "")
                .collect(Collectors.joining(","));
    }


    public void getMod106Clients(String year) 
    {
        getMod106Clients(year , FiscalReportService._startDate, FiscalReportService._endDate);
    }

    public void getMod106Clients(String year, String startDate, String endDate) {
        try {

            DfeListPaginationResponse result = dfeApi.dfeResourceGetDfeSummaryListV2(
                    endDate, // data de fim de autorizacao,
                    startDate, // data de inicio de autorizacao,
                    null,
                    getFilterByDocTypeForMod106(), // "1,2,3,5", // DocumentTypeCode
                    null,
                    null,
                    null,
                    IssueDirection.Emissao, // direcao
                    year,
                    "10000", // itens por page
                    null, // led code
                    "1",
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

            List<Dfe> dfes = list.stream()
                    .parallel()
                    .map(ds -> {
                        try {
                            return dfeApi.dfeResourceGetDfeById(ds, "1").getPayload();
                        } catch (ApiException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        catch (Exception e) {
                            //throw e ;
                            System.out.println(":::::ERROR:::::" + Program.cliName + ":::::" + ds);
                            // TODO Auto-generated catch block
                            //e.printStackTrace();
                        }
                        return null;
                    })
                    .filter(l -> l != null)
                    .collect(Collectors.toList());

            ExportToCsv.ExportDfeSummary(dfes,Program.cliName + "_cli_",new Mod107LineMapper()::addLineToModDoc);

        } catch (ApiException e) {
            System.out.println(e.getCode());
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());

            e.printStackTrace();
        }
    }
}
