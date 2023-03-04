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
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseSoftwareTransmitterEntityPayload;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * PayloadProcessingResponseSoftwareTransmitterEntity
 */
@JsonPropertyOrder({
  PayloadProcessingResponseSoftwareTransmitterEntity.JSON_PROPERTY_MESSAGES,
  PayloadProcessingResponseSoftwareTransmitterEntity.JSON_PROPERTY_PROCESSED_OBJECT,
  PayloadProcessingResponseSoftwareTransmitterEntity.JSON_PROPERTY_PROCESSING_ELAPSED_MILLISECONDS,
  PayloadProcessingResponseSoftwareTransmitterEntity.JSON_PROPERTY_SUCCEEDED,
  PayloadProcessingResponseSoftwareTransmitterEntity.JSON_PROPERTY_PAYLOAD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T23:31:50.801935300Z[Europe/Lisbon]")
public class PayloadProcessingResponseSoftwareTransmitterEntity {
  public static final String JSON_PROPERTY_MESSAGES = "messages";
  private List<Message> messages = null;

  public static final String JSON_PROPERTY_PROCESSED_OBJECT = "processedObject";
  private Object processedObject;

  public static final String JSON_PROPERTY_PROCESSING_ELAPSED_MILLISECONDS = "processingElapsedMilliseconds";
  private Long processingElapsedMilliseconds;

  public static final String JSON_PROPERTY_SUCCEEDED = "succeeded";
  private Boolean succeeded;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private PayloadProcessingResponseSoftwareTransmitterEntityPayload payload;

  public PayloadProcessingResponseSoftwareTransmitterEntity() { 
  }

  public PayloadProcessingResponseSoftwareTransmitterEntity messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public PayloadProcessingResponseSoftwareTransmitterEntity addMessagesItem(Message messagesItem) {
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


  public PayloadProcessingResponseSoftwareTransmitterEntity processedObject(Object processedObject) {
    this.processedObject = processedObject;
    return this;
  }

   /**
   * Get processedObject
   * @return processedObject
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSED_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getProcessedObject() {
    return processedObject;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSED_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessedObject(Object processedObject) {
    this.processedObject = processedObject;
  }


  public PayloadProcessingResponseSoftwareTransmitterEntity processingElapsedMilliseconds(Long processingElapsedMilliseconds) {
    this.processingElapsedMilliseconds = processingElapsedMilliseconds;
    return this;
  }

   /**
   * Get processingElapsedMilliseconds
   * @return processingElapsedMilliseconds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSING_ELAPSED_MILLISECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProcessingElapsedMilliseconds() {
    return processingElapsedMilliseconds;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSING_ELAPSED_MILLISECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingElapsedMilliseconds(Long processingElapsedMilliseconds) {
    this.processingElapsedMilliseconds = processingElapsedMilliseconds;
  }


  public PayloadProcessingResponseSoftwareTransmitterEntity succeeded(Boolean succeeded) {
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


  public PayloadProcessingResponseSoftwareTransmitterEntity payload(PayloadProcessingResponseSoftwareTransmitterEntityPayload payload) {
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

  public PayloadProcessingResponseSoftwareTransmitterEntityPayload getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayload(PayloadProcessingResponseSoftwareTransmitterEntityPayload payload) {
    this.payload = payload;
  }


  /**
   * Return true if this PayloadProcessingResponseSoftwareTransmitterEntity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadProcessingResponseSoftwareTransmitterEntity payloadProcessingResponseSoftwareTransmitterEntity = (PayloadProcessingResponseSoftwareTransmitterEntity) o;
    return Objects.equals(this.messages, payloadProcessingResponseSoftwareTransmitterEntity.messages) &&
        Objects.equals(this.processedObject, payloadProcessingResponseSoftwareTransmitterEntity.processedObject) &&
        Objects.equals(this.processingElapsedMilliseconds, payloadProcessingResponseSoftwareTransmitterEntity.processingElapsedMilliseconds) &&
        Objects.equals(this.succeeded, payloadProcessingResponseSoftwareTransmitterEntity.succeeded) &&
        Objects.equals(this.payload, payloadProcessingResponseSoftwareTransmitterEntity.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, processedObject, processingElapsedMilliseconds, succeeded, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadProcessingResponseSoftwareTransmitterEntity {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    processedObject: ").append(toIndentedString(processedObject)).append("\n");
    sb.append("    processingElapsedMilliseconds: ").append(toIndentedString(processingElapsedMilliseconds)).append("\n");
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

