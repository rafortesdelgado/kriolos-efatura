//package io.github.kriolos.efatura.service;
//
//
//
//import java.util.Objects;
//import java.util.Arrays;
//import com.google.gson.TypeAdapter;
//import com.google.gson.annotations.JsonAdapter;
//import com.google.gson.annotations.SerializedName;
//import com.google.gson.stream.JsonReader;
//import com.google.gson.stream.JsonWriter;
//import io.github.kriolos.efatura.clientapi.generated.model.DfeSummary;
//import io.github.kriolos.efatura.clientapi.generated.model.Message;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonDeserializationContext;
//import com.google.gson.JsonDeserializer;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParseException;
//import com.google.gson.TypeAdapterFactory;
//import com.google.gson.reflect.TypeToken;
//
//import java.lang.reflect.Type;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//import io.github.kriolos.efatura.clientapi.generated.JSON;
//
///**
// * DfeGetSummary
// */
//public class DfeGetSummary {
//  public static final String SERIALIZED_NAME_MESSAGES = "messages";
//  @SerializedName(SERIALIZED_NAME_MESSAGES)
//  private List<Message> messages = null;
//
//  public static final String SERIALIZED_NAME_PROCESSED_OBJECT = "processedObject";
//  @SerializedName(SERIALIZED_NAME_PROCESSED_OBJECT)
//  private Object processedObject;
//
//  public static final String SERIALIZED_NAME_PROCESSING_ELAPSED_MILLISECONDS = "processingElapsedMilliseconds";
//  @SerializedName(SERIALIZED_NAME_PROCESSING_ELAPSED_MILLISECONDS)
//  private Long processingElapsedMilliseconds;
//
//  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
//  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
//  private Boolean succeeded;
//
//  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
//  @SerializedName(SERIALIZED_NAME_PAYLOAD)
//  private List<DfeSummary> payload = null;
//
//  public DfeGetSummary() {
//  }
//
//  public DfeGetSummary messages(List<Message> messages) {
//    
//    this.messages = messages;
//    return this;
//  }
//
//  public DfeGetSummary addMessagesItem(Message messagesItem) {
//    if (this.messages == null) {
//      this.messages = new ArrayList<>();
//    }
//    this.messages.add(messagesItem);
//    return this;
//  }
//
//   /**
//   * Get messages
//   * @return messages
//  **/
//  @javax.annotation.Nullable
//  @ApiModelProperty(value = "")
//
//  public List<Message> getMessages() {
//    return messages;
//  }
//
//
//  public void setMessages(List<Message> messages) {
//    this.messages = messages;
//  }
//
//
//  public DfeGetSummary processedObject(Object processedObject) {
//    
//    this.processedObject = processedObject;
//    return this;
//  }
//
//   /**
//   * Get processedObject
//   * @return processedObject
//  **/
//  @javax.annotation.Nullable
//  @ApiModelProperty(value = "")
//
//  public Object getProcessedObject() {
//    return processedObject;
//  }
//
//
//  public void setProcessedObject(Object processedObject) {
//    this.processedObject = processedObject;
//  }
//
//
//  public DfeGetSummary processingElapsedMilliseconds(Long processingElapsedMilliseconds) {
//    
//    this.processingElapsedMilliseconds = processingElapsedMilliseconds;
//    return this;
//  }
//
//   /**
//   * Get processingElapsedMilliseconds
//   * @return processingElapsedMilliseconds
//  **/
//  @javax.annotation.Nullable
//  @ApiModelProperty(value = "")
//
//  public Long getProcessingElapsedMilliseconds() {
//    return processingElapsedMilliseconds;
//  }
//
//
//  public void setProcessingElapsedMilliseconds(Long processingElapsedMilliseconds) {
//    this.processingElapsedMilliseconds = processingElapsedMilliseconds;
//  }
//
//
//  public DfeGetSummary succeeded(Boolean succeeded) {
//    
//    this.succeeded = succeeded;
//    return this;
//  }
//
//   /**
//   * Get succeeded
//   * @return succeeded
//  **/
//  @javax.annotation.Nullable
//  @ApiModelProperty(value = "")
//
//  public Boolean getSucceeded() {
//    return succeeded;
//  }
//
//
//  public void setSucceeded(Boolean succeeded) {
//    this.succeeded = succeeded;
//  }
//
//
//  public DfeGetSummary payload(List<DfeSummary> payload) {
//    
//    this.payload = payload;
//    return this;
//  }
//
//  public DfeGetSummary addPayloadItem(DfeSummary payloadItem) {
//    if (this.payload == null) {
//      this.payload = new ArrayList<>();
//    }
//    this.payload.add(payloadItem);
//    return this;
//  }
//
//   /**
//   * Get payload
//   * @return payload
//  **/
//  @javax.annotation.Nullable
//  @ApiModelProperty(value = "")
//
//  public List<DfeSummary> getPayload() {
//    return payload;
//  }
//
//
//  public void setPayload(List<DfeSummary> payload) {
//    this.payload = payload;
//  }
//
//
//
//  @Override
//  public boolean equals(Object o) {
//    if (this == o) {
//      return true;
//    }
//    if (o == null || getClass() != o.getClass()) {
//      return false;
//    }
//    DfeGetSummary DfeGetSummary = (DfeGetSummary) o;
//    return Objects.equals(this.messages, DfeGetSummary.messages) &&
//        Objects.equals(this.processedObject, DfeGetSummary.processedObject) &&
//        Objects.equals(this.processingElapsedMilliseconds, DfeGetSummary.processingElapsedMilliseconds) &&
//        Objects.equals(this.succeeded, DfeGetSummary.succeeded) &&
//        Objects.equals(this.payload, DfeGetSummary.payload);
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(messages, processedObject, processingElapsedMilliseconds, succeeded, payload);
//  }
//
//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder();
//    sb.append("class DfeGetSummary {\n");
//    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
//    sb.append("    processedObject: ").append(toIndentedString(processedObject)).append("\n");
//    sb.append("    processingElapsedMilliseconds: ").append(toIndentedString(processingElapsedMilliseconds)).append("\n");
//    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
//    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
//    sb.append("}");
//    return sb.toString();
//  }
//
//  /**
//   * Convert the given object to string with each line indented by 4 spaces
//   * (except the first line).
//   */
//  private String toIndentedString(Object o) {
//    if (o == null) {
//      return "null";
//    }
//    return o.toString().replace("\n", "\n    ");
//  }
//
//
//  public static HashSet<String> openapiFields;
//  public static HashSet<String> openapiRequiredFields;
//
//  static {
//    // a set of all properties/fields (JSON key names)
//    openapiFields = new HashSet<String>();
//    openapiFields.add("messages");
//    openapiFields.add("processedObject");
//    openapiFields.add("processingElapsedMilliseconds");
//    openapiFields.add("succeeded");
//    openapiFields.add("payload");
//
//    // a set of required properties/fields (JSON key names)
//    openapiRequiredFields = new HashSet<String>();
//  }
//
// /**
//  * Validates the JSON Object and throws an exception if issues found
//  *
//  * @param jsonObj JSON Object
//  * @throws IOException if the JSON Object is invalid with respect to DfeGetSummary
//  */
//  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
//      if (jsonObj == null) {
//        if (!DfeGetSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
//          throw new IllegalArgumentException(String.format("The required field(s) %s in DfeGetSummary is not found in the empty JSON string", DfeGetSummary.openapiRequiredFields.toString()));
//        }
//      }
//
//      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
//      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!DfeGetSummary.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DfeGetSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }
//      if (jsonObj.get("messages") != null && !jsonObj.get("messages").isJsonNull()) {
//        JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
//        if (jsonArraymessages != null) {
//          // ensure the json data is an array
//          if (!jsonObj.get("messages").isJsonArray()) {
//            throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
//          }
//
//          // validate the optional field `messages` (array)
//          for (int i = 0; i < jsonArraymessages.size(); i++) {
//            Message.validateJsonObject(jsonArraymessages.get(i).getAsJsonObject());
//          };
//        }
//      }
//      if (jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) {
//        JsonArray jsonArraypayload = jsonObj.getAsJsonArray("payload");
//        if (jsonArraypayload != null) {
//          // ensure the json data is an array
//          if (!jsonObj.get("payload").isJsonArray()) {
//            throw new IllegalArgumentException(String.format("Expected the field `payload` to be an array in the JSON string but got `%s`", jsonObj.get("payload").toString()));
//          }
//
//          // validate the optional field `payload` (array)
//          for (int i = 0; i < jsonArraypayload.size(); i++) {
//            DfeSummary.validateJsonObject(jsonArraypayload.get(i).getAsJsonObject());
//          };
//        }
//      }
//  }
//
//  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
//    @SuppressWarnings("unchecked")
//    @Override
//    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
//       if (!DfeGetSummary.class.isAssignableFrom(type.getRawType())) {
//         return null; // this class only serializes 'DfeGetSummary' and its subtypes
//       }
//       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
//       final TypeAdapter<DfeGetSummary> thisAdapter
//                        = gson.getDelegateAdapter(this, TypeToken.get(DfeGetSummary.class));
//
//       return (TypeAdapter<T>) new TypeAdapter<DfeGetSummary>() {
//           @Override
//           public void write(JsonWriter out, DfeGetSummary value) throws IOException {
//             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
//             elementAdapter.write(out, obj);
//           }
//
//           @Override
//           public DfeGetSummary read(JsonReader in) throws IOException {
//             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
//             validateJsonObject(jsonObj);
//             return thisAdapter.fromJsonTree(jsonObj);
//           }
//
//       }.nullSafe();
//    }
//  }
//
// /**
//  * Create an instance of DfeGetSummary given an JSON string
//  *
//  * @param jsonString JSON string
//  * @return An instance of DfeGetSummary
//  * @throws IOException if the JSON string is invalid with respect to DfeGetSummary
//  */
//  public static DfeGetSummary fromJson(String jsonString) throws IOException {
//    return JSON.getGson().fromJson(jsonString, DfeGetSummary.class);
//  }
//
// /**
//  * Convert an instance of DfeGetSummary to an JSON string
//  *
//  * @return JSON string
//  */
//  public String toJson() {
//    return JSON.getGson().toJson(this);
//  }
//}
//
//
