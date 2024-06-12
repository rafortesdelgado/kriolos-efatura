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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * PayloadProcessingResponseSoftwareCustomerDtoPayload
 */
@JsonPropertyOrder({
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_ID,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_SOFTWARE_CODE,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_SOFTWARE_NAME,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_TRANSMITTER_TAX_ID,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_TRANSMITTER_NAME,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_O_AUTH_CLIENT_ID,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_O_AUTH_CLIENT_SECRET,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_O_AUTH_REDIRECT_URIS,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_IS_ENABLED,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_CUSTOMER_TAX_ID,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_CUSTOMER_NAME,
  PayloadProcessingResponseSoftwareCustomerDtoPayload.JSON_PROPERTY_USE_EXCLUSIVE_O_AUTH_PARAMS
})
@JsonTypeName("PayloadProcessingResponseSoftwareCustomerDto_payload")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T16:11:19.537447100-01:00[Atlantic/Cape_Verde]")
public class PayloadProcessingResponseSoftwareCustomerDtoPayload {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SOFTWARE_CODE = "softwareCode";
  private String softwareCode;

  public static final String JSON_PROPERTY_SOFTWARE_NAME = "softwareName";
  private String softwareName;

  public static final String JSON_PROPERTY_TRANSMITTER_TAX_ID = "transmitterTaxId";
  private Integer transmitterTaxId;

  public static final String JSON_PROPERTY_TRANSMITTER_NAME = "transmitterName";
  private String transmitterName;

  public static final String JSON_PROPERTY_O_AUTH_CLIENT_ID = "oAuthClientId";
  private String oAuthClientId;

  public static final String JSON_PROPERTY_O_AUTH_CLIENT_SECRET = "oAuthClientSecret";
  private String oAuthClientSecret;

  public static final String JSON_PROPERTY_O_AUTH_REDIRECT_URIS = "oAuthRedirectUris";
  private List<String> oAuthRedirectUris = null;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_CUSTOMER_TAX_ID = "customerTaxId";
  private Integer customerTaxId;

  public static final String JSON_PROPERTY_CUSTOMER_NAME = "customerName";
  private String customerName;

  public static final String JSON_PROPERTY_USE_EXCLUSIVE_O_AUTH_PARAMS = "useExclusiveOAuthParams";
  private Boolean useExclusiveOAuthParams;

  public PayloadProcessingResponseSoftwareCustomerDtoPayload() { 
  }

