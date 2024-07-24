# DfeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dfeResourceAuthorizeSelfBilling**](DfeApi.md#dfeResourceAuthorizeSelfBilling) | **POST** /v1/dfe/self-billing/authorize | Pedido de autorização para autofaturação. |
| [**dfeResourceCreateDfe**](DfeApi.md#dfeResourceCreateDfe) | **POST** /v1/dfe | Comunicação de novos DFEs. |
| [**dfeResourceDeleteDfeEvent**](DfeApi.md#dfeResourceDeleteDfeEvent) | **DELETE** /v1/dfe | Elimina todos os DFEs e os respetivos eventos no repositório de Homologação/Teste. |
| [**dfeResourceGetDfeById**](DfeApi.md#dfeResourceGetDfeById) | **GET** /v1/dfe/{Id} | Consulta de DFE com IUD. |
| [**dfeResourceGetDfePdfById**](DfeApi.md#dfeResourceGetDfePdfById) | **GET** /v1/dfe/pdf/{Id} | Consulta de PDF de um DFE com IUD. |
| [**dfeResourceGetDfeSummaryListV1**](DfeApi.md#dfeResourceGetDfeSummaryListV1) | **GET** /v1/dfe | Lista de DFEs limitada em 10000 DFEs. |
| [**dfeResourceGetDfeSummaryListV2**](DfeApi.md#dfeResourceGetDfeSummaryListV2) | **GET** /v2/dfe | Lista de DFEs que suporta paginação. |
| [**dfeResourceGetDfeXmlById**](DfeApi.md#dfeResourceGetDfeXmlById) | **GET** /v1/dfe/xml/{Id} | Consulta de XML com IUD exatamente como foi gerado e assinado pelo contribuinte e com aposição de timestamp. |



## dfeResourceAuthorizeSelfBilling

> PayloadProcessingResponseDfeSelfBillingAuthorizeResponse dfeResourceAuthorizeSelfBilling(cvEfRepositoryCode, dfeSelfBillingAuthorizeRequest)

Pedido de autorização para autofaturação.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        DfeApi apiInstance = new DfeApi(defaultClient);
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        DfeSelfBillingAuthorizeRequest dfeSelfBillingAuthorizeRequest = new DfeSelfBillingAuthorizeRequest(); // DfeSelfBillingAuthorizeRequest | 
        try {
            PayloadProcessingResponseDfeSelfBillingAuthorizeResponse result = apiInstance.dfeResourceAuthorizeSelfBilling(cvEfRepositoryCode, dfeSelfBillingAuthorizeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DfeApi#dfeResourceAuthorizeSelfBilling");
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
| **dfeSelfBillingAuthorizeRequest** | [**DfeSelfBillingAuthorizeRequest**](DfeSelfBillingAuthorizeRequest.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseDfeSelfBillingAuthorizeResponse**](PayloadProcessingResponseDfeSelfBillingAuthorizeResponse.md)

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


## dfeResourceCreateDfe

> EfEntriesProcessingResponse dfeResourceCreateDfe(cvEfRepositoryCode, _file)

Comunicação de novos DFEs.

### Example

```java
import java.io.File;
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        DfeApi apiInstance = new DfeApi(defaultClient);
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        File _file = new File("/path/to/file"); // File | 
        try {
            EfEntriesProcessingResponse result = apiInstance.dfeResourceCreateDfe(cvEfRepositoryCode, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DfeApi#dfeResourceCreateDfe");
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


## dfeResourceDeleteDfeEvent

> PayloadProcessingResponseLong dfeResourceDeleteDfeEvent(cvEfRepositoryCode)

Elimina todos os DFEs e os respetivos eventos no repositório de Homologação/Teste.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        DfeApi apiInstance = new DfeApi(defaultClient);
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        try {
            PayloadProcessingResponseLong result = apiInstance.dfeResourceDeleteDfeEvent(cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DfeApi#dfeResourceDeleteDfeEvent");
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

### Return type

[**PayloadProcessingResponseLong**](PayloadProcessingResponseLong.md)

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


## dfeResourceGetDfeById

> PayloadProcessingResponseDfe dfeResourceGetDfeById(id, cvEfRepositoryCode)

Consulta de DFE com IUD.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        DfeApi apiInstance = new DfeApi(defaultClient);
        String id = "id_example"; // String | 
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        try {
            PayloadProcessingResponseDfe result = apiInstance.dfeResourceGetDfeById(id, cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DfeApi#dfeResourceGetDfeById");
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

[**PayloadProcessingResponseDfe**](PayloadProcessingResponseDfe.md)

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


## dfeResourceGetDfePdfById

> PayloadProcessingResponseString dfeResourceGetDfePdfById(id, cvEfRepositoryCode)

Consulta de PDF de um DFE com IUD.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        DfeApi apiInstance = new DfeApi(defaultClient);
        String id = "id_example"; // String | 
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        try {
            PayloadProcessingResponseString result = apiInstance.dfeResourceGetDfePdfById(id, cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DfeApi#dfeResourceGetDfePdfById");
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


## dfeResourceGetDfeSummaryListV1

> DfeListProcessingResponse dfeResourceGetDfeSummaryListV1(authorizedDateEnd, authorizedDateStart, documentNumber, documentTypeCodes, emitterTaxId, IUD, isCanceled, issueDirection, issueYear, ledCode, receiverTaxId, receiverTaxIdCountryCode, cvEfRepositoryCode)

Lista de DFEs limitada em 10000 DFEs.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        DfeApi apiInstance = new DfeApi(defaultClient);
        String authorizedDateEnd = "authorizedDateEnd_example"; // String | 
        String authorizedDateStart = "authorizedDateStart_example"; // String | 
        String documentNumber = "documentNumber_example"; // String | 
        String documentTypeCodes = "documentTypeCodes_example"; // String | 
        String emitterTaxId = "emitterTaxId_example"; // String | 
        String IUD = "IUD_example"; // String | 
        String isCanceled = "isCanceled_example"; // String | 
        String issueDirection = "issueDirection_example"; // String | 
        String issueYear = "issueYear_example"; // String | 
        String ledCode = "ledCode_example"; // String | 
        String receiverTaxId = "receiverTaxId_example"; // String | 
        String receiverTaxIdCountryCode = "receiverTaxIdCountryCode_example"; // String | 
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        try {
            DfeListProcessingResponse result = apiInstance.dfeResourceGetDfeSummaryListV1(authorizedDateEnd, authorizedDateStart, documentNumber, documentTypeCodes, emitterTaxId, IUD, isCanceled, issueDirection, issueYear, ledCode, receiverTaxId, receiverTaxIdCountryCode, cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DfeApi#dfeResourceGetDfeSummaryListV1");
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
| **documentNumber** | **String**|  | [optional] |
| **documentTypeCodes** | **String**|  | [optional] |
| **emitterTaxId** | **String**|  | [optional] |
| **IUD** | **String**|  | [optional] |
| **isCanceled** | **String**|  | [optional] |
| **issueDirection** | **String**|  | [optional] |
| **issueYear** | **String**|  | [optional] |
| **ledCode** | **String**|  | [optional] |
| **receiverTaxId** | **String**|  | [optional] |
| **receiverTaxIdCountryCode** | **String**|  | [optional] |
| **cvEfRepositoryCode** | **String**|  | [optional] |

### Return type

[**DfeListProcessingResponse**](DfeListProcessingResponse.md)

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


## dfeResourceGetDfeSummaryListV2

> DfeListPaginationResponse dfeResourceGetDfeSummaryListV2(authorizedDateEnd, authorizedDateStart, documentNumber, documentTypeCodes, emitterTaxId, IUD, isCanceled, issueDirection, issueYear, itemsPerPage, ledCode, page, receiverTaxId, receiverTaxIdCountryCode, cvEfRepositoryCode)

Lista de DFEs que suporta paginação.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        DfeApi apiInstance = new DfeApi(defaultClient);
        String authorizedDateEnd = "authorizedDateEnd_example"; // String | 
        String authorizedDateStart = "authorizedDateStart_example"; // String | 
        String documentNumber = "documentNumber_example"; // String | 
        String documentTypeCodes = "documentTypeCodes_example"; // String | 
        String emitterTaxId = "emitterTaxId_example"; // String | 
        String IUD = "IUD_example"; // String | 
        String isCanceled = "isCanceled_example"; // String | 
        String issueDirection = "issueDirection_example"; // String | 
        String issueYear = "issueYear_example"; // String | 
        String itemsPerPage = "itemsPerPage_example"; // String | 
        String ledCode = "ledCode_example"; // String | 
        String page = "page_example"; // String | 
        String receiverTaxId = "receiverTaxId_example"; // String | 
        String receiverTaxIdCountryCode = "receiverTaxIdCountryCode_example"; // String | 
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        try {
            DfeListPaginationResponse result = apiInstance.dfeResourceGetDfeSummaryListV2(authorizedDateEnd, authorizedDateStart, documentNumber, documentTypeCodes, emitterTaxId, IUD, isCanceled, issueDirection, issueYear, itemsPerPage, ledCode, page, receiverTaxId, receiverTaxIdCountryCode, cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DfeApi#dfeResourceGetDfeSummaryListV2");
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
| **documentNumber** | **String**|  | [optional] |
| **documentTypeCodes** | **String**|  | [optional] |
| **emitterTaxId** | **String**|  | [optional] |
| **IUD** | **String**|  | [optional] |
| **isCanceled** | **String**|  | [optional] |
| **issueDirection** | **String**|  | [optional] |
| **issueYear** | **String**|  | [optional] |
| **itemsPerPage** | **String**|  | [optional] |
| **ledCode** | **String**|  | [optional] |
| **page** | **String**|  | [optional] |
| **receiverTaxId** | **String**|  | [optional] |
| **receiverTaxIdCountryCode** | **String**|  | [optional] |
| **cvEfRepositoryCode** | **String**|  | [optional] |

### Return type

[**DfeListPaginationResponse**](DfeListPaginationResponse.md)

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


## dfeResourceGetDfeXmlById

> PayloadProcessingResponseString dfeResourceGetDfeXmlById(id, cvEfRepositoryCode)

Consulta de XML com IUD exatamente como foi gerado e assinado pelo contribuinte e com aposição de timestamp.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        DfeApi apiInstance = new DfeApi(defaultClient);
        String id = "id_example"; // String | 
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | 
        try {
            PayloadProcessingResponseString result = apiInstance.dfeResourceGetDfeXmlById(id, cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DfeApi#dfeResourceGetDfeXmlById");
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

