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
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.kriolos.efatura.clientapi.generated.model.EfContingency;
import io.github.kriolos.efatura.clientapi.generated.model.EfSoftware;
import io.github.kriolos.efatura.clientapi.generated.model.EfTaxId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * EfTransmission
 */
@JsonPropertyOrder({
  EfTransmission.JSON_PROPERTY_ISSUE_MODE,
  EfTransmission.JSON_PROPERTY_TRANSMITTER_TAX_ID,
  EfTransmission.JSON_PROPERTY_SOFTWARE,
  EfTransmission.JSON_PROPERTY_CONTINGENCY
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T10:20:11.702467700-01:00[Atlantic/Cape_Verde]")
public class EfTransmission {
  public static final String JSON_PROPERTY_ISSUE_MODE = "IssueMode";
  private Integer issueMode;

  public static final String JSON_PROPERTY_TRANSMITTER_TAX_ID = "TransmitterTaxId";
  private EfTaxId transmitterTaxId;

  public static final String JSON_PROPERTY_SOFTWARE = "Software";
  private EfSoftware software;

  public static final String JSON_PROPERTY_CONTINGENCY = "Contingency";
  private EfContingency contingency;

  public EfTransmission() { 
  }

  public EfTransmission issueMode(Integer issueMode) {
    this.issueMode = issueMode;
    return this;
  }

   /**
   * Get issueMode
   * @return issueMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIssueMode() {
    return issueMode;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueMode(Integer issueMode) {
    this.issueMode = issueMode;
  }


  public EfTransmission transmitterTaxId(EfTaxId transmitterTaxId) {
    this.transmitterTaxId = transmitterTaxId;
    return this;
  }

   /**
   * Get transmitterTaxId
   * @return transmitterTaxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSMITTER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EfTaxId getTransmitterTaxId() {
    return transmitterTaxId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMITTER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmitterTaxId(EfTaxId transmitterTaxId) {
    this.transmitterTaxId = transmitterTaxId;
  }


  public EfTransmission software(EfSoftware software) {
    this.software = software;
    return this;
  }

   /**
   * Get software
   * @return software
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOFTWARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EfSoftware getSoftware() {
    return software;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftware(EfSoftware software) {
    this.software = software;
  }


  public EfTransmission contingency(EfContingency contingency) {
    this.contingency = contingency;
    return this;
  }

   /**
   * Get contingency
   * @return contingency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTINGENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EfContingency getContingency() {
    return contingency;
  }


  @JsonProperty(JSON_PROPERTY_CONTINGENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContingency(EfContingency contingency) {
    this.contingency = contingency;
  }


  /**
   * Return true if this EfTransmission object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EfTransmission efTransmission = (EfTransmission) o;
    return Objects.equals(this.issueMode, efTransmission.issueMode) &&
        Objects.equals(this.transmitterTaxId, efTransmission.transmitterTaxId) &&
        Objects.equals(this.software, efTransmission.software) &&
        Objects.equals(this.contingency, efTransmission.contingency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueMode, transmitterTaxId, software, contingency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EfTransmission {\n");
    sb.append("    issueMode: ").append(toIndentedString(issueMode)).append("\n");
    sb.append("    transmitterTaxId: ").append(toIndentedString(transmitterTaxId)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    contingency: ").append(toIndentedString(contingency)).append("\n");
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

