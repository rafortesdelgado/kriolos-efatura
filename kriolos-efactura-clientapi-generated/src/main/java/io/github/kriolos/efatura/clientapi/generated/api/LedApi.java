package io.github.kriolos.efatura.clientapi.generated.api;

import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiResponse;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseBoolean;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseLedDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseListLedDto;
import io.github.kriolos.efatura.clientapi.generated.model.SaveLedDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T16:59:08.260554600-01:00[Atlantic/Cape_Verde]")
public class LedApi {
  private ApiClient apiClient;

  public LedApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LedApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Regista um novo LED.
   * 
   * @param saveLedDto  (optional)
   * @return PayloadProcessingResponseLedDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseLedDto ledResourceCreateLed(SaveLedDto saveLedDto) throws ApiException {
    return ledResourceCreateLedWithHttpInfo(saveLedDto).getData();
  }

  /**
   * Regista um novo LED.
   * 
   * @param saveLedDto  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseLedDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseLedDto> ledResourceCreateLedWithHttpInfo(SaveLedDto saveLedDto) throws ApiException {
    Object localVarPostBody = saveLedDto;
    
    // create path and map variables
    String localVarPath = "/v1/led";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<PayloadProcessingResponseLedDto> localVarReturnType = new GenericType<PayloadProcessingResponseLedDto>() {};

    return apiClient.invokeAPI("LedApi.ledResourceCreateLed", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Elimina um LED sem DFEs associados.
   * 
   * @param ledCode  (required)
   * @return PayloadProcessingResponseBoolean
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseBoolean ledResourceDeleteLed(String ledCode) throws ApiException {
    return ledResourceDeleteLedWithHttpInfo(ledCode).getData();
  }

  /**
   * Elimina um LED sem DFEs associados.
   * 
   * @param ledCode  (required)
   * @return ApiResponse&lt;PayloadProcessingResponseBoolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseBoolean> ledResourceDeleteLedWithHttpInfo(String ledCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ledCode' is set
    if (ledCode == null) {
      throw new ApiException(400, "Missing the required parameter 'ledCode' when calling ledResourceDeleteLed");
    }
    
    // create path and map variables
    String localVarPath = "/v1/led/{LedCode}"
      .replaceAll("\\{" + "LedCode" + "\\}", apiClient.escapeString(ledCode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<PayloadProcessingResponseBoolean> localVarReturnType = new GenericType<PayloadProcessingResponseBoolean>() {};

    return apiClient.invokeAPI("LedApi.ledResourceDeleteLed", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista de LEDs.
   * 
   * @return PayloadProcessingResponseListLedDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseListLedDto ledResourceGetAllLeds() throws ApiException {
    return ledResourceGetAllLedsWithHttpInfo().getData();
  }

  /**
   * Lista de LEDs.
   * 
   * @return ApiResponse&lt;PayloadProcessingResponseListLedDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseListLedDto> ledResourceGetAllLedsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/led";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<PayloadProcessingResponseListLedDto> localVarReturnType = new GenericType<PayloadProcessingResponseListLedDto>() {};

    return apiClient.invokeAPI("LedApi.ledResourceGetAllLeds", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Consulta de LED com código.
   * 
   * @param ledCode  (required)
   * @return PayloadProcessingResponseLedDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseLedDto ledResourceGetLedByCode(String ledCode) throws ApiException {
    return ledResourceGetLedByCodeWithHttpInfo(ledCode).getData();
  }

  /**
   * Consulta de LED com código.
   * 
   * @param ledCode  (required)
   * @return ApiResponse&lt;PayloadProcessingResponseLedDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseLedDto> ledResourceGetLedByCodeWithHttpInfo(String ledCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ledCode' is set
    if (ledCode == null) {
      throw new ApiException(400, "Missing the required parameter 'ledCode' when calling ledResourceGetLedByCode");
    }
    
    // create path and map variables
    String localVarPath = "/v1/led/{LedCode}"
      .replaceAll("\\{" + "LedCode" + "\\}", apiClient.escapeString(ledCode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<PayloadProcessingResponseLedDto> localVarReturnType = new GenericType<PayloadProcessingResponseLedDto>() {};

    return apiClient.invokeAPI("LedApi.ledResourceGetLedByCode", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Atualiza um LED.
   * 
   * @param ledCode  (required)
   * @param saveLedDto  (optional)
   * @return PayloadProcessingResponseLedDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseLedDto ledResourceUpdateLed(String ledCode, SaveLedDto saveLedDto) throws ApiException {
    return ledResourceUpdateLedWithHttpInfo(ledCode, saveLedDto).getData();
  }

  /**
   * Atualiza um LED.
   * 
   * @param ledCode  (required)
   * @param saveLedDto  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseLedDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseLedDto> ledResourceUpdateLedWithHttpInfo(String ledCode, SaveLedDto saveLedDto) throws ApiException {
    Object localVarPostBody = saveLedDto;
    
    // verify the required parameter 'ledCode' is set
    if (ledCode == null) {
      throw new ApiException(400, "Missing the required parameter 'ledCode' when calling ledResourceUpdateLed");
    }
    
    // create path and map variables
    String localVarPath = "/v1/led/{LedCode}"
      .replaceAll("\\{" + "LedCode" + "\\}", apiClient.escapeString(ledCode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<PayloadProcessingResponseLedDto> localVarReturnType = new GenericType<PayloadProcessingResponseLedDto>() {};

    return apiClient.invokeAPI("LedApi.ledResourceUpdateLed", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
