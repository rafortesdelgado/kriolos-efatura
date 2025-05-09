# OpaccApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**opaccResourceCreateAccountantCustomer**](OpaccApi.md#opaccResourceCreateAccountantCustomer) | **POST** /v1/opacc/accountant-customer | Regista um contribuinte como um cliente de um contabilista certificado. |
| [**opaccResourceDeleteAccountantCustomer**](OpaccApi.md#opaccResourceDeleteAccountantCustomer) | **DELETE** /v1/opacc/accountant-customer/{CustomerId} | Elimina um contribuinte como um cliente de um contabilista certificado. |
| [**opaccResourceGetAccountantCustomers**](OpaccApi.md#opaccResourceGetAccountantCustomers) | **GET** /v1/opacc/accountant-customer | Lista de contribuintes que são clientes do contabilista certificado representado pelo utilizador autenticado. |
| [**opaccResourceGetAccountants**](OpaccApi.md#opaccResourceGetAccountants) | **GET** /v1/opacc/accountant-list | Lista Nacional de Auditores e Contabilistas Certificados Autorizados. |
| [**opaccResourceUploadAccountants**](OpaccApi.md#opaccResourceUploadAccountants) | **POST** /v1/opacc/accountant-list | Carrega na PE a Lista Nacional de Auditores e Contabilistas Certificados Autorizados. |



## opaccResourceCreateAccountantCustomer

> PayloadProcessingResponseOpaccAccountantCustomerDto opaccResourceCreateAccountantCustomer(opaccAccountantCustomerCreateDto)

Regista um contribuinte como um cliente de um contabilista certificado.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.OpaccApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        OpaccApi apiInstance = new OpaccApi(defaultClient);
        OpaccAccountantCustomerCreateDto opaccAccountantCustomerCreateDto = new OpaccAccountantCustomerCreateDto(); // OpaccAccountantCustomerCreateDto | 
        try {
            PayloadProcessingResponseOpaccAccountantCustomerDto result = apiInstance.opaccResourceCreateAccountantCustomer(opaccAccountantCustomerCreateDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpaccApi#opaccResourceCreateAccountantCustomer");
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
| **opaccAccountantCustomerCreateDto** | [**OpaccAccountantCustomerCreateDto**](OpaccAccountantCustomerCreateDto.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseOpaccAccountantCustomerDto**](PayloadProcessingResponseOpaccAccountantCustomerDto.md)

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


## opaccResourceDeleteAccountantCustomer

> ProcessingResponse opaccResourceDeleteAccountantCustomer(customerId)

Elimina um contribuinte como um cliente de um contabilista certificado.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.OpaccApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        OpaccApi apiInstance = new OpaccApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        try {
            ProcessingResponse result = apiInstance.opaccResourceDeleteAccountantCustomer(customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpaccApi#opaccResourceDeleteAccountantCustomer");
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
| **customerId** | **String**|  | |

### Return type

[**ProcessingResponse**](ProcessingResponse.md)

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


## opaccResourceGetAccountantCustomers

> PayloadProcessingResponseListOpaccAccountantCustomerDto opaccResourceGetAccountantCustomers()

Lista de contribuintes que são clientes do contabilista certificado representado pelo utilizador autenticado.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.OpaccApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        OpaccApi apiInstance = new OpaccApi(defaultClient);
        try {
            PayloadProcessingResponseListOpaccAccountantCustomerDto result = apiInstance.opaccResourceGetAccountantCustomers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpaccApi#opaccResourceGetAccountantCustomers");
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

[**PayloadProcessingResponseListOpaccAccountantCustomerDto**](PayloadProcessingResponseListOpaccAccountantCustomerDto.md)

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


## opaccResourceGetAccountants

> PayloadProcessingResponseListOpaccAccountantDto opaccResourceGetAccountants()

Lista Nacional de Auditores e Contabilistas Certificados Autorizados.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.OpaccApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        OpaccApi apiInstance = new OpaccApi(defaultClient);
        try {
            PayloadProcessingResponseListOpaccAccountantDto result = apiInstance.opaccResourceGetAccountants();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpaccApi#opaccResourceGetAccountants");
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

[**PayloadProcessingResponseListOpaccAccountantDto**](PayloadProcessingResponseListOpaccAccountantDto.md)

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


## opaccResourceUploadAccountants

> ProcessingResponse opaccResourceUploadAccountants(_file)

Carrega na PE a Lista Nacional de Auditores e Contabilistas Certificados Autorizados.

### Example

```java
import java.io.File;
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.OpaccApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        OpaccApi apiInstance = new OpaccApi(defaultClient);
        File _file = new File("/path/to/file"); // File | 
        try {
            ProcessingResponse result = apiInstance.opaccResourceUploadAccountants(_file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpaccApi#opaccResourceUploadAccountants");
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
| **_file** | **File**|  | [optional] |

### Return type

[**ProcessingResponse**](ProcessingResponse.md)

### Authorization

[SecurityScheme](../README.md#SecurityScheme)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not Authorized |  -  |
| **403** | Not Allowed |  -  |

