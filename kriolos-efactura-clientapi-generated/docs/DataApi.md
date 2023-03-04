# DataApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publicDataResourceGetPeDateTime**](DataApi.md#publicDataResourceGetPeDateTime) | **GET** /v1/data/pe-date-time | Devolve a data/hora atual da Plataforma Eletrónica. |



## publicDataResourceGetPeDateTime

> PayloadProcessingResponseString publicDataResourceGetPeDateTime()

Devolve a data/hora atual da Plataforma Eletrónica.

### Example

```java
// Import classes:
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.Configuration;
import io.github.kriolos.efatura.clientapi.generated.model.*;
import io.github.kriolos.efatura.clientapi.generated.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        try {
            PayloadProcessingResponseString result = apiInstance.publicDataResourceGetPeDateTime();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#publicDataResourceGetPeDateTime");
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

[**PayloadProcessingResponseString**](PayloadProcessingResponseString.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

