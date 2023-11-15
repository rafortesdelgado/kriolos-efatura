package io.github.kriolos.efatura.clientapi.generated.api;

import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiResponse;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T16:59:08.260554600-01:00[Atlantic/Cape_Verde]")
public class CertificateApi {
  private ApiClient apiClient;

  public CertificateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CertificateApi(ApiClient apiClient) {
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
   * Consulta de keystore.
   * 
   * @param useType Tipo de Uso de Certificado: SIGN&#x3D;Assinatura Qualificada; TLS&#x3D;Autenticação TLS Mútua. (required)
   * @param cvEfRepositoryCode Código de Repositório: 1-Principal; 2-Homologação; 3-Teste. (required)
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
  public PayloadProcessingResponseString certificateResourceGetKeystore(String useType, String cvEfRepositoryCode) throws ApiException {
    return certificateResourceGetKeystoreWithHttpInfo(useType, cvEfRepositoryCode).getData();
  }

  /**
   * Consulta de keystore.
   * 
   * @param useType Tipo de Uso de Certificado: SIGN&#x3D;Assinatura Qualificada; TLS&#x3D;Autenticação TLS Mútua. (required)
   * @param cvEfRepositoryCode Código de Repositório: 1-Principal; 2-Homologação; 3-Teste. (required)
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
  public ApiResponse<PayloadProcessingResponseString> certificateResourceGetKeystoreWithHttpInfo(String useType, String cvEfRepositoryCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'useType' is set
    if (useType == null) {
      throw new ApiException(400, "Missing the required parameter 'useType' when calling certificateResourceGetKeystore");
    }
    
    // verify the required parameter 'cvEfRepositoryCode' is set
    if (cvEfRepositoryCode == null) {
      throw new ApiException(400, "Missing the required parameter 'cvEfRepositoryCode' when calling certificateResourceGetKeystore");
    }
    
    // create path and map variables
    String localVarPath = "/v1/certificate/keystore";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "UseType", useType));

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

    return apiClient.invokeAPI("CertificateApi.certificateResourceGetKeystore", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
