//package io.github.kriolos.efatura.service;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import io.github.kriolos.efatura.clientapi.generated.model.DfeListPaginationResponse;
//import io.github.kriolos.efatura.clientapi.generated.model.DfeListProcessingResponse;
//import io.github.kriolos.efatura.clientapi.generated.model.DfeSummary;
//import okhttp3.Call;
//import okhttp3.Response;
//import okhttp3.ResponseBody;
//
//public class DfeGetSummaryOkHttpCallback implements okhttp3.Callback {
//
//	@Override
//	public void onResponse(Call arg0, Response arg1) throws IOException {
//		
//		if(arg1.code() == 200) {
//			System.out.println(arg1.code());
//			ResponseBody body = arg1.body();
//			System.out.println(body.contentLength());
//			String bodyValue = body.string();
//			System.out.println(bodyValue);
////			System.out.println(body.string());
//			DfeListPaginationResponse result = DfeListPaginationResponse.fromJson(bodyValue);
////			DfeListProcessingResponse result = JSON.getGson()
////					.fromJson(body.string(), DfeListProcessingResponse.class);
//			System.out.println(result.getPayload().getItems().size());
//			
//			for (  Object o : result.getPayload().getItems()) {
//				System.out.println(o);
//			}
//			List<DfeSummary>  list = result.getPayload().getItems().stream()
////            .filter(DfeSummary.class::isInstance)
//            .map( d -> {
//				try {
//					return DfeSummary.fromJson(d.toString());
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				return null;
//			})
//            .collect(Collectors.toList());
//			
//			ExportToCsv.ExportDfeSummary(list);;
//		}
//	}
//	
//	@Override
//	public void onFailure(Call arg0, IOException arg1) {
//		System.out.println("onFailure");
//		
//	}
//}
