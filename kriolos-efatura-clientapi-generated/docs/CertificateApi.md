# CertificateApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**certificateResourceGetKeystore**](CertificateApi.md#certificateResourceGetKeystore) | **GET** /v1/certificate/keystore | Consulta de keystore. |



## certificateResourceGetKeystore

> PayloadProcessingResponseString certificateResourceGetKeystore(useType, cvEfRepositoryCode)

Consulta de keystore.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.CertificateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        CertificateApi apiInstance = new CertificateApi(defaultClient);
        String useType = "useType_example"; // String | Tipo de Uso de Certificado: SIGN=Assinatura Qualificada; TLS=Autenticação TLS Mútua.
        String cvEfRepositoryCode = "cvEfRepositoryCode_example"; // String | Código de Repositório: 1-Principal; 2-Homologação; 3-Teste.
        try {
            PayloadProcessingResponseString result = apiInstance.certificateResourceGetKeystore(useType, cvEfRepositoryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CertificateApi#certificateResourceGetKeystore");
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
| **useType** | **String**| Tipo de Uso de Certificado: SIGN&#x3D;Assinatura Qualificada; TLS&#x3D;Autenticação TLS Mútua. | |
| **cvEfRepositoryCode** | **String**| Código de Repositório: 1-Principal; 2-Homologação; 3-Teste. | |

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

