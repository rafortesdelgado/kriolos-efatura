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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-23T13:33:35.367561143-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
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
   * Regista uma nova LED.
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
   * Regista uma nova LED.
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
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseLedDto> localVarReturnType = new GenericType<PayloadProcessingResponseLedDto>() {};
    return apiClient.invokeAPI("LedApi.ledResourceCreateLed", "/v1/led", "POST", new ArrayList<>(), saveLedDto,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Elimina uma LED sem DFEs associados.
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
   * Elimina uma LED sem DFEs associados.
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
    // Check required parameters
    if (ledCode == null) {
      throw new ApiException(400, "Missing the required parameter 'ledCode' when calling ledResourceDeleteLed");
    }

    // Path parameters
    String localVarPath = "/v1/led/{LedCode}"
            .replaceAll("\\{LedCode}", apiClient.escapeString(ledCode));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseBoolean> localVarReturnType = new GenericType<PayloadProcessingResponseBoolean>() {};
    return apiClient.invokeAPI("LedApi.ledResourceDeleteLed", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
    String localVarAccept = apiClient.selectHeaderAccept("application/json", "application/xml");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseListLedDto> localVarReturnType = new GenericType<PayloadProcessingResponseListLedDto>() {};
    return apiClient.invokeAPI("LedApi.ledResourceGetAllLeds", "/v1/led", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
    // Check required parameters
    if (ledCode == null) {
      throw new ApiException(400, "Missing the required parameter 'ledCode' when calling ledResourceGetLedByCode");
    }

    // Path parameters
    String localVarPath = "/v1/led/{LedCode}"
            .replaceAll("\\{LedCode}", apiClient.escapeString(ledCode));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseLedDto> localVarReturnType = new GenericType<PayloadProcessingResponseLedDto>() {};
    return apiClient.invokeAPI("LedApi.ledResourceGetLedByCode", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Atualiza uma LED.
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
   * Atualiza uma LED.
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
    // Check required parameters
    if (ledCode == null) {
      throw new ApiException(400, "Missing the required parameter 'ledCode' when calling ledResourceUpdateLed");
    }

    // Path parameters
    String localVarPath = "/v1/led/{LedCode}"
            .replaceAll("\\{LedCode}", apiClient.escapeString(ledCode));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseLedDto> localVarReturnType = new GenericType<PayloadProcessingResponseLedDto>() {};
    return apiClient.invokeAPI("LedApi.ledResourceUpdateLed", localVarPath, "PUT", new ArrayList<>(), saveLedDto,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
