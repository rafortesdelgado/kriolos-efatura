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
import io.github.kriolos.efatura.clientapi.generated.model.Message;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseSoftwareCustomerDtoPayload;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * PayloadProcessingResponseSoftwareCustomerDto
 */
@JsonPropertyOrder({
  PayloadProcessingResponseSoftwareCustomerDto.JSON_PROPERTY_MESSAGES,
  PayloadProcessingResponseSoftwareCustomerDto.JSON_PROPERTY_SUCCEEDED,
  PayloadProcessingResponseSoftwareCustomerDto.JSON_PROPERTY_PAYLOAD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T22:35:54.857427200-01:00[Atlantic/Cape_Verde]")
public class PayloadProcessingResponseSoftwareCustomerDto {
  public static final String JSON_PROPERTY_MESSAGES = "messages";
  private List<Message> messages = null;

  public static final String JSON_PROPERTY_SUCCEEDED = "succeeded";
  private Boolean succeeded;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private PayloadProcessingResponseSoftwareCustomerDtoPayload payload;

  public PayloadProcessingResponseSoftwareCustomerDto() { 
  }

  public PayloadProcessingResponseSoftwareCustomerDto messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public PayloadProcessingResponseSoftwareCustomerDto addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Message> getMessages() {
    return messages;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }


  public PayloadProcessingResponseSoftwareCustomerDto succeeded(Boolean succeeded) {
    this.succeeded = succeeded;
    return this;
  }

   /**
   * Get succeeded
   * @return succeeded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSucceeded() {
    return succeeded;
  }


  @JsonProperty(JSON_PROPERTY_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
  }


  public PayloadProcessingResponseSoftwareCustomerDto payload(PayloadProcessingResponseSoftwareCustomerDtoPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PayloadProcessingResponseSoftwareCustomerDtoPayload getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayload(PayloadProcessingResponseSoftwareCustomerDtoPayload payload) {
    this.payload = payload;
  }


  /**
   * Return true if this PayloadProcessingResponseSoftwareCustomerDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadProcessingResponseSoftwareCustomerDto payloadProcessingResponseSoftwareCustomerDto = (PayloadProcessingResponseSoftwareCustomerDto) o;
    return Objects.equals(this.messages, payloadProcessingResponseSoftwareCustomerDto.messages) &&
        Objects.equals(this.succeeded, payloadProcessingResponseSoftwareCustomerDto.succeeded) &&
        Objects.equals(this.payload, payloadProcessingResponseSoftwareCustomerDto.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, succeeded, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadProcessingResponseSoftwareCustomerDto {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

