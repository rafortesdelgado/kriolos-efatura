//package io.github.kriolos.efatura.service.callback;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import io.github.kriolos.efatura.clientapi.generated.ApiCallback;
//import io.github.kriolos.efatura.clientapi.generated.ApiException;
//import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;
//import io.github.kriolos.efatura.clientapi.generated.model.Dfe;
//import io.github.kriolos.efatura.clientapi.generated.model.DfeListPaginationResponse;
//import io.github.kriolos.efatura.clientapi.generated.model.DfeListProcessingResponse;
//import io.github.kriolos.efatura.clientapi.generated.model.DfeSummary;
//import io.github.kriolos.efatura.service.ExportToCsv;
//
//public class DfeListPaginationResponseCallback implements ApiCallback<DfeListPaginationResponse> {
//
//	private DfeApi dfeApi;
//	public DfeListPaginationResponseCallback(DfeApi dfeApi) {
//		this.dfeApi = dfeApi;
//	}
//
//	@Override
//	public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void onSuccess(DfeListPaginationResponse result, int statusCode, Map<String, List<String>> responseHeaders) {
//		List<DfeSummary> list = result.getPayload().getItems().stream()
//				.map(d -> {
//					try {
//						return DfeSummary.fromJson(d.toString());
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					return null;
//				}).collect(Collectors.toList());
//		
//		PayloadProcessingResponseDfeCallback dfeByIdCallback = new PayloadProcessingResponseDfeCallback();
//		list.stream()
//			.parallel()
//			.forEach( ds -> {
//				try {
//					dfeApi.dfeResourceGetDfeByIdAsync(ds.getId(), "1",dfeByIdCallback);
//				} catch (ApiException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			});
//		
//		ExportToCsv.ExportDfeSummary(list);
//
//	}
//
//	@Override
//	public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
//		// TODO Auto-generated method stub
//
//	}
//}
