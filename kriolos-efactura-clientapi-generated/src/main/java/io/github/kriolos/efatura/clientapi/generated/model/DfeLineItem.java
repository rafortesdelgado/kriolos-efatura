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
import io.github.kriolos.efatura.clientapi.generated.model.DfeProperty;
import io.github.kriolos.efatura.clientapi.generated.model.DfeStandardIdentification;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * DfeLineItem
 */
@JsonPropertyOrder({
  DfeLineItem.JSON_PROPERTY_DESCRIPTION,
  DfeLineItem.JSON_PROPERTY_NAME,
  DfeLineItem.JSON_PROPERTY_BRAND_NAME,
  DfeLineItem.JSON_PROPERTY_MODEL_NAME,
  DfeLineItem.JSON_PROPERTY_EMITTER_IDENTIFICATION,
  DfeLineItem.JSON_PROPERTY_STANDARD_IDENTIFICATION,
  DfeLineItem.JSON_PROPERTY_HAZARDOUS_RISK_INDICATOR,
  DfeLineItem.JSON_PROPERTY_ADDITIONAL_PROPERTIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T23:31:50.801935300Z[Europe/Lisbon]")
public class DfeLineItem {
  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_BRAND_NAME = "BrandName";
  private String brandName;

  public static final String JSON_PROPERTY_MODEL_NAME = "ModelName";
  private String modelName;

  public static final String JSON_PROPERTY_EMITTER_IDENTIFICATION = "EmitterIdentification";
  private String emitterIdentification;

  public static final String JSON_PROPERTY_STANDARD_IDENTIFICATION = "StandardIdentification";
  private DfeStandardIdentification standardIdentification;

  public static final String JSON_PROPERTY_HAZARDOUS_RISK_INDICATOR = "HazardousRiskIndicator";
  private Boolean hazardousRiskIndicator;

  public static final String JSON_PROPERTY_ADDITIONAL_PROPERTIES = "AdditionalProperties";
  private List<DfeProperty> additionalProperties = null;

  public DfeLineItem() { 
  }

  public DfeLineItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public DfeLineItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public DfeLineItem brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * Get brandName
   * @return brandName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandName() {
    return brandName;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public DfeLineItem modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModelName() {
    return modelName;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }


  public DfeLineItem emitterIdentification(String emitterIdentification) {
    this.emitterIdentification = emitterIdentification;
    return this;
  }

   /**
   * Get emitterIdentification
   * @return emitterIdentification
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMITTER_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmitterIdentification() {
    return emitterIdentification;
  }


  @JsonProperty(JSON_PROPERTY_EMITTER_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmitterIdentification(String emitterIdentification) {
    this.emitterIdentification = emitterIdentification;
  }


  public DfeLineItem standardIdentification(DfeStandardIdentification standardIdentification) {
    this.standardIdentification = standardIdentification;
    return this;
  }

   /**
   * Get standardIdentification
   * @return standardIdentification
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STANDARD_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DfeStandardIdentification getStandardIdentification() {
    return standardIdentification;
  }


  @JsonProperty(JSON_PROPERTY_STANDARD_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandardIdentification(DfeStandardIdentification standardIdentification) {
    this.standardIdentification = standardIdentification;
  }


  public DfeLineItem hazardousRiskIndicator(Boolean hazardousRiskIndicator) {
    this.hazardousRiskIndicator = hazardousRiskIndicator;
    return this;
  }

   /**
   * Get hazardousRiskIndicator
   * @return hazardousRiskIndicator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAZARDOUS_RISK_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHazardousRiskIndicator() {
    return hazardousRiskIndicator;
  }


  @JsonProperty(JSON_PROPERTY_HAZARDOUS_RISK_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHazardousRiskIndicator(Boolean hazardousRiskIndicator) {
    this.hazardousRiskIndicator = hazardousRiskIndicator;
  }


  public DfeLineItem additionalProperties(List<DfeProperty> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public DfeLineItem addAdditionalPropertiesItem(DfeProperty additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new ArrayList<>();
    }
    this.additionalProperties.add(additionalPropertiesItem);
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DfeProperty> getAdditionalProperties() {
    return additionalProperties;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalProperties(List<DfeProperty> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   * Return true if this DfeLineItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfeLineItem dfeLineItem = (DfeLineItem) o;
    return Objects.equals(this.description, dfeLineItem.description) &&
        Objects.equals(this.name, dfeLineItem.name) &&
        Objects.equals(this.brandName, dfeLineItem.brandName) &&
        Objects.equals(this.modelName, dfeLineItem.modelName) &&
        Objects.equals(this.emitterIdentification, dfeLineItem.emitterIdentification) &&
        Objects.equals(this.standardIdentification, dfeLineItem.standardIdentification) &&
        Objects.equals(this.hazardousRiskIndicator, dfeLineItem.hazardousRiskIndicator) &&
        Objects.equals(this.additionalProperties, dfeLineItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, brandName, modelName, emitterIdentification, standardIdentification, hazardousRiskIndicator, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfeLineItem {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    emitterIdentification: ").append(toIndentedString(emitterIdentification)).append("\n");
    sb.append("    standardIdentification: ").append(toIndentedString(standardIdentification)).append("\n");
    sb.append("    hazardousRiskIndicator: ").append(toIndentedString(hazardousRiskIndicator)).append("\n");
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

