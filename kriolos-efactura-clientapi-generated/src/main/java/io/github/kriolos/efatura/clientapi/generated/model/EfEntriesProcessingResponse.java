/*
 * e-Fatura API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: helpdesk@efatura.cv
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.kriolos.efatura.clientapi.generated.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.kriolos.efatura.clientapi.generated.model.EfEntryProcessingResponse;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * EfEntriesProcessingResponse
 */
@JsonPropertyOrder({
  EfEntriesProcessingResponse.JSON_PROPERTY_RESPONSES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T16:43:35.596432800-01:00[Atlantic/Cape_Verde]")
public class EfEntriesProcessingResponse {
  public static final String JSON_PROPERTY_RESPONSES = "responses";
  private List<EfEntryProcessingResponse> responses = null;

  public EfEntriesProcessingResponse() { 
  }

  public EfEntriesProcessingResponse responses(List<EfEntryProcessingResponse> responses) {
    this.responses = responses;
    return this;
  }

  public EfEntriesProcessingResponse addResponsesItem(EfEntryProcessingResponse responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
    return this;
  }

   /**
   * Get responses
   * @return responses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EfEntryProcessingResponse> getResponses() {
    return responses;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponses(List<EfEntryProcessingResponse> responses) {
    this.responses = responses;
  }


  /**
   * Return true if this EfEntriesProcessingResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EfEntriesProcessingResponse efEntriesProcessingResponse = (EfEntriesProcessingResponse) o;
    return Objects.equals(this.responses, efEntriesProcessingResponse.responses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EfEntriesProcessingResponse {\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

