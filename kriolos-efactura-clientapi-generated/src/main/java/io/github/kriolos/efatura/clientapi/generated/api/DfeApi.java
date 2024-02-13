package io.github.kriolos.efatura.clientapi.generated.api;

import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiResponse;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.kriolos.efatura.clientapi.generated.model.DfeListPaginationResponse;
import io.github.kriolos.efatura.clientapi.generated.model.DfeListProcessingResponse;
import io.github.kriolos.efatura.clientapi.generated.model.EfEntriesProcessingResponse;
import java.io.File;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseDfe;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseLong;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T18:43:44.521602200-01:00[Atlantic/Cape_Verde]")
public class DfeApi {
  private ApiClient apiClient;

  public DfeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DfeApi(ApiClient apiClient) {
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
   * Comunicação de novos DFEs.
   * 
   * @param cvEfRepositoryCode  (optional)
   * @param _file  (optional)
   * @return EfEntriesProcessingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public EfEntriesProcessingResponse dfeResourceCreateDfe(String cvEfRepositoryCode, File _file) throws ApiException {
    return dfeResourceCreateDfeWithHttpInfo(cvEfRepositoryCode, _file).getData();
  }

  /**
   * Comunicação de novos DFEs.
   * 
   * @param cvEfRepositoryCode  (optional)
   * @param _file  (optional)
   * @return ApiResponse&lt;EfEntriesProcessingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EfEntriesProcessingResponse> dfeResourceCreateDfeWithHttpInfo(String cvEfRepositoryCode, File _file) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/dfe";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (cvEfRepositoryCode != null)
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));

    
    if (_file != null)
      localVarFormParams.put("file", _file);

    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<EfEntriesProcessingResponse> localVarReturnType = new GenericType<EfEntriesProcessingResponse>() {};

    return apiClient.invokeAPI("DfeApi.dfeResourceCreateDfe", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Elimina todos os DFEs e os respetivos eventos no repositório de Homologação/Teste.
   * 
   * @param cvEfRepositoryCode  (optional)
   * @return PayloadProcessingResponseLong
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseLong dfeResourceDeleteDfeEvent(String cvEfRepositoryCode) throws ApiException {
    return dfeResourceDeleteDfeEventWithHttpInfo(cvEfRepositoryCode).getData();
  }

  /**
   * Elimina todos os DFEs e os respetivos eventos no repositório de Homologação/Teste.
   * 
   * @param cvEfRepositoryCode  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseLong&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseLong> dfeResourceDeleteDfeEventWithHttpInfo(String cvEfRepositoryCode) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/dfe";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (cvEfRepositoryCode != null)
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<PayloadProcessingResponseLong> localVarReturnType = new GenericType<PayloadProcessingResponseLong>() {};

    return apiClient.invokeAPI("DfeApi.dfeResourceDeleteDfeEvent", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Consulta de DFE com IUD.
   * 
   * @param id  (required)
   * @param cvEfRepositoryCode  (optional)
   * @return PayloadProcessingResponseDfe
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseDfe dfeResourceGetDfeById(String id, String cvEfRepositoryCode) throws ApiException {
    return dfeResourceGetDfeByIdWithHttpInfo(id, cvEfRepositoryCode).getData();
  }

  /**
   * Consulta de DFE com IUD.
   * 
   * @param id  (required)
   * @param cvEfRepositoryCode  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseDfe&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseDfe> dfeResourceGetDfeByIdWithHttpInfo(String id, String cvEfRepositoryCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling dfeResourceGetDfeById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/dfe/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (cvEfRepositoryCode != null)
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<PayloadProcessingResponseDfe> localVarReturnType = new GenericType<PayloadProcessingResponseDfe>() {};

    return apiClient.invokeAPI("DfeApi.dfeResourceGetDfeById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Consulta de PDF de um DFE com IUD.
   * 
   * @param id  (required)
   * @param cvEfRepositoryCode  (optional)
   * @return PayloadProcessingResponseString
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseString dfeResourceGetDfePdfById(String id, String cvEfRepositoryCode) throws ApiException {
    return dfeResourceGetDfePdfByIdWithHttpInfo(id, cvEfRepositoryCode).getData();
  }

  /**
   * Consulta de PDF de um DFE com IUD.
   * 
   * @param id  (required)
   * @param cvEfRepositoryCode  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseString&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseString> dfeResourceGetDfePdfByIdWithHttpInfo(String id, String cvEfRepositoryCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling dfeResourceGetDfePdfById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/dfe/pdf/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (cvEfRepositoryCode != null)
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<PayloadProcessingResponseString> localVarReturnType = new GenericType<PayloadProcessingResponseString>() {};

    return apiClient.invokeAPI("DfeApi.dfeResourceGetDfePdfById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista de DFEs limitada em 10000 DFEs.
   * 
   * @param authorizedDateEnd  (optional)
   * @param authorizedDateStart  (optional)
   * @param documentNumber  (optional)
   * @param documentTypeCodes  (optional)
   * @param emitterTaxId  (optional)
   * @param IUD  (optional)
   * @param isCanceled  (optional)
   * @param issueDirection  (optional)
   * @param issueYear  (optional)
   * @param ledCode  (optional)
   * @param receiverTaxId  (optional)
   * @param receiverTaxIdCountryCode  (optional)
   * @param cvEfRepositoryCode  (optional)
   * @return DfeListProcessingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public DfeListProcessingResponse dfeResourceGetDfeSummaryListV1(String authorizedDateEnd, String authorizedDateStart, String documentNumber, String documentTypeCodes, String emitterTaxId, String IUD, String isCanceled, String issueDirection, String issueYear, String ledCode, String receiverTaxId, String receiverTaxIdCountryCode, String cvEfRepositoryCode) throws ApiException {
    return dfeResourceGetDfeSummaryListV1WithHttpInfo(authorizedDateEnd, authorizedDateStart, documentNumber, documentTypeCodes, emitterTaxId, IUD, isCanceled, issueDirection, issueYear, ledCode, receiverTaxId, receiverTaxIdCountryCode, cvEfRepositoryCode).getData();
  }

  /**
   * Lista de DFEs limitada em 10000 DFEs.
   * 
   * @param authorizedDateEnd  (optional)
   * @param authorizedDateStart  (optional)
   * @param documentNumber  (optional)
   * @param documentTypeCodes  (optional)
   * @param emitterTaxId  (optional)
   * @param IUD  (optional)
   * @param isCanceled  (optional)
   * @param issueDirection  (optional)
   * @param issueYear  (optional)
   * @param ledCode  (optional)
   * @param receiverTaxId  (optional)
   * @param receiverTaxIdCountryCode  (optional)
   * @param cvEfRepositoryCode  (optional)
   * @return ApiResponse&lt;DfeListProcessingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DfeListProcessingResponse> dfeResourceGetDfeSummaryListV1WithHttpInfo(String authorizedDateEnd, String authorizedDateStart, String documentNumber, String documentTypeCodes, String emitterTaxId, String IUD, String isCanceled, String issueDirection, String issueYear, String ledCode, String receiverTaxId, String receiverTaxIdCountryCode, String cvEfRepositoryCode) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/dfe";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "AuthorizedDateEnd", authorizedDateEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "AuthorizedDateStart", authorizedDateStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DocumentNumber", documentNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DocumentTypeCodes", documentTypeCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "EmitterTaxId", emitterTaxId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IUD", IUD));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IsCanceled", isCanceled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IssueDirection", issueDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IssueYear", issueYear));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "LedCode", ledCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ReceiverTaxId", receiverTaxId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ReceiverTaxIdCountryCode", receiverTaxIdCountryCode));

    if (cvEfRepositoryCode != null)
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<DfeListProcessingResponse> localVarReturnType = new GenericType<DfeListProcessingResponse>() {};

    return apiClient.invokeAPI("DfeApi.dfeResourceGetDfeSummaryListV1", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista de DFEs que suporta paginação.
   * 
   * @param authorizedDateEnd  (optional)
   * @param authorizedDateStart  (optional)
   * @param documentNumber  (optional)
   * @param documentTypeCodes  (optional)
   * @param emitterTaxId  (optional)
   * @param IUD  (optional)
   * @param isCanceled  (optional)
   * @param issueDirection  (optional)
   * @param issueYear  (optional)
   * @param itemsPerPage  (optional)
   * @param ledCode  (optional)
   * @param page  (optional)
   * @param receiverTaxId  (optional)
   * @param receiverTaxIdCountryCode  (optional)
   * @param cvEfRepositoryCode  (optional)
   * @return DfeListPaginationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public DfeListPaginationResponse dfeResourceGetDfeSummaryListV2(String authorizedDateEnd, String authorizedDateStart, String documentNumber, String documentTypeCodes, String emitterTaxId, String IUD, String isCanceled, String issueDirection, String issueYear, String itemsPerPage, String ledCode, String page, String receiverTaxId, String receiverTaxIdCountryCode, String cvEfRepositoryCode) throws ApiException {
    return dfeResourceGetDfeSummaryListV2WithHttpInfo(authorizedDateEnd, authorizedDateStart, documentNumber, documentTypeCodes, emitterTaxId, IUD, isCanceled, issueDirection, issueYear, itemsPerPage, ledCode, page, receiverTaxId, receiverTaxIdCountryCode, cvEfRepositoryCode).getData();
  }

  /**
   * Lista de DFEs que suporta paginação.
   * 
   * @param authorizedDateEnd  (optional)
   * @param authorizedDateStart  (optional)
   * @param documentNumber  (optional)
   * @param documentTypeCodes  (optional)
   * @param emitterTaxId  (optional)
   * @param IUD  (optional)
   * @param isCanceled  (optional)
   * @param issueDirection  (optional)
   * @param issueYear  (optional)
   * @param itemsPerPage  (optional)
   * @param ledCode  (optional)
   * @param page  (optional)
   * @param receiverTaxId  (optional)
   * @param receiverTaxIdCountryCode  (optional)
   * @param cvEfRepositoryCode  (optional)
   * @return ApiResponse&lt;DfeListPaginationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DfeListPaginationResponse> dfeResourceGetDfeSummaryListV2WithHttpInfo(String authorizedDateEnd, String authorizedDateStart, String documentNumber, String documentTypeCodes, String emitterTaxId, String IUD, String isCanceled, String issueDirection, String issueYear, String itemsPerPage, String ledCode, String page, String receiverTaxId, String receiverTaxIdCountryCode, String cvEfRepositoryCode) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/dfe";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "AuthorizedDateEnd", authorizedDateEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "AuthorizedDateStart", authorizedDateStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DocumentNumber", documentNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DocumentTypeCodes", documentTypeCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "EmitterTaxId", emitterTaxId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IUD", IUD));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IsCanceled", isCanceled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IssueDirection", issueDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IssueYear", issueYear));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ItemsPerPage", itemsPerPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "LedCode", ledCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ReceiverTaxId", receiverTaxId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ReceiverTaxIdCountryCode", receiverTaxIdCountryCode));

    if (cvEfRepositoryCode != null)
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<DfeListPaginationResponse> localVarReturnType = new GenericType<DfeListPaginationResponse>() {};

    return apiClient.invokeAPI("DfeApi.dfeResourceGetDfeSummaryListV2", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Consulta de XML com IUD exatamente como foi gerado e assinado pelo contribuinte e com aposição de timestamp.
   * 
   * @param id  (required)
   * @param cvEfRepositoryCode  (optional)
   * @return PayloadProcessingResponseString
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseString dfeResourceGetDfeXmlById(String id, String cvEfRepositoryCode) throws ApiException {
    return dfeResourceGetDfeXmlByIdWithHttpInfo(id, cvEfRepositoryCode).getData();
  }

  /**
   * Consulta de XML com IUD exatamente como foi gerado e assinado pelo contribuinte e com aposição de timestamp.
   * 
   * @param id  (required)
   * @param cvEfRepositoryCode  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseString&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseString> dfeResourceGetDfeXmlByIdWithHttpInfo(String id, String cvEfRepositoryCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling dfeResourceGetDfeXmlById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/dfe/xml/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (cvEfRepositoryCode != null)
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<PayloadProcessingResponseString> localVarReturnType = new GenericType<PayloadProcessingResponseString>() {};

    return apiClient.invokeAPI("DfeApi.dfeResourceGetDfeXmlById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
