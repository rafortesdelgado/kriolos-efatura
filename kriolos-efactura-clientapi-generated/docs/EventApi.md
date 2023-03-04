# EventApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eventResourceCreateEvent**](EventApi.md#eventResourceCreateEvent) | **POST** /v1/event | Comunicação de novos eventos. |
| [**eventResourceGetEventById**](EventApi.md#eventResourceGetEventById) | **GET** /v1/event/{Id} | Consulta de evento com ID. |
| [**eventResourceGetEventListV1**](EventApi.md#eventResourceGetEventListV1) | **GET** /v1/event | Lista de eventos limitada em 10000 eventos. |
| [**eventResourceGetEventListV2**](EventApi.md#eventResourceGetEventListV2) | **GET** /v2/event | Lista de eventos que suporta paginação. |
| [**eventResourceGetEventXmlById**](EventApi.md#eventResourceGetEventXmlById) | **GET** /v1/event/xml/{Id} | Consulta de evento com ID. |



## eventResourceCreateEvent

> EfEntriesProcessingResponse eventResourceCreateEvent(cvEfRepositoryCode, _file)

Comunicação de novos eventos.

### Example

```java
import java.io.File;
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        File _file = new File("/path/to/file"); // File | 
        try {
            EfEntriesProcessingResponse result = apiInstance.eventResourceCreateEvent(cvEfRepositoryCode, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#eventResourceCreateEvent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cvEfRepositoryCode** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

[**EfEntriesProcessingResponse**](EfEntriesProcessingResponse.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |


## eventResourceGetEventById

> PayloadProcessingResponseEvent eventResourceGetEventById(id, cvEfRepositoryCode)

Consulta de evento com ID.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String id = "id_example"; // String | 
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        try {
            PayloadProcessingResponseEvent result = apiInstance.eventResourceGetEventById(id, cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#eventResourceGetEventById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **cvEfRepositoryCode** | **String**|  | [optional] |

### Return type

[**PayloadProcessingResponseEvent**](PayloadProcessingResponseEvent.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |


## eventResourceGetEventListV1

> EventListProcessingResponse eventResourceGetEventListV1(authorizedDateEnd, authorizedDateStart, documentNumberEnd, documentNumberStart, documentTypeCodes, eventId, eventTypeCodes, IUD, ledCode, year, cvEfRepositoryCode)

Lista de eventos limitada em 10000 eventos.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String authorizedDateEnd = "authorizedDateEnd_example"; // String | 
        String authorizedDateStart = "authorizedDateStart_example"; // String | 
        String documentNumberEnd = "documentNumberEnd_example"; // String | 
        String documentNumberStart = "documentNumberStart_example"; // String | 
        String documentTypeCodes = "documentTypeCodes_example"; // String | 
        String eventId = "eventId_example"; // String | 
        String eventTypeCodes = "eventTypeCodes_example"; // String | 
        String IUD = "IUD_example"; // String | 
        String ledCode = "ledCode_example"; // String | 
        String year = "year_example"; // String | 
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        try {
            EventListProcessingResponse result = apiInstance.eventResourceGetEventListV1(authorizedDateEnd, authorizedDateStart, documentNumberEnd, documentNumberStart, documentTypeCodes, eventId, eventTypeCodes, IUD, ledCode, year, cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#eventResourceGetEventListV1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizedDateEnd** | **String**|  | [optional] |
| **authorizedDateStart** | **String**|  | [optional] |
| **documentNumberEnd** | **String**|  | [optional] |
| **documentNumberStart** | **String**|  | [optional] |
| **documentTypeCodes** | **String**|  | [optional] |
| **eventId** | **String**|  | [optional] |
| **eventTypeCodes** | **String**|  | [optional] |
| **IUD** | **String**|  | [optional] |
| **ledCode** | **String**|  | [optional] |
| **year** | **String**|  | [optional] |
| **cvEfRepositoryCode** | **String**|  | [optional] |

### Return type

[**EventListProcessingResponse**](EventListProcessingResponse.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |


## eventResourceGetEventListV2

> EventListPaginationResponse eventResourceGetEventListV2(authorizedDateEnd, authorizedDateStart, documentNumberEnd, documentNumberStart, documentTypeCodes, eventId, eventTypeCodes, IUD, itemsPerPage, ledCode, page, year, cvEfRepositoryCode)

Lista de eventos que suporta paginação.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String authorizedDateEnd = "authorizedDateEnd_example"; // String | 
        String authorizedDateStart = "authorizedDateStart_example"; // String | 
        String documentNumberEnd = "documentNumberEnd_example"; // String | 
        String documentNumberStart = "documentNumberStart_example"; // String | 
        String documentTypeCodes = "documentTypeCodes_example"; // String | 
        String eventId = "eventId_example"; // String | 
        String eventTypeCodes = "eventTypeCodes_example"; // String | 
        String IUD = "IUD_example"; // String | 
        String itemsPerPage = "itemsPerPage_example"; // String | 
        String ledCode = "ledCode_example"; // String | 
        String page = "page_example"; // String | 
        String year = "year_example"; // String | 
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        try {
            EventListPaginationResponse result = apiInstance.eventResourceGetEventListV2(authorizedDateEnd, authorizedDateStart, documentNumberEnd, documentNumberStart, documentTypeCodes, eventId, eventTypeCodes, IUD, itemsPerPage, ledCode, page, year, cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#eventResourceGetEventListV2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizedDateEnd** | **String**|  | [optional] |
| **authorizedDateStart** | **String**|  | [optional] |
| **documentNumberEnd** | **String**|  | [optional] |
| **documentNumberStart** | **String**|  | [optional] |
| **documentTypeCodes** | **String**|  | [optional] |
| **eventId** | **String**|  | [optional] |
| **eventTypeCodes** | **String**|  | [optional] |
| **IUD** | **String**|  | [optional] |
| **itemsPerPage** | **String**|  | [optional] |
| **ledCode** | **String**|  | [optional] |
| **page** | **String**|  | [optional] |
| **year** | **String**|  | [optional] |
| **cvEfRepositoryCode** | **String**|  | [optional] |

### Return type

[**EventListPaginationResponse**](EventListPaginationResponse.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |


## eventResourceGetEventXmlById

> PayloadProcessingResponseString eventResourceGetEventXmlById(id, cvEfRepositoryCode)

Consulta de evento com ID.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String id = "id_example"; // String | 
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        try {
            PayloadProcessingResponseString result = apiInstance.eventResourceGetEventXmlById(id, cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#eventResourceGetEventXmlById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **cvEfRepositoryCode** | **String**|  | [optional] |

### Return type

[**PayloadProcessingResponseString**](PayloadProcessingResponseString.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |

