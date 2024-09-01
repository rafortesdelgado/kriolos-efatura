package io.github.kriolos.efatura.clientapi.generated.api;

import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiResponse;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.kriolos.efatura.clientapi.generated.model.DfeListPaginationResponse;
import io.github.kriolos.efatura.clientapi.generated.model.DfeListProcessingResponse;
import io.github.kriolos.efatura.clientapi.generated.model.DfeSelfBillingAuthorizeRequest;
import io.github.kriolos.efatura.clientapi.generated.model.EfEntriesProcessingResponse;
import java.io.File;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseDfe;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseDfeSelfBillingAuthorizeResponse;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseLong;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-23T13:33:35.367561143-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
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
   * Pedido de autorização para autofaturação.
   * 
   * @param cvEfRepositoryCode  (optional)
   * @param dfeSelfBillingAuthorizeRequest  (optional)
   * @return PayloadProcessingResponseDfeSelfBillingAuthorizeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseDfeSelfBillingAuthorizeResponse dfeResourceAuthorizeSelfBilling(String cvEfRepositoryCode, DfeSelfBillingAuthorizeRequest dfeSelfBillingAuthorizeRequest) throws ApiException {
    return dfeResourceAuthorizeSelfBillingWithHttpInfo(cvEfRepositoryCode, dfeSelfBillingAuthorizeRequest).getData();
  }

  /**
   * Pedido de autorização para autofaturação.
   * 
   * @param cvEfRepositoryCode  (optional)
   * @param dfeSelfBillingAuthorizeRequest  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseDfeSelfBillingAuthorizeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseDfeSelfBillingAuthorizeResponse> dfeResourceAuthorizeSelfBillingWithHttpInfo(String cvEfRepositoryCode, DfeSelfBillingAuthorizeRequest dfeSelfBillingAuthorizeRequest) throws ApiException {
    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseDfeSelfBillingAuthorizeResponse> localVarReturnType = new GenericType<PayloadProcessingResponseDfeSelfBillingAuthorizeResponse>() {};
    return apiClient.invokeAPI("DfeApi.dfeResourceAuthorizeSelfBilling", "/v1/dfe/self-billing/authorize", "POST", new ArrayList<>(), dfeSelfBillingAuthorizeRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<EfEntriesProcessingResponse> localVarReturnType = new GenericType<EfEntriesProcessingResponse>() {};
    return apiClient.invokeAPI("DfeApi.dfeResourceCreateDfe", "/v1/dfe", "POST", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
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
    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseLong> localVarReturnType = new GenericType<PayloadProcessingResponseLong>() {};
    return apiClient.invokeAPI("DfeApi.dfeResourceDeleteDfeEvent", "/v1/dfe", "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling dfeResourceGetDfeById");
    }

    // Path parameters
    String localVarPath = "/v1/dfe/{Id}"
            .replaceAll("\\{Id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseDfe> localVarReturnType = new GenericType<PayloadProcessingResponseDfe>() {};
    return apiClient.invokeAPI("DfeApi.dfeResourceGetDfeById", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling dfeResourceGetDfePdfById");
    }

    // Path parameters
    String localVarPath = "/v1/dfe/pdf/{Id}"
            .replaceAll("\\{Id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseString> localVarReturnType = new GenericType<PayloadProcessingResponseString>() {};
    return apiClient.invokeAPI("DfeApi.dfeResourceGetDfePdfById", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "AuthorizedDateEnd", authorizedDateEnd)
    );
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

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<DfeListProcessingResponse> localVarReturnType = new GenericType<DfeListProcessingResponse>() {};
    return apiClient.invokeAPI("DfeApi.dfeResourceGetDfeSummaryListV1", "/v1/dfe", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "AuthorizedDateEnd", authorizedDateEnd)
    );
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

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<DfeListPaginationResponse> localVarReturnType = new GenericType<DfeListPaginationResponse>() {};
    return apiClient.invokeAPI("DfeApi.dfeResourceGetDfeSummaryListV2", "/v2/dfe", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling dfeResourceGetDfeXmlById");
    }

    // Path parameters
    String localVarPath = "/v1/dfe/xml/{Id}"
            .replaceAll("\\{Id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseString> localVarReturnType = new GenericType<PayloadProcessingResponseString>() {};
    return apiClient.invokeAPI("DfeApi.dfeResourceGetDfeXmlById", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}