  public PayloadProcessingResponseSoftwareCustomerDtoPayload id(String id) {
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


  public PayloadProcessingResponseSoftwareCustomerDtoPayload softwareCode(String softwareCode) {
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


  public PayloadProcessingResponseSoftwareCustomerDtoPayload softwareName(String softwareName) {
    this.softwareName = softwareName;
    return this;
  }

   /**
   * Get softwareName
   * @return softwareName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOFTWARE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSoftwareName() {
    return softwareName;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareName(String softwareName) {
    this.softwareName = softwareName;
  }


  public PayloadProcessingResponseSoftwareCustomerDtoPayload transmitterTaxId(Integer transmitterTaxId) {
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

  public Integer getTransmitterTaxId() {
    return transmitterTaxId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMITTER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmitterTaxId(Integer transmitterTaxId) {
    this.transmitterTaxId = transmitterTaxId;
  }


  public PayloadProcessingResponseSoftwareCustomerDtoPayload transmitterName(String transmitterName) {
    this.transmitterName = transmitterName;
    return this;
  }

   /**
   * Get transmitterName
   * @return transmitterName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSMITTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransmitterName() {
    return transmitterName;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMITTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmitterName(String transmitterName) {
    this.transmitterName = transmitterName;
  }


  public PayloadProcessingResponseSoftwareCustomerDtoPayload oAuthClientId(String oAuthClientId) {
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


  public PayloadProcessingResponseSoftwareCustomerDtoPayload oAuthClientSecret(String oAuthClientSecret) {
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


  public PayloadProcessingResponseSoftwareCustomerDtoPayload oAuthRedirectUris(List<String> oAuthRedirectUris) {
    this.oAuthRedirectUris = oAuthRedirectUris;
    return this;
  }

  public PayloadProcessingResponseSoftwareCustomerDtoPayload addOAuthRedirectUrisItem(String oAuthRedirectUrisItem) {
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


  public PayloadProcessingResponseSoftwareCustomerDtoPayload isEnabled(Boolean isEnabled) {
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


  public PayloadProcessingResponseSoftwareCustomerDtoPayload customerTaxId(Integer customerTaxId) {
    this.customerTaxId = customerTaxId;
    return this;
  }

   /**
   * Get customerTaxId
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


  public PayloadProcessingResponseSoftwareCustomerDtoPayload customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerName() {
    return customerName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public PayloadProcessingResponseSoftwareCustomerDtoPayload useExclusiveOAuthParams(Boolean useExclusiveOAuthParams) {
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
  public PayloadProcessingResponseSoftwareCustomerDtoPayload putAdditionalProperty(String key, Object value) {
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
   * Return true if this PayloadProcessingResponseSoftwareCustomerDto_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadProcessingResponseSoftwareCustomerDtoPayload payloadProcessingResponseSoftwareCustomerDtoPayload = (PayloadProcessingResponseSoftwareCustomerDtoPayload) o;
    return Objects.equals(this.id, payloadProcessingResponseSoftwareCustomerDtoPayload.id) &&
        Objects.equals(this.softwareCode, payloadProcessingResponseSoftwareCustomerDtoPayload.softwareCode) &&
        Objects.equals(this.softwareName, payloadProcessingResponseSoftwareCustomerDtoPayload.softwareName) &&
        Objects.equals(this.transmitterTaxId, payloadProcessingResponseSoftwareCustomerDtoPayload.transmitterTaxId) &&
        Objects.equals(this.transmitterName, payloadProcessingResponseSoftwareCustomerDtoPayload.transmitterName) &&
        Objects.equals(this.oAuthClientId, payloadProcessingResponseSoftwareCustomerDtoPayload.oAuthClientId) &&
        Objects.equals(this.oAuthClientSecret, payloadProcessingResponseSoftwareCustomerDtoPayload.oAuthClientSecret) &&
        Objects.equals(this.oAuthRedirectUris, payloadProcessingResponseSoftwareCustomerDtoPayload.oAuthRedirectUris) &&
        Objects.equals(this.isEnabled, payloadProcessingResponseSoftwareCustomerDtoPayload.isEnabled) &&
        Objects.equals(this.customerTaxId, payloadProcessingResponseSoftwareCustomerDtoPayload.customerTaxId) &&
        Objects.equals(this.customerName, payloadProcessingResponseSoftwareCustomerDtoPayload.customerName) &&
        Objects.equals(this.useExclusiveOAuthParams, payloadProcessingResponseSoftwareCustomerDtoPayload.useExclusiveOAuthParams)&&
        Objects.equals(this.additionalProperties, payloadProcessingResponseSoftwareCustomerDtoPayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, softwareCode, softwareName, transmitterTaxId, transmitterName, oAuthClientId, oAuthClientSecret, oAuthRedirectUris, isEnabled, customerTaxId, customerName, useExclusiveOAuthParams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadProcessingResponseSoftwareCustomerDtoPayload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    softwareCode: ").append(toIndentedString(softwareCode)).append("\n");
    sb.append("    softwareName: ").append(toIndentedString(softwareName)).append("\n");
    sb.append("    transmitterTaxId: ").append(toIndentedString(transmitterTaxId)).append("\n");
    sb.append("    transmitterName: ").append(toIndentedString(transmitterName)).append("\n");
    sb.append("    oAuthClientId: ").append(toIndentedString(oAuthClientId)).append("\n");
    sb.append("    oAuthClientSecret: ").append(toIndentedString(oAuthClientSecret)).append("\n");
    sb.append("    oAuthRedirectUris: ").append(toIndentedString(oAuthRedirectUris)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    customerTaxId: ").append(toIndentedString(customerTaxId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    useExclusiveOAuthParams: ").append(toIndentedString(useExclusiveOAuthParams)).append("\n");
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

