package io.github.kriolos.efatura.clientapi.generated.api;

import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiResponse;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.kriolos.efatura.clientapi.generated.model.EfEntriesProcessingResponse;
import io.github.kriolos.efatura.clientapi.generated.model.EventListPaginationResponse;
import io.github.kriolos.efatura.clientapi.generated.model.EventListProcessingResponse;
import java.io.File;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseEvent;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-23T13:33:35.367561143-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
public class EventApi {
  private ApiClient apiClient;

  public EventApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventApi(ApiClient apiClient) {
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
   * Comunicação de novos eventos.
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
  public EfEntriesProcessingResponse eventResourceCreateEvent(String cvEfRepositoryCode, File _file) throws ApiException {
    return eventResourceCreateEventWithHttpInfo(cvEfRepositoryCode, _file).getData();
  }

  /**
   * Comunicação de novos eventos.
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
  public ApiResponse<EfEntriesProcessingResponse> eventResourceCreateEventWithHttpInfo(String cvEfRepositoryCode, File _file) throws ApiException {
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
    return apiClient.invokeAPI("EventApi.eventResourceCreateEvent", "/v1/event", "POST", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Consulta de evento com ID.
   * 
   * @param id  (required)
   * @param cvEfRepositoryCode  (optional)
   * @return PayloadProcessingResponseEvent
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public PayloadProcessingResponseEvent eventResourceGetEventById(String id, String cvEfRepositoryCode) throws ApiException {
    return eventResourceGetEventByIdWithHttpInfo(id, cvEfRepositoryCode).getData();
  }

  /**
   * Consulta de evento com ID.
   * 
   * @param id  (required)
   * @param cvEfRepositoryCode  (optional)
   * @return ApiResponse&lt;PayloadProcessingResponseEvent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayloadProcessingResponseEvent> eventResourceGetEventByIdWithHttpInfo(String id, String cvEfRepositoryCode) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling eventResourceGetEventById");
    }

    // Path parameters
    String localVarPath = "/v1/event/{Id}"
            .replaceAll("\\{Id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<PayloadProcessingResponseEvent> localVarReturnType = new GenericType<PayloadProcessingResponseEvent>() {};
    return apiClient.invokeAPI("EventApi.eventResourceGetEventById", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista de eventos limitada em 10000 eventos.
   * 
   * @param authorizedDateEnd  (optional)
   * @param authorizedDateStart  (optional)
   * @param documentNumberEnd  (optional)
   * @param documentNumberStart  (optional)
   * @param documentTypeCodes  (optional)
   * @param eventId  (optional)
   * @param eventTypeCodes  (optional)
   * @param IUD  (optional)
   * @param ledCode  (optional)
   * @param year  (optional)
   * @param cvEfRepositoryCode  (optional)
   * @return EventListProcessingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public EventListProcessingResponse eventResourceGetEventListV1(String authorizedDateEnd, String authorizedDateStart, String documentNumberEnd, String documentNumberStart, String documentTypeCodes, String eventId, String eventTypeCodes, String IUD, String ledCode, String year, String cvEfRepositoryCode) throws ApiException {
    return eventResourceGetEventListV1WithHttpInfo(authorizedDateEnd, authorizedDateStart, documentNumberEnd, documentNumberStart, documentTypeCodes, eventId, eventTypeCodes, IUD, ledCode, year, cvEfRepositoryCode).getData();
  }

  /**
   * Lista de eventos limitada em 10000 eventos.
   * 
   * @param authorizedDateEnd  (optional)
   * @param authorizedDateStart  (optional)
   * @param documentNumberEnd  (optional)
   * @param documentNumberStart  (optional)
   * @param documentTypeCodes  (optional)
   * @param eventId  (optional)
   * @param eventTypeCodes  (optional)
   * @param IUD  (optional)
   * @param ledCode  (optional)
   * @param year  (optional)
   * @param cvEfRepositoryCode  (optional)
   * @return ApiResponse&lt;EventListProcessingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventListProcessingResponse> eventResourceGetEventListV1WithHttpInfo(String authorizedDateEnd, String authorizedDateStart, String documentNumberEnd, String documentNumberStart, String documentTypeCodes, String eventId, String eventTypeCodes, String IUD, String ledCode, String year, String cvEfRepositoryCode) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "AuthorizedDateEnd", authorizedDateEnd)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "AuthorizedDateStart", authorizedDateStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DocumentNumberEnd", documentNumberEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DocumentNumberStart", documentNumberStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DocumentTypeCodes", documentTypeCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "EventId", eventId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "EventTypeCodes", eventTypeCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IUD", IUD));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "LedCode", ledCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Year", year));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<EventListProcessingResponse> localVarReturnType = new GenericType<EventListProcessingResponse>() {};
    return apiClient.invokeAPI("EventApi.eventResourceGetEventListV1", "/v1/event", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lista de eventos que suporta paginação.
   * 
   * @param authorizedDateEnd  (optional)
   * @param authorizedDateStart  (optional)
   * @param documentNumberEnd  (optional)
   * @param documentNumberStart  (optional)
   * @param documentTypeCodes  (optional)
   * @param eventId  (optional)
   * @param eventTypeCodes  (optional)
   * @param IUD  (optional)
   * @param itemsPerPage  (optional)
   * @param ledCode  (optional)
   * @param page  (optional)
   * @param year  (optional)
   * @param cvEfRepositoryCode  (optional)
   * @return EventListPaginationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public EventListPaginationResponse eventResourceGetEventListV2(String authorizedDateEnd, String authorizedDateStart, String documentNumberEnd, String documentNumberStart, String documentTypeCodes, String eventId, String eventTypeCodes, String IUD, String itemsPerPage, String ledCode, String page, String year, String cvEfRepositoryCode) throws ApiException {
    return eventResourceGetEventListV2WithHttpInfo(authorizedDateEnd, authorizedDateStart, documentNumberEnd, documentNumberStart, documentTypeCodes, eventId, eventTypeCodes, IUD, itemsPerPage, ledCode, page, year, cvEfRepositoryCode).getData();
  }

  /**
   * Lista de eventos que suporta paginação.
   * 
   * @param authorizedDateEnd  (optional)
   * @param authorizedDateStart  (optional)
   * @param documentNumberEnd  (optional)
   * @param documentNumberStart  (optional)
   * @param documentTypeCodes  (optional)
   * @param eventId  (optional)
   * @param eventTypeCodes  (optional)
   * @param IUD  (optional)
   * @param itemsPerPage  (optional)
   * @param ledCode  (optional)
   * @param page  (optional)
   * @param year  (optional)
   * @param cvEfRepositoryCode  (optional)
   * @return ApiResponse&lt;EventListPaginationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Not Allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventListPaginationResponse> eventResourceGetEventListV2WithHttpInfo(String authorizedDateEnd, String authorizedDateStart, String documentNumberEnd, String documentNumberStart, String documentTypeCodes, String eventId, String eventTypeCodes, String IUD, String itemsPerPage, String ledCode, String page, String year, String cvEfRepositoryCode) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "AuthorizedDateEnd", authorizedDateEnd)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "AuthorizedDateStart", authorizedDateStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DocumentNumberEnd", documentNumberEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DocumentNumberStart", documentNumberStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DocumentTypeCodes", documentTypeCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "EventId", eventId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "EventTypeCodes", eventTypeCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IUD", IUD));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ItemsPerPage", itemsPerPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "LedCode", ledCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Year", year));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (cvEfRepositoryCode != null) {
      localVarHeaderParams.put("cv-ef-repository-code", apiClient.parameterToString(cvEfRepositoryCode));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/xml", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"SecurityScheme"};
    GenericType<EventListPaginationResponse> localVarReturnType = new GenericType<EventListPaginationResponse>() {};
    return apiClient.invokeAPI("EventApi.eventResourceGetEventListV2", "/v2/event", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Consulta de evento com ID.
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
  public PayloadProcessingResponseString eventResourceGetEventXmlById(String id, String cvEfRepositoryCode) throws ApiException {
    return eventResourceGetEventXmlByIdWithHttpInfo(id, cvEfRepositoryCode).getData();
  }

  /**
   * Consulta de evento com ID.
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
  public ApiResponse<PayloadProcessingResponseString> eventResourceGetEventXmlByIdWithHttpInfo(String id, String cvEfRepositoryCode) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling eventResourceGetEventXmlById");
    }

    // Path parameters
    String localVarPath = "/v1/event/xml/{Id}"
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
    return apiClient.invokeAPI("EventApi.eventResourceGetEventXmlById", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
