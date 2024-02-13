package io.github.kriolos.efatura.kriolosefaturaservice.services;

import java.util.HashMap;
import java.util.Map;

public class TokenManager {
	
	private String token;
	private static Map<Integer, String> _tokens = new HashMap<>();
	
	static {
		_tokens.put(
				289308496, 
				"eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJkLUtDbmZlU2F0V0JoYnEtX2xST1d0bkRGbVdVRjJNYU1iNVk1SlJBam5rIn0.eyJleHAiOjE2OTA4OTUxMDYsImlhdCI6MTY5MDg5NDIwNiwiYXV0aF90aW1lIjoxNjkwODk0MjA1LCJqdGkiOiI0OGYxNzg0OC1hN2NkLTRmNjgtYTk4ZS01ZWUwMDFlZGQ4ODMiLCJpc3MiOiJodHRwczovL2lhbS5lZmF0dXJhLmN2L2F1dGgvcmVhbG1zL3RheHBheWVycyIsImF1ZCI6ImVmYXR1cmEtYmFja2VuZCIsInN1YiI6ImVkMGM3MTk0LWJlNDAtNDQwNC1hOTVhLTAxZjY5YjE5OTVmOCIsInR5cCI6IkJlYXJlciIsImF6cCI6ImVmYXR1cmEtZnJvbnRlbmQiLCJub25jZSI6IjI3ODFhN2E0LWM5OWMtNDIxNy04YzM3LTNhMTMwNjNhNjhjNCIsInNlc3Npb25fc3RhdGUiOiIxMWNjZjQ2Yy1hZWE5LTQ0YzgtODdhYS1iYTNhYzJiZDk2N2UiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJlZmF0dXJhLWJhY2tlbmQiOnsicm9sZXMiOlsiY3ZfZWZfZGZlX2FsbCIsImN2X2VmX3N3X3RtdF9jcmVhdGUiLCJjdl9lZl9zd19jdG1fYWxsIiwiY3ZfZWZfc3dfdG10X2FsbCIsImN2X2VmX3N3X2dtX2FsbCIsImN2X2VmX3N3X2N0bV9kZWxldGUiLCJjdl9lZl9sZWRfZGVsZXRlIiwiY3ZfZWZfZGZlX2RlbGV0ZSIsImN2X2VmX3N3X2N0bV91cGRhdGUiLCJjdl9lZl9zd190bXRfcmVhZCIsImN2X2VmX3N3X2N0bV9yZWFkIiwiY3ZfZWZfc3dfZ21fZGVsZXRlIiwiY3ZfZWZfZGZlX3JlYWRfc3RhdHMiLCJjdl9lZl9sZWRfdXBkYXRlIiwiY3ZfZWZfY2VydF9yZWFkIiwiY3ZfZWZfY2VydF9hbGwiLCJjdl9lZl90cF9zZWFyY2giLCJjdl9lZl9zd19hbGwiLCJjdl9lZl9zd19nbV91cGRhdGUiLCJjdl9lZl9ldmVudF9hbGwiLCJjdl9lZl9kZmVfcmVhZF9pdWQiLCJjdl9lZl9zd19nbV9yZWFkIiwiY3ZfZWZfc3dfZ21fY3JlYXRlIiwiY3ZfZWZfZXZlbnRfcmVhZCIsImN2X2VmX3N3X3RtdF9kZWxldGUiLCJUYXhQYXllciIsImN2X2VmX2V2ZW50X2NyZWF0ZSIsImN2X2VmX3N3X3RtdF91cGRhdGUiLCJjdl9lZl9zd19jdG1fY3JlYXRlIiwiY3ZfZWZfZGZlX2NyZWF0ZSIsImN2X2VmX2xlZF9hbGwiLCJjdl9lZl9sZWRfY3JlYXRlIiwiY3ZfZWZfZGZlX3JlYWRfbGlzdCIsImN2X2VmX3N3X3JlYWRfbGlzdCIsImN2X2VmX3RwX3VpX3JlYWQiLCJjdl9lZl9sZWRfcmVhZCIsImN2X2VmX3RwX2FsbCJdfX0sInNjb3BlIjoib3BlbmlkIHByb2ZpbGUgZW1haWwiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwibmFtZSI6IlBBVklDQUJPIC0gSU1QT1JUQcOHw4NPIEUgQ09NRVJDSUFMSVpBw4fDg08gREUgTUFURVJJQUlTIERFIENPTlNUUlXDh8ODTywgTElNSVRBREEiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiIyNTc2ODM3OTgiLCJnaXZlbl9uYW1lIjoiUEFWSUNBQk8gLSBJTVBPUlRBw4fDg08gRSBDT01FUkNJQUxJWkHDh8ODTyBERSBNQVRFUklBSVMgREUgQ09OU1RSVcOHw4NPLCBMSU1JVEFEQSIsImVtYWlsIjoibmFkaWExOTg2c3ZAaG90bWFpbC5jb20ifQ.RDeshtNKN9nuGcLvVOCyAExXkoIuCGVm6oBJO6NSRI2UqDsebJaJfaDdWClXGSZROYBW45PCUCW5tfBIlmfIH-D1SEVFpOqyIMQ7rKl679bk5jBAXivMsTcE4VKeTFPaPs6R6fldj_3iXrvu-8T6u-CYdrouvCOgNeWmclHa2wpnLqtlIdkOEXW1gFKjXxSDvGElnyqluwaKlQSJ0i76dsebdX-hQyOOVJvZW61RJXab9oJp-qbjHZecoBT5zmwK52LavRfmO2E7BBp3unraAZtaNwMAC60gI7Nu7w67qq4xx3VaApwr_XKGVN5JzTSQrJCnqA4L8s2UpKhzNxYzqQ\r\n" + //
						"");
		
	}
	
	public TokenManager () {
		
	}
	
	public String getToken(int nif){
		return _tokens.get(nif);
	}
	
	public String getToken(String nif){
		int intNif = Integer.parseInt(nif);
		return getToken(intNif);
	}
	
//	public void initToken(String user, String password){
//		
//
//		try {
//			
////			Response interceptor = getHiddenToken();
//			
//			FormBody formBody = new FormBody.Builder()
//				      .add("username", user)
//				      .add("password", password)
//				      .add("credentialId", "")
//				      .build();
//			
//			String url = "iam.efatura.cv";
//			
//			HttpUrl httpUrl = new HttpUrl.Builder()
//				.host(url)
//				.addPathSegment("auth/realms/taxpayers/login-actions/authenticate")
//				.addQueryParameter("session_code", "lGo0teu1XFduT19PZLyafxE27L76NhaOyL_h5bMyJmk")
//				.addQueryParameter("execution", "5a21a34a-86c0-4e96-9bbd-08db20fc637d")
//				.addQueryParameter("session_code", "efatura-frontend")
//				.addQueryParameter("tab_id", "jB0fpddhJLM")
//				.scheme("https")
//				.build();
//			
//			Request request = new Request.Builder()
//				      .url(httpUrl.toString())
//				      .post(formBody)
//				      .build();
//			
//			Call call = client.newCall(request);
//			
//			Response response = call.execute();
//			
//			Headers headers = response.headers();
//			for( String s : headers.names() ) {
//				System.out.println(s + " " + headers.get(s));
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public Response getHiddenToken() {
//		try {
//			Request request = new Request.Builder()
//				      .url("https://pe.efatura.cv/")
//				      .build();
//			
//			Call call = client.newCall(request);
//			Response response = call.execute();
//			return response;
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		throw new RuntimeException("Failed to get login");
//	} 
}
