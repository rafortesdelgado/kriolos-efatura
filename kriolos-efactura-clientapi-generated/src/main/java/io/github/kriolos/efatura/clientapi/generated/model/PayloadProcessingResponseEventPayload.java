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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.kriolos.efatura.clientapi.generated.model.EfTaxId;
import io.github.kriolos.efatura.clientapi.generated.model.EfTransmission;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * PayloadProcessingResponseEventPayload
 */
@JsonPropertyOrder({
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_ID,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_VERSION,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_TRANSMISSION,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_REPOSITORY_CODE,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_EVENT_TYPE_CODE,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_EMITTER_TAX_ID,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_ISSUE_DATE_TIME,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_ISSUE_REASON_DESCRIPTION,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_IU_DS,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_YEAR,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_LED_CODE,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_LED_DESCRIPTION,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_SERIE,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_DOCUMENT_TYPE_CODE,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_DOCUMENT_NUMBER_START,
  PayloadProcessingResponseEventPayload.JSON_PROPERTY_DOCUMENT_NUMBER_END
})
@JsonTypeName("PayloadProcessingResponseEvent_payload")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T16:11:19.537447100-01:00[Atlantic/Cape_Verde]")
public class PayloadProcessingResponseEventPayload {
  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "Version";
  private String version;

  public static final String JSON_PROPERTY_TRANSMISSION = "Transmission";
  private EfTransmission transmission;

  public static final String JSON_PROPERTY_REPOSITORY_CODE = "RepositoryCode";
  private Integer repositoryCode;

  public static final String JSON_PROPERTY_EVENT_TYPE_CODE = "EventTypeCode";
  private String eventTypeCode;

  public static final String JSON_PROPERTY_EMITTER_TAX_ID = "EmitterTaxId";
  private EfTaxId emitterTaxId;

  public static final String JSON_PROPERTY_ISSUE_DATE_TIME = "IssueDateTime";
  private String issueDateTime;

  public static final String JSON_PROPERTY_ISSUE_REASON_DESCRIPTION = "IssueReasonDescription";
  private String issueReasonDescription;

  public static final String JSON_PROPERTY_IU_DS = "IUDs";
  private List<String> iuDs = null;

  public static final String JSON_PROPERTY_YEAR = "Year";
  private Integer year;

  public static final String JSON_PROPERTY_LED_CODE = "LedCode";
  private Integer ledCode;

  public static final String JSON_PROPERTY_LED_DESCRIPTION = "LedDescription";
  private String ledDescription;

  public static final String JSON_PROPERTY_SERIE = "Serie";
  private String serie;

  public static final String JSON_PROPERTY_DOCUMENT_TYPE_CODE = "DocumentTypeCode";
  private Integer documentTypeCode;

  public static final String JSON_PROPERTY_DOCUMENT_NUMBER_START = "DocumentNumberStart";
  private Integer documentNumberStart;

  public static final String JSON_PROPERTY_DOCUMENT_NUMBER_END = "DocumentNumberEnd";
  private Integer documentNumberEnd;

  public PayloadProcessingResponseEventPayload() { 
  }

  public PayloadProcessingResponseEventPayload id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public PayloadProcessingResponseEventPayload version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public PayloadProcessingResponseEventPayload transmission(EfTransmission transmission) {
    this.transmission = transmission;
    return this;
  }

