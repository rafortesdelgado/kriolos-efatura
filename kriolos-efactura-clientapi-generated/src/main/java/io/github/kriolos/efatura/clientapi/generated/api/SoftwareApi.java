package io.github.kriolos.efatura.clientapi.generated.api;

import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiResponse;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseBoolean;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseListSoftwareCustomerDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseListSoftwareDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseListSoftwareGroupMemberDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseListSoftwareTransmitterDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseSoftwareCustomerDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseSoftwareCustomerEntity;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseSoftwareGroupMemberDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseSoftwareGroupMemberEntity;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseSoftwareTransmitterDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseSoftwareTransmitterEntity;
import io.github.kriolos.efatura.clientapi.generated.model.SoftwareCustomerEntity;
import io.github.kriolos.efatura.clientapi.generated.model.SoftwareGroupMemberEntity;
import io.github.kriolos.efatura.clientapi.generated.model.SoftwareTransmitterEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T17:20:58.717987600-01:00[Atlantic/Cape_Verde]")
public class SoftwareApi {
  private ApiClient apiClient;

  public SoftwareApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SoftwareApi(ApiClient apiClient) {
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
   * Regista um novo contribuinte cliente de software.
   * 
   * @param softwareCustomerEntity  (optional)
   * @return PayloadProcessingResponseSoftwareCustomerEntity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareCustomerEntity softwareResourceCreateSoftwareCustomer(SoftwareCustomerEntity softwareCustomerEntity) throws ApiException {
    return softwareResourceCreateSoftwareCustomerWithHttpInfo(softwareCustomerEntity).getData();
  }

  /**
   * Regista um novo contribuinte cliente de software.
   * 
   * @param softwareCustomerEntity  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareCustomerEntity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareCustomerEntity> softwareResourceCreateSoftwareCustomerWithHttpInfo(SoftwareCustomerEntity softwareCustomerEntity) throws ApiException {
    Object localVarPostBody = softwareCustomerEntity;
    
    // create path and map variables
    String localVarPath = "/v1/software/customer";

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

    GenericType<PayloadProcessingResponseSoftwareCustomerEntity> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareCustomerEntity>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceCreateSoftwareCustomer", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Regista novo membro de grupo de software.
   * 
   * @param softwareGroupMemberEntity  (optional)
   * @return PayloadProcessingResponseSoftwareGroupMemberEntity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareGroupMemberEntity softwareResourceCreateSoftwareGroupMember(SoftwareGroupMemberEntity softwareGroupMemberEntity) throws ApiException {
    return softwareResourceCreateSoftwareGroupMemberWithHttpInfo(softwareGroupMemberEntity).getData();
  }

  /**
   * Regista novo membro de grupo de software.
   * 
   * @param softwareGroupMemberEntity  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareGroupMemberEntity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareGroupMemberEntity> softwareResourceCreateSoftwareGroupMemberWithHttpInfo(SoftwareGroupMemberEntity softwareGroupMemberEntity) throws ApiException {
    Object localVarPostBody = softwareGroupMemberEntity;
    
    // create path and map variables
    String localVarPath = "/v1/software/group-member";

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

    GenericType<PayloadProcessingResponseSoftwareGroupMemberEntity> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareGroupMemberEntity>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceCreateSoftwareGroupMember", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Regista novo transmissor.
   * 
   * @param softwareTransmitterEntity  (optional)
   * @return PayloadProcessingResponseSoftwareTransmitterEntity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareTransmitterEntity softwareResourceCreateSoftwareTransmitter(SoftwareTransmitterEntity softwareTransmitterEntity) throws ApiException {
    return softwareResourceCreateSoftwareTransmitterWithHttpInfo(softwareTransmitterEntity).getData();
  }

  /**
   * Regista novo transmissor.
   * 
   * @param softwareTransmitterEntity  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareTransmitterEntity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareTransmitterEntity> softwareResourceCreateSoftwareTransmitterWithHttpInfo(SoftwareTransmitterEntity softwareTransmitterEntity) throws ApiException {
    Object localVarPostBody = softwareTransmitterEntity;
    
    // create path and map variables
    String localVarPath = "/v1/software/transmitter";

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

    GenericType<PayloadProcessingResponseSoftwareTransmitterEntity> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareTransmitterEntity>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceCreateSoftwareTransmitter", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Elimina um contribuinte cliente de software.
   * 
   * @param id  (required)
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
  public PayloadProcessingResponseBoolean softwareResourceDeleteSoftwareCustomer(String id) throws ApiException {
    return softwareResourceDeleteSoftwareCustomerWithHttpInfo(id).getData();
  }

  /**
   * Elimina um contribuinte cliente de software.
   * 
   * @param id  (required)
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
  public ApiResponse<PayloadProcessingResponseBoolean> softwareResourceDeleteSoftwareCustomerWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceDeleteSoftwareCustomer");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/customer/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    return apiClient.invokeAPI("SoftwareApi.softwareResourceDeleteSoftwareCustomer", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Elimina um membro de grupo de software.
   * 
   * @param id  (required)
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
  public PayloadProcessingResponseBoolean softwareResourceDeleteSoftwareGroupMember(String id) throws ApiException {
    return softwareResourceDeleteSoftwareGroupMemberWithHttpInfo(id).getData();
  }

  /**
   * Elimina um membro de grupo de software.
   * 
   * @param id  (required)
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
  public ApiResponse<PayloadProcessingResponseBoolean> softwareResourceDeleteSoftwareGroupMemberWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceDeleteSoftwareGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/group-member/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    return apiClient.invokeAPI("SoftwareApi.softwareResourceDeleteSoftwareGroupMember", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Elimina um transmissor.
   * 
   * @param id  (required)
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
  public PayloadProcessingResponseBoolean softwareResourceDeleteSoftwareTransmitter(String id) throws ApiException {
    return softwareResourceDeleteSoftwareTransmitterWithHttpInfo(id).getData();
  }

  /**
   * Elimina um transmissor.
   * 
   * @param id  (required)
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
  public ApiResponse<PayloadProcessingResponseBoolean> softwareResourceDeleteSoftwareTransmitterWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceDeleteSoftwareTransmitter");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/transmitter/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    return apiClient.invokeAPI("SoftwareApi.softwareResourceDeleteSoftwareTransmitter", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Consulta contribuinte cliente de software com ID.
   * 
   * @param id  (required)
   * @return PayloadProcessingResponseSoftwareCustomerDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareCustomerDto softwareResourceReadSoftwareCustomerById(String id) throws ApiException {
    return softwareResourceReadSoftwareCustomerByIdWithHttpInfo(id).getData();
  }

  /**
   * Consulta contribuinte cliente de software com ID.
   * 
   * @param id  (required)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareCustomerDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareCustomerDto> softwareResourceReadSoftwareCustomerByIdWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceReadSoftwareCustomerById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/customer/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<PayloadProcessingResponseSoftwareCustomerDto> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareCustomerDto>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceReadSoftwareCustomerById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista contribuintes clientes de software.
   * 
   * @return PayloadProcessingResponseListSoftwareCustomerDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseListSoftwareCustomerDto softwareResourceReadSoftwareCustomerList() throws ApiException {
    return softwareResourceReadSoftwareCustomerListWithHttpInfo().getData();
  }

  /**
   * Lista contribuintes clientes de software.
   * 
   * @return ApiResponse&lt;PayloadProcessingResponseListSoftwareCustomerDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseListSoftwareCustomerDto> softwareResourceReadSoftwareCustomerListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/software/customer";

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

    GenericType<PayloadProcessingResponseListSoftwareCustomerDto> localVarReturnType = new GenericType<PayloadProcessingResponseListSoftwareCustomerDto>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceReadSoftwareCustomerList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Consulta de membro de grupo de software com ID.
   * 
   * @param id  (required)
   * @return PayloadProcessingResponseSoftwareGroupMemberDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareGroupMemberDto softwareResourceReadSoftwareGroupMemberById(String id) throws ApiException {
    return softwareResourceReadSoftwareGroupMemberByIdWithHttpInfo(id).getData();
  }

  /**
   * Consulta de membro de grupo de software com ID.
   * 
   * @param id  (required)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareGroupMemberDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareGroupMemberDto> softwareResourceReadSoftwareGroupMemberByIdWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceReadSoftwareGroupMemberById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/group-member/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<PayloadProcessingResponseSoftwareGroupMemberDto> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareGroupMemberDto>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceReadSoftwareGroupMemberById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista de membros de grupo de software.
   * 
   * @return PayloadProcessingResponseListSoftwareGroupMemberDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseListSoftwareGroupMemberDto softwareResourceReadSoftwareGroupMemberList() throws ApiException {
    return softwareResourceReadSoftwareGroupMemberListWithHttpInfo().getData();
  }

  /**
   * Lista de membros de grupo de software.
   * 
   * @return ApiResponse&lt;PayloadProcessingResponseListSoftwareGroupMemberDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseListSoftwareGroupMemberDto> softwareResourceReadSoftwareGroupMemberListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/software/group-member";

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

    GenericType<PayloadProcessingResponseListSoftwareGroupMemberDto> localVarReturnType = new GenericType<PayloadProcessingResponseListSoftwareGroupMemberDto>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceReadSoftwareGroupMemberList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista de aplicações (software) de faturação/transmissão registadas na Plataforma Eletrónica.
   * 
   * @return PayloadProcessingResponseListSoftwareDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseListSoftwareDto softwareResourceReadSoftwarePublicList() throws ApiException {
    return softwareResourceReadSoftwarePublicListWithHttpInfo().getData();
  }

  /**
   * Lista de aplicações (software) de faturação/transmissão registadas na Plataforma Eletrónica.
   * 
   * @return ApiResponse&lt;PayloadProcessingResponseListSoftwareDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseListSoftwareDto> softwareResourceReadSoftwarePublicListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/software";

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

    GenericType<PayloadProcessingResponseListSoftwareDto> localVarReturnType = new GenericType<PayloadProcessingResponseListSoftwareDto>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceReadSoftwarePublicList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Consulta transmissor com ID.
   * 
   * @param id  (required)
   * @return PayloadProcessingResponseSoftwareTransmitterDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareTransmitterDto softwareResourceReadSoftwareTransmitterById(String id) throws ApiException {
    return softwareResourceReadSoftwareTransmitterByIdWithHttpInfo(id).getData();
  }

  /**
   * Consulta transmissor com ID.
   * 
   * @param id  (required)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareTransmitterDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareTransmitterDto> softwareResourceReadSoftwareTransmitterByIdWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceReadSoftwareTransmitterById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/transmitter/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<PayloadProcessingResponseSoftwareTransmitterDto> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareTransmitterDto>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceReadSoftwareTransmitterById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista de transmissores associados a software.
   * 
   * @return PayloadProcessingResponseListSoftwareTransmitterDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseListSoftwareTransmitterDto softwareResourceReadSoftwareTransmitterList() throws ApiException {
    return softwareResourceReadSoftwareTransmitterListWithHttpInfo().getData();
  }

  /**
   * Lista de transmissores associados a software.
   * 
   * @return ApiResponse&lt;PayloadProcessingResponseListSoftwareTransmitterDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseListSoftwareTransmitterDto> softwareResourceReadSoftwareTransmitterListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/software/transmitter";

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

    GenericType<PayloadProcessingResponseListSoftwareTransmitterDto> localVarReturnType = new GenericType<PayloadProcessingResponseListSoftwareTransmitterDto>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceReadSoftwareTransmitterList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Atualiza um contribuinte cliente de software.
   * 
   * @param id  (required)
   * @param softwareCustomerEntity  (optional)
   * @return PayloadProcessingResponseSoftwareCustomerEntity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareCustomerEntity softwareResourceUpdateSoftwareCustomer(String id, SoftwareCustomerEntity softwareCustomerEntity) throws ApiException {
    return softwareResourceUpdateSoftwareCustomerWithHttpInfo(id, softwareCustomerEntity).getData();
  }

  /**
   * Atualiza um contribuinte cliente de software.
   * 
   * @param id  (required)
   * @param softwareCustomerEntity  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareCustomerEntity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareCustomerEntity> softwareResourceUpdateSoftwareCustomerWithHttpInfo(String id, SoftwareCustomerEntity softwareCustomerEntity) throws ApiException {
    Object localVarPostBody = softwareCustomerEntity;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceUpdateSoftwareCustomer");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/customer/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<PayloadProcessingResponseSoftwareCustomerEntity> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareCustomerEntity>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceUpdateSoftwareCustomer", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Ativa/Desativa um contribuinte cliente de software.
   * 
   * @param id  (required)
   * @param softwareCustomerEntity  (optional)
   * @return PayloadProcessingResponseSoftwareCustomerEntity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareCustomerEntity softwareResourceUpdateSoftwareCustomerEnabled(String id, SoftwareCustomerEntity softwareCustomerEntity) throws ApiException {
    return softwareResourceUpdateSoftwareCustomerEnabledWithHttpInfo(id, softwareCustomerEntity).getData();
  }

  /**
   * Ativa/Desativa um contribuinte cliente de software.
   * 
   * @param id  (required)
   * @param softwareCustomerEntity  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareCustomerEntity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareCustomerEntity> softwareResourceUpdateSoftwareCustomerEnabledWithHttpInfo(String id, SoftwareCustomerEntity softwareCustomerEntity) throws ApiException {
    Object localVarPostBody = softwareCustomerEntity;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceUpdateSoftwareCustomerEnabled");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/customer/{Id}/enabled"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<PayloadProcessingResponseSoftwareCustomerEntity> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareCustomerEntity>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceUpdateSoftwareCustomerEnabled", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Atualiza um membro de grupo de software.
   * 
   * @param id  (required)
   * @param softwareGroupMemberEntity  (optional)
   * @return PayloadProcessingResponseSoftwareGroupMemberEntity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareGroupMemberEntity softwareResourceUpdateSoftwareGroupMember(String id, SoftwareGroupMemberEntity softwareGroupMemberEntity) throws ApiException {
    return softwareResourceUpdateSoftwareGroupMemberWithHttpInfo(id, softwareGroupMemberEntity).getData();
  }

  /**
   * Atualiza um membro de grupo de software.
   * 
   * @param id  (required)
   * @param softwareGroupMemberEntity  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareGroupMemberEntity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareGroupMemberEntity> softwareResourceUpdateSoftwareGroupMemberWithHttpInfo(String id, SoftwareGroupMemberEntity softwareGroupMemberEntity) throws ApiException {
    Object localVarPostBody = softwareGroupMemberEntity;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceUpdateSoftwareGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/group-member/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<PayloadProcessingResponseSoftwareGroupMemberEntity> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareGroupMemberEntity>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceUpdateSoftwareGroupMember", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Atualiza um transmissor.
   * 
   * @param id  (required)
   * @param softwareTransmitterEntity  (optional)
   * @return PayloadProcessingResponseSoftwareTransmitterEntity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareTransmitterEntity softwareResourceUpdateSoftwareTransmitter(String id, SoftwareTransmitterEntity softwareTransmitterEntity) throws ApiException {
    return softwareResourceUpdateSoftwareTransmitterWithHttpInfo(id, softwareTransmitterEntity).getData();
  }

  /**
   * Atualiza um transmissor.
   * 
   * @param id  (required)
   * @param softwareTransmitterEntity  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareTransmitterEntity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareTransmitterEntity> softwareResourceUpdateSoftwareTransmitterWithHttpInfo(String id, SoftwareTransmitterEntity softwareTransmitterEntity) throws ApiException {
    Object localVarPostBody = softwareTransmitterEntity;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceUpdateSoftwareTransmitter");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/transmitter/{Id}"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<PayloadProcessingResponseSoftwareTransmitterEntity> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareTransmitterEntity>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceUpdateSoftwareTransmitter", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Ativa/Desativa um transmissor.
   * 
   * @param id  (required)
   * @param softwareTransmitterEntity  (optional)
   * @return PayloadProcessingResponseSoftwareTransmitterEntity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseSoftwareTransmitterEntity softwareResourceUpdateSoftwareTransmitterEnabled(String id, SoftwareTransmitterEntity softwareTransmitterEntity) throws ApiException {
    return softwareResourceUpdateSoftwareTransmitterEnabledWithHttpInfo(id, softwareTransmitterEntity).getData();
  }

  /**
   * Ativa/Desativa um transmissor.
   * 
   * @param id  (required)
   * @param softwareTransmitterEntity  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseSoftwareTransmitterEntity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseSoftwareTransmitterEntity> softwareResourceUpdateSoftwareTransmitterEnabledWithHttpInfo(String id, SoftwareTransmitterEntity softwareTransmitterEntity) throws ApiException {
    Object localVarPostBody = softwareTransmitterEntity;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling softwareResourceUpdateSoftwareTransmitterEnabled");
    }
    
    // create path and map variables
    String localVarPath = "/v1/software/transmitter/{Id}/enabled"
      .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<PayloadProcessingResponseSoftwareTransmitterEntity> localVarReturnType = new GenericType<PayloadProcessingResponseSoftwareTransmitterEntity>() {};

    return apiClient.invokeAPI("SoftwareApi.softwareResourceUpdateSoftwareTransmitterEnabled", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
