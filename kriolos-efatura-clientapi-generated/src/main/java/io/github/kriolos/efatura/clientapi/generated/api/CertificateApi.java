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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-01T21:45:11.948946335-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
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
    // Check required parameters
    if (useType == null) {
      throw new ApiException(400, "Missing the required parameter 'useType' when calling certificateResourceGetKeystore");
    }
    if (cvEfRepositoryCode == null) {
      throw new ApiException(400, "Missing the required parameter 'cvEfRepositoryCode' when calling certificateResourceGetKeystore");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "UseType", useType)
    );

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseString> localVarReturnType = new GenericType<PayloadProcessingResponseString>() {};
    return apiClient.invokeAPI("CertificateApi.certificateResourceGetKeystore", "/v1/certificate/keystore", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
