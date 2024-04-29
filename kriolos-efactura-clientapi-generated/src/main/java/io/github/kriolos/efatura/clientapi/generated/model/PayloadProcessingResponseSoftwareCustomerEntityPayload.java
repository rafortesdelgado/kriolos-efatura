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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * PayloadProcessingResponseSoftwareCustomerEntityPayload
 */
@JsonPropertyOrder({
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_ID,
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_SOFTWARE_CODE,
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_TRANSMITTER_TAX_ID,
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_CUSTOMER_TAX_ID,
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_USE_EXCLUSIVE_O_AUTH_PARAMS,
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_O_AUTH_CLIENT_ID,
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_O_AUTH_CLIENT_SECRET,
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_O_AUTH_REDIRECT_URIS,
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_IS_ENABLED,
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_CREATED,
  PayloadProcessingResponseSoftwareCustomerEntityPayload.JSON_PROPERTY_UPDATED
})
@JsonTypeName("PayloadProcessingResponseSoftwareCustomerEntity_payload")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T17:20:58.717987600-01:00[Atlantic/Cape_Verde]")
public class PayloadProcessingResponseSoftwareCustomerEntityPayload {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SOFTWARE_CODE = "softwareCode";
  private String softwareCode;

  public static final String JSON_PROPERTY_TRANSMITTER_TAX_ID = "transmitterTaxId";
  private Integer transmitterTaxId;

  public static final String JSON_PROPERTY_CUSTOMER_TAX_ID = "customerTaxId";
  private Integer customerTaxId;

  public static final String JSON_PROPERTY_USE_EXCLUSIVE_O_AUTH_PARAMS = "useExclusiveOAuthParams";
  private Boolean useExclusiveOAuthParams;

  public static final String JSON_PROPERTY_O_AUTH_CLIENT_ID = "oAuthClientId";
  private String oAuthClientId;

  public static final String JSON_PROPERTY_O_AUTH_CLIENT_SECRET = "oAuthClientSecret";
  private String oAuthClientSecret;

  public static final String JSON_PROPERTY_O_AUTH_REDIRECT_URIS = "oAuthRedirectUris";
  private List<String> oAuthRedirectUris = null;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_CREATED = "created";
  private LocalDate created;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private LocalDate updated;

  public PayloadProcessingResponseSoftwareCustomerEntityPayload() { 
  }

