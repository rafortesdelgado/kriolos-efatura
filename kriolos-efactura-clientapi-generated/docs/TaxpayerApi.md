# TaxpayerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**taxPayerResourceSearch**](TaxpayerApi.md#taxPayerResourceSearch) | **GET** /v1/taxpayer/search | Pesquisa contribuintes por NIF e/ou Nome. |



## taxPayerResourceSearch

> PayloadProcessingResponseListSearchTaxPayerResponseDto taxPayerResourceSearch(name, taxId, type)

Pesquisa contribuintes por NIF e/ou Nome.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.TaxpayerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: SecurityScheme
        OAuth SecurityScheme = (OAuth) defaultClient.getAuthentication("SecurityScheme");
        SecurityScheme.setAccessToken("YOUR ACCESS TOKEN");

        TaxpayerApi apiInstance = new TaxpayerApi(defaultClient);
        String name = "name_example"; // String | Nome de contribuinte. Apenas letras, números e espaços.
        String taxId = "taxId_example"; // String | NIF CV de contribuinte. 9 dígitos.
        String type = "type_example"; // String | Tipo de contribuinte: S=Singular; C=Coletivo; N=Entidade Nacional; E=Entidade Estrangeira; F=Fundo de Investimento; H=Herança; O=Outra Entidade.
        try {
            PayloadProcessingResponseListSearchTaxPayerResponseDto result = apiInstance.taxPayerResourceSearch(name, taxId, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxpayerApi#taxPayerResourceSearch");
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
| **name** | **String**| Nome de contribuinte. Apenas letras, números e espaços. | [optional] |
| **taxId** | **String**| NIF CV de contribuinte. 9 dígitos. | [optional] |
| **type** | **String**| Tipo de contribuinte: S&#x3D;Singular; C&#x3D;Coletivo; N&#x3D;Entidade Nacional; E&#x3D;Entidade Estrangeira; F&#x3D;Fundo de Investimento; H&#x3D;Herança; O&#x3D;Outra Entidade. | [optional] |

### Return type

[**PayloadProcessingResponseListSearchTaxPayerResponseDto**](PayloadProcessingResponseListSearchTaxPayerResponseDto.md)

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

