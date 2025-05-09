package io.github.kriolos.efatura.clientapi.generated.api;

import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiResponse;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.Pair;

import jakarta.ws.rs.core.GenericType;

import java.io.File;
import io.github.kriolos.efatura.clientapi.generated.model.OpaccAccountantCustomerCreateDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseListOpaccAccountantCustomerDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseListOpaccAccountantDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseOpaccAccountantCustomerDto;
import io.github.kriolos.efatura.clientapi.generated.model.ProcessingResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-09T10:25:28.475671412-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
public class OpaccApi {
  private ApiClient apiClient;

  public OpaccApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OpaccApi(ApiClient apiClient) {
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
   * Regista um contribuinte como um cliente de um contabilista certificado.
   * 
   * @param opaccAccountantCustomerCreateDto  (optional)
   * @return PayloadProcessingResponseOpaccAccountantCustomerDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseOpaccAccountantCustomerDto opaccResourceCreateAccountantCustomer(OpaccAccountantCustomerCreateDto opaccAccountantCustomerCreateDto) throws ApiException {
    return opaccResourceCreateAccountantCustomerWithHttpInfo(opaccAccountantCustomerCreateDto).getData();
  }

  /**
   * Regista um contribuinte como um cliente de um contabilista certificado.
   * 
   * @param opaccAccountantCustomerCreateDto  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseOpaccAccountantCustomerDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseOpaccAccountantCustomerDto> opaccResourceCreateAccountantCustomerWithHttpInfo(OpaccAccountantCustomerCreateDto opaccAccountantCustomerCreateDto) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseOpaccAccountantCustomerDto> localVarReturnType = new GenericType<PayloadProcessingResponseOpaccAccountantCustomerDto>() {};
    return apiClient.invokeAPI("OpaccApi.opaccResourceCreateAccountantCustomer", "/v1/opacc/accountant-customer", "POST", new ArrayList<>(), opaccAccountantCustomerCreateDto,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Elimina um contribuinte como um cliente de um contabilista certificado.
   * 
   * @param customerId  (required)
   * @return ProcessingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ProcessingResponse opaccResourceDeleteAccountantCustomer(String customerId) throws ApiException {
    return opaccResourceDeleteAccountantCustomerWithHttpInfo(customerId).getData();
  }

  /**
   * Elimina um contribuinte como um cliente de um contabilista certificado.
   * 
   * @param customerId  (required)
   * @return ApiResponse&lt;ProcessingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProcessingResponse> opaccResourceDeleteAccountantCustomerWithHttpInfo(String customerId) throws ApiException {
    // Check required parameters
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling opaccResourceDeleteAccountantCustomer");
    }

    // Path parameters
    String localVarPath = "/v1/opacc/accountant-customer/{CustomerId}"
            .replaceAll("\\{CustomerId}", apiClient.escapeString(customerId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<ProcessingResponse> localVarReturnType = new GenericType<ProcessingResponse>() {};
    return apiClient.invokeAPI("OpaccApi.opaccResourceDeleteAccountantCustomer", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista de contribuintes que são clientes do contabilista certificado representado pelo utilizador autenticado.
   * 
   * @return PayloadProcessingResponseListOpaccAccountantCustomerDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseListOpaccAccountantCustomerDto opaccResourceGetAccountantCustomers() throws ApiException {
    return opaccResourceGetAccountantCustomersWithHttpInfo().getData();
  }

  /**
   * Lista de contribuintes que são clientes do contabilista certificado representado pelo utilizador autenticado.
   * 
   * @return ApiResponse&lt;PayloadProcessingResponseListOpaccAccountantCustomerDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseListOpaccAccountantCustomerDto> opaccResourceGetAccountantCustomersWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseListOpaccAccountantCustomerDto> localVarReturnType = new GenericType<PayloadProcessingResponseListOpaccAccountantCustomerDto>() {};
    return apiClient.invokeAPI("OpaccApi.opaccResourceGetAccountantCustomers", "/v1/opacc/accountant-customer", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista Nacional de Auditores e Contabilistas Certificados Autorizados.
   * 
   * @return PayloadProcessingResponseListOpaccAccountantDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseListOpaccAccountantDto opaccResourceGetAccountants() throws ApiException {
    return opaccResourceGetAccountantsWithHttpInfo().getData();
  }

  /**
   * Lista Nacional de Auditores e Contabilistas Certificados Autorizados.
   * 
   * @return ApiResponse&lt;PayloadProcessingResponseListOpaccAccountantDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseListOpaccAccountantDto> opaccResourceGetAccountantsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseListOpaccAccountantDto> localVarReturnType = new GenericType<PayloadProcessingResponseListOpaccAccountantDto>() {};
    return apiClient.invokeAPI("OpaccApi.opaccResourceGetAccountants", "/v1/opacc/accountant-list", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Carrega na PE a Lista Nacional de Auditores e Contabilistas Certificados Autorizados.
   * 
   * @param _file  (optional)
   * @return ProcessingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ProcessingResponse opaccResourceUploadAccountants(File _file) throws ApiException {
    return opaccResourceUploadAccountantsWithHttpInfo(_file).getData();
  }

  /**
   * Carrega na PE a Lista Nacional de Auditores e Contabilistas Certificados Autorizados.
   * 
   * @param _file  (optional)
   * @return ApiResponse&lt;ProcessingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProcessingResponse> opaccResourceUploadAccountantsWithHttpInfo(File _file) throws ApiException {
    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<ProcessingResponse> localVarReturnType = new GenericType<ProcessingResponse>() {};
    return apiClient.invokeAPI("OpaccApi.opaccResourceUploadAccountants", "/v1/opacc/accountant-list", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