  public PayloadProcessingResponseSoftwareCustomerEntityPayload id(String id) {
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


  public PayloadProcessingResponseSoftwareCustomerEntityPayload softwareCode(String softwareCode) {
    this.softwareCode = softwareCode;
    return this;
  }

   /**
   * Get softwareCode
   * @return softwareCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOFTWARE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSoftwareCode() {
    return softwareCode;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareCode(String softwareCode) {
    this.softwareCode = softwareCode;
  }


  public PayloadProcessingResponseSoftwareCustomerEntityPayload transmitterTaxId(Integer transmitterTaxId) {
    this.transmitterTaxId = transmitterTaxId;
    return this;
  }

   /**
   * Get transmitterTaxId
   * minimum: 100000000
   * maximum: 999999999
   * @return transmitterTaxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSMITTER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTransmitterTaxId() {
    return transmitterTaxId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMITTER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmitterTaxId(Integer transmitterTaxId) {
    this.transmitterTaxId = transmitterTaxId;
  }


  public PayloadProcessingResponseSoftwareCustomerEntityPayload customerTaxId(Integer customerTaxId) {
    this.customerTaxId = customerTaxId;
    return this;
  }

   /**
   * Get customerTaxId
   * minimum: 100000000
   * maximum: 999999999
   * @return customerTaxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCustomerTaxId() {
    return customerTaxId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerTaxId(Integer customerTaxId) {
    this.customerTaxId = customerTaxId;
  }


  public PayloadProcessingResponseSoftwareCustomerEntityPayload useExclusiveOAuthParams(Boolean useExclusiveOAuthParams) {
    this.useExclusiveOAuthParams = useExclusiveOAuthParams;
    return this;
  }

   /**
   * Get useExclusiveOAuthParams
   * @return useExclusiveOAuthParams
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_EXCLUSIVE_O_AUTH_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseExclusiveOAuthParams() {
    return useExclusiveOAuthParams;
  }


  @JsonProperty(JSON_PROPERTY_USE_EXCLUSIVE_O_AUTH_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseExclusiveOAuthParams(Boolean useExclusiveOAuthParams) {
    this.useExclusiveOAuthParams = useExclusiveOAuthParams;
  }


  public PayloadProcessingResponseSoftwareCustomerEntityPayload oAuthClientId(String oAuthClientId) {
    this.oAuthClientId = oAuthClientId;
    return this;
  }

   /**
   * Get oAuthClientId
   * @return oAuthClientId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_O_AUTH_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getoAuthClientId() {
    return oAuthClientId;
  }


  @JsonProperty(JSON_PROPERTY_O_AUTH_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setoAuthClientId(String oAuthClientId) {
    this.oAuthClientId = oAuthClientId;
  }


  public PayloadProcessingResponseSoftwareCustomerEntityPayload oAuthClientSecret(String oAuthClientSecret) {
    this.oAuthClientSecret = oAuthClientSecret;
    return this;
  }

   /**
   * Get oAuthClientSecret
   * @return oAuthClientSecret
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_O_AUTH_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getoAuthClientSecret() {
    return oAuthClientSecret;
  }


  @JsonProperty(JSON_PROPERTY_O_AUTH_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setoAuthClientSecret(String oAuthClientSecret) {
    this.oAuthClientSecret = oAuthClientSecret;
  }


  public PayloadProcessingResponseSoftwareCustomerEntityPayload oAuthRedirectUris(List<String> oAuthRedirectUris) {
    this.oAuthRedirectUris = oAuthRedirectUris;
    return this;
  }

  public PayloadProcessingResponseSoftwareCustomerEntityPayload addOAuthRedirectUrisItem(String oAuthRedirectUrisItem) {
    if (this.oAuthRedirectUris == null) {
      this.oAuthRedirectUris = new ArrayList<>();
    }
    this.oAuthRedirectUris.add(oAuthRedirectUrisItem);
    return this;
  }

   /**
   * Get oAuthRedirectUris
   * @return oAuthRedirectUris
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_O_AUTH_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getoAuthRedirectUris() {
    return oAuthRedirectUris;
  }


  @JsonProperty(JSON_PROPERTY_O_AUTH_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setoAuthRedirectUris(List<String> oAuthRedirectUris) {
    this.oAuthRedirectUris = oAuthRedirectUris;
  }


  public PayloadProcessingResponseSoftwareCustomerEntityPayload isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public PayloadProcessingResponseSoftwareCustomerEntityPayload created(LocalDate created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(LocalDate created) {
    this.created = created;
  }


  public PayloadProcessingResponseSoftwareCustomerEntityPayload updated(LocalDate updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getUpdated() {
    return updated;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdated(LocalDate updated) {
    this.updated = updated;
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
  public PayloadProcessingResponseSoftwareCustomerEntityPayload putAdditionalProperty(String key, Object value) {
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
   * Return true if this PayloadProcessingResponseSoftwareCustomerEntity_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadProcessingResponseSoftwareCustomerEntityPayload payloadProcessingResponseSoftwareCustomerEntityPayload = (PayloadProcessingResponseSoftwareCustomerEntityPayload) o;
    return Objects.equals(this.id, payloadProcessingResponseSoftwareCustomerEntityPayload.id) &&
        Objects.equals(this.softwareCode, payloadProcessingResponseSoftwareCustomerEntityPayload.softwareCode) &&
        Objects.equals(this.transmitterTaxId, payloadProcessingResponseSoftwareCustomerEntityPayload.transmitterTaxId) &&
        Objects.equals(this.customerTaxId, payloadProcessingResponseSoftwareCustomerEntityPayload.customerTaxId) &&
        Objects.equals(this.useExclusiveOAuthParams, payloadProcessingResponseSoftwareCustomerEntityPayload.useExclusiveOAuthParams) &&
        Objects.equals(this.oAuthClientId, payloadProcessingResponseSoftwareCustomerEntityPayload.oAuthClientId) &&
        Objects.equals(this.oAuthClientSecret, payloadProcessingResponseSoftwareCustomerEntityPayload.oAuthClientSecret) &&
        Objects.equals(this.oAuthRedirectUris, payloadProcessingResponseSoftwareCustomerEntityPayload.oAuthRedirectUris) &&
        Objects.equals(this.isEnabled, payloadProcessingResponseSoftwareCustomerEntityPayload.isEnabled) &&
        Objects.equals(this.created, payloadProcessingResponseSoftwareCustomerEntityPayload.created) &&
        Objects.equals(this.updated, payloadProcessingResponseSoftwareCustomerEntityPayload.updated)&&
        Objects.equals(this.additionalProperties, payloadProcessingResponseSoftwareCustomerEntityPayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, softwareCode, transmitterTaxId, customerTaxId, useExclusiveOAuthParams, oAuthClientId, oAuthClientSecret, oAuthRedirectUris, isEnabled, created, updated, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadProcessingResponseSoftwareCustomerEntityPayload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    softwareCode: ").append(toIndentedString(softwareCode)).append("\n");
    sb.append("    transmitterTaxId: ").append(toIndentedString(transmitterTaxId)).append("\n");
    sb.append("    customerTaxId: ").append(toIndentedString(customerTaxId)).append("\n");
    sb.append("    useExclusiveOAuthParams: ").append(toIndentedString(useExclusiveOAuthParams)).append("\n");
    sb.append("    oAuthClientId: ").append(toIndentedString(oAuthClientId)).append("\n");
    sb.append("    oAuthClientSecret: ").append(toIndentedString(oAuthClientSecret)).append("\n");
    sb.append("    oAuthRedirectUris: ").append(toIndentedString(oAuthRedirectUris)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

