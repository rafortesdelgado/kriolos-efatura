/*
 * e-Fatura API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: helpdesk@efatura.cv
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.kriolos.efatura.clientapi.generated.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.kriolos.efatura.clientapi.generated.model.Message;
import io.github.kriolos.efatura.clientapi.generated.model.SoftwareGroupMemberEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * PayloadProcessingResponseSoftwareGroupMemberEntity
 */
@JsonPropertyOrder({
  PayloadProcessingResponseSoftwareGroupMemberEntity.JSON_PROPERTY_MESSAGES,
  PayloadProcessingResponseSoftwareGroupMemberEntity.JSON_PROPERTY_SUCCEEDED,
  PayloadProcessingResponseSoftwareGroupMemberEntity.JSON_PROPERTY_PAYLOAD
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-01T21:45:11.948946335-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
public class PayloadProcessingResponseSoftwareGroupMemberEntity {
  public static final String JSON_PROPERTY_MESSAGES = "messages";
  private List<Message> messages = new ArrayList<>();

  public static final String JSON_PROPERTY_SUCCEEDED = "succeeded";
  private Boolean succeeded;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private SoftwareGroupMemberEntity payload;

  public PayloadProcessingResponseSoftwareGroupMemberEntity() { 
  }

  public PayloadProcessingResponseSoftwareGroupMemberEntity messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public PayloadProcessingResponseSoftwareGroupMemberEntity addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
   */
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


  public PayloadProcessingResponseSoftwareGroupMemberEntity succeeded(Boolean succeeded) {
    this.succeeded = succeeded;
    return this;
  }

  /**
   * Get succeeded
   * @return succeeded
   */
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


  public PayloadProcessingResponseSoftwareGroupMemberEntity payload(SoftwareGroupMemberEntity payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SoftwareGroupMemberEntity getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayload(SoftwareGroupMemberEntity payload) {
    this.payload = payload;
  }


  /**
   * Return true if this PayloadProcessingResponseSoftwareGroupMemberEntity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadProcessingResponseSoftwareGroupMemberEntity payloadProcessingResponseSoftwareGroupMemberEntity = (PayloadProcessingResponseSoftwareGroupMemberEntity) o;
    return Objects.equals(this.messages, payloadProcessingResponseSoftwareGroupMemberEntity.messages) &&
        Objects.equals(this.succeeded, payloadProcessingResponseSoftwareGroupMemberEntity.succeeded) &&
        Objects.equals(this.payload, payloadProcessingResponseSoftwareGroupMemberEntity.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, succeeded, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadProcessingResponseSoftwareGroupMemberEntity {\n");
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