   /**
   * Get transmission
   * @return transmission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EfTransmission getTransmission() {
    return transmission;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmission(EfTransmission transmission) {
    this.transmission = transmission;
  }


  public PayloadProcessingResponseEventPayload repositoryCode(Integer repositoryCode) {
    this.repositoryCode = repositoryCode;
    return this;
  }

   /**
   * Get repositoryCode
   * @return repositoryCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRepositoryCode() {
    return repositoryCode;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepositoryCode(Integer repositoryCode) {
    this.repositoryCode = repositoryCode;
  }


  public PayloadProcessingResponseEventPayload eventTypeCode(String eventTypeCode) {
    this.eventTypeCode = eventTypeCode;
    return this;
  }

   /**
   * Get eventTypeCode
   * @return eventTypeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventTypeCode() {
    return eventTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventTypeCode(String eventTypeCode) {
    this.eventTypeCode = eventTypeCode;
  }


  public PayloadProcessingResponseEventPayload emitterTaxId(EfTaxId emitterTaxId) {
    this.emitterTaxId = emitterTaxId;
    return this;
  }

   /**
   * Get emitterTaxId
   * @return emitterTaxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMITTER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EfTaxId getEmitterTaxId() {
    return emitterTaxId;
  }


  @JsonProperty(JSON_PROPERTY_EMITTER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmitterTaxId(EfTaxId emitterTaxId) {
    this.emitterTaxId = emitterTaxId;
  }


  public PayloadProcessingResponseEventPayload issueDateTime(String issueDateTime) {
    this.issueDateTime = issueDateTime;
    return this;
  }

   /**
   * Get issueDateTime
   * @return issueDateTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueDateTime() {
    return issueDateTime;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueDateTime(String issueDateTime) {
    this.issueDateTime = issueDateTime;
  }


  public PayloadProcessingResponseEventPayload issueReasonDescription(String issueReasonDescription) {
    this.issueReasonDescription = issueReasonDescription;
    return this;
  }

   /**
   * Get issueReasonDescription
   * @return issueReasonDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_REASON_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueReasonDescription() {
    return issueReasonDescription;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_REASON_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueReasonDescription(String issueReasonDescription) {
    this.issueReasonDescription = issueReasonDescription;
  }


  public PayloadProcessingResponseEventPayload iuDs(List<String> iuDs) {
    this.iuDs = iuDs;
    return this;
  }

  public PayloadProcessingResponseEventPayload addIuDsItem(String iuDsItem) {
    if (this.iuDs == null) {
      this.iuDs = new ArrayList<>();
    }
    this.iuDs.add(iuDsItem);
    return this;
  }

   /**
   * Get iuDs
   * @return iuDs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IU_DS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIuDs() {
    return iuDs;
  }


  @JsonProperty(JSON_PROPERTY_IU_DS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIuDs(List<String> iuDs) {
    this.iuDs = iuDs;
  }


  public PayloadProcessingResponseEventPayload year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(Integer year) {
    this.year = year;
  }


  public PayloadProcessingResponseEventPayload ledCode(Integer ledCode) {
    this.ledCode = ledCode;
    return this;
  }

   /**
   * Get ledCode
   * @return ledCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LED_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLedCode() {
    return ledCode;
  }


  @JsonProperty(JSON_PROPERTY_LED_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLedCode(Integer ledCode) {
    this.ledCode = ledCode;
  }


  public PayloadProcessingResponseEventPayload ledDescription(String ledDescription) {
    this.ledDescription = ledDescription;
    return this;
  }

   /**
   * Get ledDescription
   * @return ledDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLedDescription() {
    return ledDescription;
  }


  @JsonProperty(JSON_PROPERTY_LED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLedDescription(String ledDescription) {
    this.ledDescription = ledDescription;
  }


  public PayloadProcessingResponseEventPayload serie(String serie) {
    this.serie = serie;
    return this;
  }

   /**
   * Get serie
   * @return serie
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerie() {
    return serie;
  }


  @JsonProperty(JSON_PROPERTY_SERIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerie(String serie) {
    this.serie = serie;
  }


  public PayloadProcessingResponseEventPayload documentTypeCode(Integer documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
    return this;
  }

   /**
   * Get documentTypeCode
   * @return documentTypeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDocumentTypeCode() {
    return documentTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentTypeCode(Integer documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
  }


  public PayloadProcessingResponseEventPayload documentNumberStart(Integer documentNumberStart) {
    this.documentNumberStart = documentNumberStart;
    return this;
  }

   /**
   * Get documentNumberStart
   * @return documentNumberStart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDocumentNumberStart() {
    return documentNumberStart;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentNumberStart(Integer documentNumberStart) {
    this.documentNumberStart = documentNumberStart;
  }


  public PayloadProcessingResponseEventPayload documentNumberEnd(Integer documentNumberEnd) {
    this.documentNumberEnd = documentNumberEnd;
    return this;
  }

   /**
   * Get documentNumberEnd
   * @return documentNumberEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDocumentNumberEnd() {
    return documentNumberEnd;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentNumberEnd(Integer documentNumberEnd) {
    this.documentNumberEnd = documentNumberEnd;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public PayloadProcessingResponseEventPayload putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this PayloadProcessingResponseEvent_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadProcessingResponseEventPayload payloadProcessingResponseEventPayload = (PayloadProcessingResponseEventPayload) o;
    return Objects.equals(this.id, payloadProcessingResponseEventPayload.id) &&
        Objects.equals(this.version, payloadProcessingResponseEventPayload.version) &&
        Objects.equals(this.transmission, payloadProcessingResponseEventPayload.transmission) &&
        Objects.equals(this.repositoryCode, payloadProcessingResponseEventPayload.repositoryCode) &&
        Objects.equals(this.eventTypeCode, payloadProcessingResponseEventPayload.eventTypeCode) &&
        Objects.equals(this.emitterTaxId, payloadProcessingResponseEventPayload.emitterTaxId) &&
        Objects.equals(this.issueDateTime, payloadProcessingResponseEventPayload.issueDateTime) &&
        Objects.equals(this.issueReasonDescription, payloadProcessingResponseEventPayload.issueReasonDescription) &&
        Objects.equals(this.iuDs, payloadProcessingResponseEventPayload.iuDs) &&
        Objects.equals(this.year, payloadProcessingResponseEventPayload.year) &&
        Objects.equals(this.ledCode, payloadProcessingResponseEventPayload.ledCode) &&
        Objects.equals(this.ledDescription, payloadProcessingResponseEventPayload.ledDescription) &&
        Objects.equals(this.serie, payloadProcessingResponseEventPayload.serie) &&
        Objects.equals(this.documentTypeCode, payloadProcessingResponseEventPayload.documentTypeCode) &&
        Objects.equals(this.documentNumberStart, payloadProcessingResponseEventPayload.documentNumberStart) &&
        Objects.equals(this.documentNumberEnd, payloadProcessingResponseEventPayload.documentNumberEnd)&&
        Objects.equals(this.additionalProperties, payloadProcessingResponseEventPayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, transmission, repositoryCode, eventTypeCode, emitterTaxId, issueDateTime, issueReasonDescription, iuDs, year, ledCode, ledDescription, serie, documentTypeCode, documentNumberStart, documentNumberEnd, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadProcessingResponseEventPayload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    transmission: ").append(toIndentedString(transmission)).append("\n");
    sb.append("    repositoryCode: ").append(toIndentedString(repositoryCode)).append("\n");
    sb.append("    eventTypeCode: ").append(toIndentedString(eventTypeCode)).append("\n");
    sb.append("    emitterTaxId: ").append(toIndentedString(emitterTaxId)).append("\n");
    sb.append("    issueDateTime: ").append(toIndentedString(issueDateTime)).append("\n");
    sb.append("    issueReasonDescription: ").append(toIndentedString(issueReasonDescription)).append("\n");
    sb.append("    iuDs: ").append(toIndentedString(iuDs)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    ledCode: ").append(toIndentedString(ledCode)).append("\n");
    sb.append("    ledDescription: ").append(toIndentedString(ledDescription)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    documentTypeCode: ").append(toIndentedString(documentTypeCode)).append("\n");
    sb.append("    documentNumberStart: ").append(toIndentedString(documentNumberStart)).append("\n");
    sb.append("    documentNumberEnd: ").append(toIndentedString(documentNumberEnd)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

