package io.github.kriolos.efatura.service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;
import io.github.kriolos.efatura.clientapi.generated.model.DfeListPaginationResponse;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseDfePayload;
import io.github.kriolos.efatura.service.enums.IssueDirection;


public class Program {
	
	public static void main (String[] args) 
	{
		
		TokenManager tm = new TokenManager();
//		tm.initToken("289308496", "lausdeo156@@!");
				
		String token = tm.getToken(289308496);
		
		ApiClient apiCli = new ApiClient();
		apiCli.setBasePath("https://services.efatura.cv/");
		apiCli.setAccessToken(token);
		
//
//		apiCli.setUsername("289308496");
//		apiCli.setPassword("lausdeo156@@!");
		
		DfeApi dfeApi = new DfeApi(apiCli);
		
		try {
			
			DfeListPaginationResponse result = dfeApi.dfeResourceGetDfeSummaryListV2(
					null,// data de fim de autorizacao,
					null,// data de inicio de autorizacao,
					null,
					"1,2,3,5", // DocumentTypeCode
					null,
					null,
					null,
					IssueDirection.Recepcao, // direcao
					"2023",
					"1000", // itens por page
					null, // led code
					null, 
					null,
					null,
					"1"
				);
			
			List<String> list = result.getPayload().getItems().stream()
					.map(d -> {
						return ((HashMap<String,String>)d).get("Id");
					}).collect(Collectors.toList());
			
			List<PayloadProcessingResponseDfePayload> dfes = list.stream()
				.parallel()
				.map( ds -> {
					try {
						return dfeApi.dfeResourceGetDfeById(ds, "1").getPayload();
					} catch (ApiException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return null;
				})
				.filter( l -> l != null)
				.collect(Collectors.toList());
			
			ExportToCsv.ExportDfeSummary(dfes);
			
			
			
		} catch (ApiException e) {
			System.out.println(e.getCode());
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			
			e.printStackTrace();
		}
	}
	
}
