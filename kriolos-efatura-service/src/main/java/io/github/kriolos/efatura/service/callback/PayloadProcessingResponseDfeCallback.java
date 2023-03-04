//package io.github.kriolos.efatura.service.callback;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import io.github.kriolos.efatura.clientapi.generated.ApiCallback;
//import io.github.kriolos.efatura.clientapi.generated.ApiException;
//import io.github.kriolos.efatura.clientapi.generated.model.Dfe;
//import io.github.kriolos.efatura.clientapi.generated.model.DfeListPaginationResponse;
//import io.github.kriolos.efatura.clientapi.generated.model.DfeListProcessingResponse;
//import io.github.kriolos.efatura.clientapi.generated.model.DfeSummary;
//import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseDfe;
//import io.github.kriolos.efatura.service.ExportToCsv;
//
//public class PayloadProcessingResponseDfeCallback implements ApiCallback<PayloadProcessingResponseDfe> {
//
//	@Override
//	public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void onSuccess(PayloadProcessingResponseDfe result, int statusCode,
//			Map<String, List<String>> responseHeaders) {
//		System.out.println(result.getPayload().toJson());
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
//	
//}
