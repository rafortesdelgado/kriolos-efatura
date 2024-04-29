package io.github.kriolos.efatura.clientapi.generated.api;

import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiResponse;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseListSearchTaxPayerResponseDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T17:20:58.717987600-01:00[Atlantic/Cape_Verde]")
public class TaxpayerApi {
  private ApiClient apiClient;

  public TaxpayerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TaxpayerApi(ApiClient apiClient) {
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
   * Pesquisa contribuintes por NIF e/ou Nome.
   * 
   * @param name Nome de contribuinte. Apenas letras, números e espaços. (optional)
   * @param taxId NIF CV de contribuinte. 9 dígitos. (optional)
   * @param type Tipo de contribuinte: S&#x3D;Singular; C&#x3D;Coletivo; N&#x3D;Entidade Nacional; E&#x3D;Entidade Estrangeira; F&#x3D;Fundo de Investimento; H&#x3D;Herança; O&#x3D;Outra Entidade. (optional)
   * @return PayloadProcessingResponseListSearchTaxPayerResponseDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseListSearchTaxPayerResponseDto taxPayerResourceSearch(String name, String taxId, String type) throws ApiException {
    return taxPayerResourceSearchWithHttpInfo(name, taxId, type).getData();
  }

  /**
   * Pesquisa contribuintes por NIF e/ou Nome.
   * 
   * @param name Nome de contribuinte. Apenas letras, números e espaços. (optional)
   * @param taxId NIF CV de contribuinte. 9 dígitos. (optional)
   * @param type Tipo de contribuinte: S&#x3D;Singular; C&#x3D;Coletivo; N&#x3D;Entidade Nacional; E&#x3D;Entidade Estrangeira; F&#x3D;Fundo de Investimento; H&#x3D;Herança; O&#x3D;Outra Entidade. (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseListSearchTaxPayerResponseDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseListSearchTaxPayerResponseDto> taxPayerResourceSearchWithHttpInfo(String name, String taxId, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/taxpayer/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "TaxId", taxId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "SecurityScheme" };

    GenericType<PayloadProcessingResponseListSearchTaxPayerResponseDto> localVarReturnType = new GenericType<PayloadProcessingResponseListSearchTaxPayerResponseDto>() {};

    return apiClient.invokeAPI("TaxpayerApi.taxPayerResourceSearch", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
