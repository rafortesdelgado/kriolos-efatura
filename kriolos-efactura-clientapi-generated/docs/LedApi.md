# LedApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ledResourceCreateLed**](LedApi.md#ledResourceCreateLed) | **POST** /v1/led | Regista um novo LED. |
| [**ledResourceDeleteLed**](LedApi.md#ledResourceDeleteLed) | **DELETE** /v1/led/{LedCode} | Elimina um LED sem DFEs associados. |
| [**ledResourceGetAllLeds**](LedApi.md#ledResourceGetAllLeds) | **GET** /v1/led | Lista de LEDs. |
| [**ledResourceGetLedByCode**](LedApi.md#ledResourceGetLedByCode) | **GET** /v1/led/{LedCode} | Consulta de LED com código. |
| [**ledResourceUpdateLed**](LedApi.md#ledResourceUpdateLed) | **PUT** /v1/led/{LedCode} | Atualiza um LED. |



## ledResourceCreateLed

> PayloadProcessingResponseLedDto ledResourceCreateLed(saveLedDto)

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
        SaveLedDto saveLedDto = new SaveLedDto(); // SaveLedDto | 
        try {
            PayloadProcessingResponseLedDto result = apiInstance.ledResourceCreateLed(saveLedDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedApi#ledResourceCreateLed");
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
| **saveLedDto** | [**SaveLedDto**](SaveLedDto.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseLedDto**](PayloadProcessingResponseLedDto.md)

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


## ledResourceDeleteLed

> PayloadProcessingResponseBoolean ledResourceDeleteLed(ledCode)

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
            PayloadProcessingResponseBoolean result = apiInstance.ledResourceDeleteLed(ledCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedApi#ledResourceDeleteLed");
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


## ledResourceGetAllLeds

> PayloadProcessingResponseListLedDto ledResourceGetAllLeds()

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
            PayloadProcessingResponseListLedDto result = apiInstance.ledResourceGetAllLeds();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedApi#ledResourceGetAllLeds");
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

[**PayloadProcessingResponseListLedDto**](PayloadProcessingResponseListLedDto.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |


## ledResourceGetLedByCode

> PayloadProcessingResponseLedDto ledResourceGetLedByCode(ledCode)

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
            PayloadProcessingResponseLedDto result = apiInstance.ledResourceGetLedByCode(ledCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedApi#ledResourceGetLedByCode");
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

[**PayloadProcessingResponseLedDto**](PayloadProcessingResponseLedDto.md)

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


## ledResourceUpdateLed

> PayloadProcessingResponseLedDto ledResourceUpdateLed(ledCode, saveLedDto)

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
        SaveLedDto saveLedDto = new SaveLedDto(); // SaveLedDto | 
        try {
            PayloadProcessingResponseLedDto result = apiInstance.ledResourceUpdateLed(ledCode, saveLedDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedApi#ledResourceUpdateLed");
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
| **saveLedDto** | [**SaveLedDto**](SaveLedDto.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseLedDto**](PayloadProcessingResponseLedDto.md)

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

