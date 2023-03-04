package io.github.kriolos.efatura.service;

import java.util.HashMap;
import java.util.Map;

public class TokenManager {
	
	private String token;
	private static Map<Integer, String> _tokens = new HashMap<Integer,String>();
	
	static {
		_tokens.put(
				289308496, 
				"eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJkLUtDbmZlU2F0V0JoYnEtX2xST1d0bkRGbVdVRjJNYU1iNVk1SlJBam5rIn0.eyJleHAiOjE2Nzc5MzcxOTksImlhdCI6MTY3NzkzNjI5OSwiYXV0aF90aW1lIjoxNjc3OTM0MzQwLCJqdGkiOiJkYTBjNzQxZi0wOWQ1LTRlZmEtYTc1My03NDUwODNlNjg1YjEiLCJpc3MiOiJodHRwczovL2lhbS5lZmF0dXJhLmN2L2F1dGgvcmVhbG1zL3RheHBheWVycyIsImF1ZCI6ImVmYXR1cmEtYmFja2VuZCIsInN1YiI6ImI0MzZmMWM1LWVmODktNDQ5NS04MzYzLTBlN2I5ZTRmZDk0YSIsInR5cCI6IkJlYXJlciIsImF6cCI6ImVmYXR1cmEtZnJvbnRlbmQiLCJub25jZSI6IjZjOWU1ZjM2LWYwYTEtNDAyNS1hN2Y3LTQ4MGY2YmQ2Njk4OCIsInNlc3Npb25fc3RhdGUiOiJhZjgyNjJjOS1iNWYxLTQ0NDUtYjc1NS05OTQ3ZDA0OTUwZWUiLCJhY3IiOiIwIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJlZmF0dXJhLWJhY2tlbmQiOnsicm9sZXMiOlsiY3ZfZWZfZGZlX2FsbCIsImN2X2VmX3N3X3RtdF9jcmVhdGUiLCJjdl9lZl9zd19jdG1fYWxsIiwiY3ZfZWZfc3dfdG10X2FsbCIsImN2X2VmX3N3X2dtX2FsbCIsImN2X2VmX3N3X2N0bV9kZWxldGUiLCJjdl9lZl9sZWRfZGVsZXRlIiwiY3ZfZWZfZGZlX2RlbGV0ZSIsImN2X2VmX3N3X2N0bV91cGRhdGUiLCJjdl9lZl9zd190bXRfcmVhZCIsImN2X2VmX3N3X2N0bV9yZWFkIiwiY3ZfZWZfc3dfZ21fZGVsZXRlIiwiY3ZfZWZfZGZlX3JlYWRfc3RhdHMiLCJjdl9lZl9sZWRfdXBkYXRlIiwiY3ZfZWZfY2VydF9yZWFkIiwiY3ZfZWZfY2VydF9hbGwiLCJjdl9lZl90cF9zZWFyY2giLCJjdl9lZl9zd19hbGwiLCJjdl9lZl9zd19nbV91cGRhdGUiLCJjdl9lZl9ldmVudF9hbGwiLCJjdl9lZl9kZmVfcmVhZF9pdWQiLCJjdl9lZl9zd19nbV9yZWFkIiwiY3ZfZWZfc3dfZ21fY3JlYXRlIiwiY3ZfZWZfZXZlbnRfcmVhZCIsImN2X2VmX3N3X3RtdF9kZWxldGUiLCJUYXhQYXllciIsImN2X2VmX2V2ZW50X2NyZWF0ZSIsImN2X2VmX3N3X3RtdF91cGRhdGUiLCJjdl9lZl9zd19jdG1fY3JlYXRlIiwiY3ZfZWZfZGZlX2NyZWF0ZSIsImN2X2VmX2xlZF9hbGwiLCJjdl9lZl9sZWRfY3JlYXRlIiwiY3ZfZWZfZGZlX3JlYWRfbGlzdCIsImN2X2VmX3N3X3JlYWRfbGlzdCIsImN2X2VmX3RwX3VpX3JlYWQiLCJjdl9lZl9sZWRfcmVhZCIsImN2X2VmX3RwX2FsbCJdfX0sInNjb3BlIjoib3BlbmlkIHByb2ZpbGUgZW1haWwiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwibmFtZSI6IlNURUVMLCBTQVJMIiwicHJlZmVycmVkX3VzZXJuYW1lIjoiMjAwNTA1MTgxIiwiZ2l2ZW5fbmFtZSI6IlNURUVMLCBTQVJMIiwiZW1haWwiOiJ2YW5kby5zYW50b3NAc3RlZWwuY3YifQ.Vgsc4qHXColbmjMBOxU1FAqoj5vOoYiYrT3UnDmUutb3AfbL3FjjlVLGp9Ru7NUO5rjxaalgUvTmt1PJ_-Nqa3Bxnt07rbrZN_DoldB_hjjGj-33dd-4Op6y3AqINQwYMeaFzadepUcM8U4pQqd6GUgWG06aRyYtbkQI3EvDp6wWJUDKkZmkQDXNSGeNtJdY14DjXlO0WpaTQAKDEQseSy7QQ9DaztbGNv0QTdx8_mcMB-bpUMjh9hdVhMKsCtGCkH8ZJUCsZTPq6BEXwW9ug1eRlm2ryON0Hzxnh4ttffVQgD9p12QTHODHifjmyvXzYm6XniAfeYV9kRkWaA2HyQ");
		
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
