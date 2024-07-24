# SoftwareApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**softwareResourceCreateSoftwareCustomer**](SoftwareApi.md#softwareResourceCreateSoftwareCustomer) | **POST** /v1/software/customer | Regista um novo contribuinte cliente de software. |
| [**softwareResourceCreateSoftwareGroupMember**](SoftwareApi.md#softwareResourceCreateSoftwareGroupMember) | **POST** /v1/software/group-member | Regista novo membro de grupo de software. |
| [**softwareResourceCreateSoftwareTransmitter**](SoftwareApi.md#softwareResourceCreateSoftwareTransmitter) | **POST** /v1/software/transmitter | Regista novo transmissor. |
| [**softwareResourceDeleteSoftwareCustomer**](SoftwareApi.md#softwareResourceDeleteSoftwareCustomer) | **DELETE** /v1/software/customer/{Id} | Elimina um contribuinte cliente de software. |
| [**softwareResourceDeleteSoftwareGroupMember**](SoftwareApi.md#softwareResourceDeleteSoftwareGroupMember) | **DELETE** /v1/software/group-member/{Id} | Elimina um membro de grupo de software. |
| [**softwareResourceDeleteSoftwareTransmitter**](SoftwareApi.md#softwareResourceDeleteSoftwareTransmitter) | **DELETE** /v1/software/transmitter/{Id} | Elimina um transmissor. |
| [**softwareResourceReadSoftwareCustomerById**](SoftwareApi.md#softwareResourceReadSoftwareCustomerById) | **GET** /v1/software/customer/{Id} | Consulta contribuinte cliente de software com ID. |
| [**softwareResourceReadSoftwareCustomerList**](SoftwareApi.md#softwareResourceReadSoftwareCustomerList) | **GET** /v1/software/customer | Lista contribuintes clientes de software. |
| [**softwareResourceReadSoftwareGroupMemberById**](SoftwareApi.md#softwareResourceReadSoftwareGroupMemberById) | **GET** /v1/software/group-member/{Id} | Consulta de membro de grupo de software com ID. |
| [**softwareResourceReadSoftwareGroupMemberList**](SoftwareApi.md#softwareResourceReadSoftwareGroupMemberList) | **GET** /v1/software/group-member | Lista de membros de grupo de software. |
| [**softwareResourceReadSoftwarePublicList**](SoftwareApi.md#softwareResourceReadSoftwarePublicList) | **GET** /v1/software | Lista de aplicações (software) de faturação/transmissão registadas na Plataforma Eletrónica. |
| [**softwareResourceReadSoftwareTransmitterById**](SoftwareApi.md#softwareResourceReadSoftwareTransmitterById) | **GET** /v1/software/transmitter/{Id} | Consulta transmissor com ID. |
| [**softwareResourceReadSoftwareTransmitterList**](SoftwareApi.md#softwareResourceReadSoftwareTransmitterList) | **GET** /v1/software/transmitter | Lista de transmissores associados a software. |
| [**softwareResourceUpdateSoftwareCustomer**](SoftwareApi.md#softwareResourceUpdateSoftwareCustomer) | **PUT** /v1/software/customer/{Id} | Atualiza um contribuinte cliente de software. |
| [**softwareResourceUpdateSoftwareCustomerEnabled**](SoftwareApi.md#softwareResourceUpdateSoftwareCustomerEnabled) | **PUT** /v1/software/customer/{Id}/enabled | Ativa/Desativa um contribuinte cliente de software. |
| [**softwareResourceUpdateSoftwareGroupMember**](SoftwareApi.md#softwareResourceUpdateSoftwareGroupMember) | **PUT** /v1/software/group-member/{Id} | Atualiza um membro de grupo de software. |
| [**softwareResourceUpdateSoftwareTransmitter**](SoftwareApi.md#softwareResourceUpdateSoftwareTransmitter) | **PUT** /v1/software/transmitter/{Id} | Atualiza um transmissor. |
| [**softwareResourceUpdateSoftwareTransmitterEnabled**](SoftwareApi.md#softwareResourceUpdateSoftwareTransmitterEnabled) | **PUT** /v1/software/transmitter/{Id}/enabled | Ativa/Desativa um transmissor. |



## softwareResourceCreateSoftwareCustomer

> PayloadProcessingResponseSoftwareCustomerEntity softwareResourceCreateSoftwareCustomer(softwareCustomerEntity)

Regista um novo contribuinte cliente de software.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        SoftwareCustomerEntity softwareCustomerEntity = new SoftwareCustomerEntity(); // SoftwareCustomerEntity | 
        try {
            PayloadProcessingResponseSoftwareCustomerEntity result = apiInstance.softwareResourceCreateSoftwareCustomer(softwareCustomerEntity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceCreateSoftwareCustomer");
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
| **softwareCustomerEntity** | [**SoftwareCustomerEntity**](SoftwareCustomerEntity.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseSoftwareCustomerEntity**](PayloadProcessingResponseSoftwareCustomerEntity.md)

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


## softwareResourceCreateSoftwareGroupMember

> PayloadProcessingResponseSoftwareGroupMemberEntity softwareResourceCreateSoftwareGroupMember(softwareGroupMemberEntity)

Regista novo membro de grupo de software.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        SoftwareGroupMemberEntity softwareGroupMemberEntity = new SoftwareGroupMemberEntity(); // SoftwareGroupMemberEntity | 
        try {
            PayloadProcessingResponseSoftwareGroupMemberEntity result = apiInstance.softwareResourceCreateSoftwareGroupMember(softwareGroupMemberEntity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceCreateSoftwareGroupMember");
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
| **softwareGroupMemberEntity** | [**SoftwareGroupMemberEntity**](SoftwareGroupMemberEntity.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseSoftwareGroupMemberEntity**](PayloadProcessingResponseSoftwareGroupMemberEntity.md)

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


## softwareResourceCreateSoftwareTransmitter

> PayloadProcessingResponseSoftwareTransmitterEntity softwareResourceCreateSoftwareTransmitter(softwareTransmitterEntity)

Regista novo transmissor.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        SoftwareTransmitterEntity softwareTransmitterEntity = new SoftwareTransmitterEntity(); // SoftwareTransmitterEntity | 
        try {
            PayloadProcessingResponseSoftwareTransmitterEntity result = apiInstance.softwareResourceCreateSoftwareTransmitter(softwareTransmitterEntity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceCreateSoftwareTransmitter");
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
| **softwareTransmitterEntity** | [**SoftwareTransmitterEntity**](SoftwareTransmitterEntity.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseSoftwareTransmitterEntity**](PayloadProcessingResponseSoftwareTransmitterEntity.md)

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


## softwareResourceDeleteSoftwareCustomer

> PayloadProcessingResponseBoolean softwareResourceDeleteSoftwareCustomer(id)

Elimina um contribuinte cliente de software.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            PayloadProcessingResponseBoolean result = apiInstance.softwareResourceDeleteSoftwareCustomer(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceDeleteSoftwareCustomer");
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


## softwareResourceDeleteSoftwareGroupMember

> PayloadProcessingResponseBoolean softwareResourceDeleteSoftwareGroupMember(id)

Elimina um membro de grupo de software.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            PayloadProcessingResponseBoolean result = apiInstance.softwareResourceDeleteSoftwareGroupMember(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceDeleteSoftwareGroupMember");
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


## softwareResourceDeleteSoftwareTransmitter

> PayloadProcessingResponseBoolean softwareResourceDeleteSoftwareTransmitter(id)

Elimina um transmissor.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            PayloadProcessingResponseBoolean result = apiInstance.softwareResourceDeleteSoftwareTransmitter(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceDeleteSoftwareTransmitter");
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


## softwareResourceReadSoftwareCustomerById

> PayloadProcessingResponseSoftwareCustomerDto softwareResourceReadSoftwareCustomerById(id)

Consulta contribuinte cliente de software com ID.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            PayloadProcessingResponseSoftwareCustomerDto result = apiInstance.softwareResourceReadSoftwareCustomerById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceReadSoftwareCustomerById");
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

### Return type

[**PayloadProcessingResponseSoftwareCustomerDto**](PayloadProcessingResponseSoftwareCustomerDto.md)

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


## softwareResourceReadSoftwareCustomerList

> PayloadProcessingResponseListSoftwareCustomerDto softwareResourceReadSoftwareCustomerList()

Lista contribuintes clientes de software.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        try {
            PayloadProcessingResponseListSoftwareCustomerDto result = apiInstance.softwareResourceReadSoftwareCustomerList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceReadSoftwareCustomerList");
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

[**PayloadProcessingResponseListSoftwareCustomerDto**](PayloadProcessingResponseListSoftwareCustomerDto.md)

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


## softwareResourceReadSoftwareGroupMemberById

> PayloadProcessingResponseSoftwareGroupMemberDto softwareResourceReadSoftwareGroupMemberById(id)

Consulta de membro de grupo de software com ID.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            PayloadProcessingResponseSoftwareGroupMemberDto result = apiInstance.softwareResourceReadSoftwareGroupMemberById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceReadSoftwareGroupMemberById");
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

### Return type

[**PayloadProcessingResponseSoftwareGroupMemberDto**](PayloadProcessingResponseSoftwareGroupMemberDto.md)

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


## softwareResourceReadSoftwareGroupMemberList

> PayloadProcessingResponseListSoftwareGroupMemberDto softwareResourceReadSoftwareGroupMemberList()

Lista de membros de grupo de software.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        try {
            PayloadProcessingResponseListSoftwareGroupMemberDto result = apiInstance.softwareResourceReadSoftwareGroupMemberList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceReadSoftwareGroupMemberList");
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

[**PayloadProcessingResponseListSoftwareGroupMemberDto**](PayloadProcessingResponseListSoftwareGroupMemberDto.md)

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


## softwareResourceReadSoftwarePublicList

> PayloadProcessingResponseListSoftwareDto softwareResourceReadSoftwarePublicList()

Lista de aplicações (software) de faturação/transmissão registadas na Plataforma Eletrónica.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        try {
            PayloadProcessingResponseListSoftwareDto result = apiInstance.softwareResourceReadSoftwarePublicList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceReadSoftwarePublicList");
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

[**PayloadProcessingResponseListSoftwareDto**](PayloadProcessingResponseListSoftwareDto.md)

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


## softwareResourceReadSoftwareTransmitterById

> PayloadProcessingResponseSoftwareTransmitterDto softwareResourceReadSoftwareTransmitterById(id)

Consulta transmissor com ID.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            PayloadProcessingResponseSoftwareTransmitterDto result = apiInstance.softwareResourceReadSoftwareTransmitterById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceReadSoftwareTransmitterById");
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

### Return type

[**PayloadProcessingResponseSoftwareTransmitterDto**](PayloadProcessingResponseSoftwareTransmitterDto.md)

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


## softwareResourceReadSoftwareTransmitterList

> PayloadProcessingResponseListSoftwareTransmitterDto softwareResourceReadSoftwareTransmitterList()

Lista de transmissores associados a software.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        try {
            PayloadProcessingResponseListSoftwareTransmitterDto result = apiInstance.softwareResourceReadSoftwareTransmitterList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceReadSoftwareTransmitterList");
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

[**PayloadProcessingResponseListSoftwareTransmitterDto**](PayloadProcessingResponseListSoftwareTransmitterDto.md)

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


## softwareResourceUpdateSoftwareCustomer

> PayloadProcessingResponseSoftwareCustomerEntity softwareResourceUpdateSoftwareCustomer(id, softwareCustomerEntity)

Atualiza um contribuinte cliente de software.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        SoftwareCustomerEntity softwareCustomerEntity = new SoftwareCustomerEntity(); // SoftwareCustomerEntity | 
        try {
            PayloadProcessingResponseSoftwareCustomerEntity result = apiInstance.softwareResourceUpdateSoftwareCustomer(id, softwareCustomerEntity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceUpdateSoftwareCustomer");
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
| **softwareCustomerEntity** | [**SoftwareCustomerEntity**](SoftwareCustomerEntity.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseSoftwareCustomerEntity**](PayloadProcessingResponseSoftwareCustomerEntity.md)

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


## softwareResourceUpdateSoftwareCustomerEnabled

> PayloadProcessingResponseSoftwareCustomerEntity softwareResourceUpdateSoftwareCustomerEnabled(id, softwareCustomerEntity)

Ativa/Desativa um contribuinte cliente de software.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        SoftwareCustomerEntity softwareCustomerEntity = new SoftwareCustomerEntity(); // SoftwareCustomerEntity | 
        try {
            PayloadProcessingResponseSoftwareCustomerEntity result = apiInstance.softwareResourceUpdateSoftwareCustomerEnabled(id, softwareCustomerEntity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceUpdateSoftwareCustomerEnabled");
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
| **softwareCustomerEntity** | [**SoftwareCustomerEntity**](SoftwareCustomerEntity.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseSoftwareCustomerEntity**](PayloadProcessingResponseSoftwareCustomerEntity.md)

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


## softwareResourceUpdateSoftwareGroupMember

> PayloadProcessingResponseSoftwareGroupMemberEntity softwareResourceUpdateSoftwareGroupMember(id, softwareGroupMemberEntity)

Atualiza um membro de grupo de software.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        SoftwareGroupMemberEntity softwareGroupMemberEntity = new SoftwareGroupMemberEntity(); // SoftwareGroupMemberEntity | 
        try {
            PayloadProcessingResponseSoftwareGroupMemberEntity result = apiInstance.softwareResourceUpdateSoftwareGroupMember(id, softwareGroupMemberEntity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceUpdateSoftwareGroupMember");
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
| **softwareGroupMemberEntity** | [**SoftwareGroupMemberEntity**](SoftwareGroupMemberEntity.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseSoftwareGroupMemberEntity**](PayloadProcessingResponseSoftwareGroupMemberEntity.md)

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


## softwareResourceUpdateSoftwareTransmitter

> PayloadProcessingResponseSoftwareTransmitterEntity softwareResourceUpdateSoftwareTransmitter(id, softwareTransmitterEntity)

Atualiza um transmissor.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        SoftwareTransmitterEntity softwareTransmitterEntity = new SoftwareTransmitterEntity(); // SoftwareTransmitterEntity | 
        try {
            PayloadProcessingResponseSoftwareTransmitterEntity result = apiInstance.softwareResourceUpdateSoftwareTransmitter(id, softwareTransmitterEntity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceUpdateSoftwareTransmitter");
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
| **softwareTransmitterEntity** | [**SoftwareTransmitterEntity**](SoftwareTransmitterEntity.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseSoftwareTransmitterEntity**](PayloadProcessingResponseSoftwareTransmitterEntity.md)

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


## softwareResourceUpdateSoftwareTransmitterEnabled

> PayloadProcessingResponseSoftwareTransmitterEntity softwareResourceUpdateSoftwareTransmitterEnabled(id, softwareTransmitterEntity)

Ativa/Desativa um transmissor.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.SoftwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        SoftwareApi apiInstance = new SoftwareApi(defaultClient);
        String id = "id_example"; // String | 
        SoftwareTransmitterEntity softwareTransmitterEntity = new SoftwareTransmitterEntity(); // SoftwareTransmitterEntity | 
        try {
            PayloadProcessingResponseSoftwareTransmitterEntity result = apiInstance.softwareResourceUpdateSoftwareTransmitterEnabled(id, softwareTransmitterEntity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftwareApi#softwareResourceUpdateSoftwareTransmitterEnabled");
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
| **softwareTransmitterEntity** | [**SoftwareTransmitterEntity**](SoftwareTransmitterEntity.md)|  | [optional] |

### Return type

[**PayloadProcessingResponseSoftwareTransmitterEntity**](PayloadProcessingResponseSoftwareTransmitterEntity.md)

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

