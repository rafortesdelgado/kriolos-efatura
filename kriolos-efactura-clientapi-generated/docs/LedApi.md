# LedApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ledResourceCreate**](LedApi.md#ledResourceCreate) | **POST** /v1/led | Regista um novo LED. |
| [**ledResourceDelete**](LedApi.md#ledResourceDelete) | **DELETE** /v1/led/{LedCode} | Elimina um LED sem DFEs associados. |
| [**ledResourceReadByCode**](LedApi.md#ledResourceReadByCode) | **GET** /v1/led/{LedCode} | Consulta de LED com código. |
| [**ledResourceReadList**](LedApi.md#ledResourceReadList) | **GET** /v1/led | Lista de LEDs. |
| [**ledResourceUpdate**](LedApi.md#ledResourceUpdate) | **PUT** /v1/led/{LedCode} | Atualiza um LED. |



## ledResourceCreate

> PayloadProcessingResponseLedEntity ledResourceCreate(ledEntity)

Regista um novo LED.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.LedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        LedApi apiInstance = new LedApi(defaultClient);
        LedEntity ledEntity = new LedEntity(); // LedEntity | 
        try {
            PayloadProcessingResponseLedEntity result = apiInstance.ledResourceCreate(ledEntity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedApi#ledResourceCreate");
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
| **ledEntity** | [**LedEntity**](LedEntity.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseLedEntity**](PayloadProcessingResponseLedEntity.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |


## ledResourceDelete

> PayloadProcessingResponseBoolean ledResourceDelete(ledCode)

Elimina um LED sem DFEs associados.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.LedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        LedApi apiInstance = new LedApi(defaultClient);
        String ledCode = "ledCode_example"; // String | 
        try {
            PayloadProcessingResponseBoolean result = apiInstance.ledResourceDelete(ledCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedApi#ledResourceDelete");
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
| **ledCode** | **String**|  | |

### Return type

[**PayloadProcessingResponseBoolean**](PayloadProcessingResponseBoolean.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |


## ledResourceReadByCode

> PayloadProcessingResponseLedEntity ledResourceReadByCode(ledCode)

Consulta de LED com código.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.LedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        LedApi apiInstance = new LedApi(defaultClient);
        String ledCode = "ledCode_example"; // String | 
        try {
            PayloadProcessingResponseLedEntity result = apiInstance.ledResourceReadByCode(ledCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedApi#ledResourceReadByCode");
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
| **ledCode** | **String**|  | |

### Return type

[**PayloadProcessingResponseLedEntity**](PayloadProcessingResponseLedEntity.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |


## ledResourceReadList

> PayloadProcessingResponseListLedEntity ledResourceReadList()

Lista de LEDs.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.LedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        LedApi apiInstance = new LedApi(defaultClient);
        try {
            PayloadProcessingResponseListLedEntity result = apiInstance.ledResourceReadList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedApi#ledResourceReadList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**PayloadProcessingResponseListLedEntity**](PayloadProcessingResponseListLedEntity.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |


## ledResourceUpdate

> PayloadProcessingResponseLedEntity ledResourceUpdate(ledCode, ledEntity)

Atualiza um LED.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.LedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        LedApi apiInstance = new LedApi(defaultClient);
        String ledCode = "ledCode_example"; // String | 
        LedEntity ledEntity = new LedEntity(); // LedEntity | 
        try {
            PayloadProcessingResponseLedEntity result = apiInstance.ledResourceUpdate(ledCode, ledEntity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedApi#ledResourceUpdate");
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
| **ledCode** | **String**|  | |
| **ledEntity** | [**LedEntity**](LedEntity.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseLedEntity**](PayloadProcessingResponseLedEntity.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |

