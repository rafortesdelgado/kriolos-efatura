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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * SoftwareCustomerEntity
 */
@JsonPropertyOrder({
  SoftwareCustomerEntity.JSON_PROPERTY_ID,
  SoftwareCustomerEntity.JSON_PROPERTY_SOFTWARE_CODE,
  SoftwareCustomerEntity.JSON_PROPERTY_TRANSMITTER_TAX_ID,
  SoftwareCustomerEntity.JSON_PROPERTY_CUSTOMER_TAX_ID,
  SoftwareCustomerEntity.JSON_PROPERTY_USE_EXCLUSIVE_O_AUTH_PARAMS,
  SoftwareCustomerEntity.JSON_PROPERTY_O_AUTH_CLIENT_ID,
  SoftwareCustomerEntity.JSON_PROPERTY_O_AUTH_CLIENT_SECRET,
  SoftwareCustomerEntity.JSON_PROPERTY_O_AUTH_REDIRECT_URIS,
  SoftwareCustomerEntity.JSON_PROPERTY_IS_ENABLED,
  SoftwareCustomerEntity.JSON_PROPERTY_CREATED,
  SoftwareCustomerEntity.JSON_PROPERTY_UPDATED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T23:31:50.801935300Z[Europe/Lisbon]")
public class SoftwareCustomerEntity {
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

  public SoftwareCustomerEntity() { 
  }

  public SoftwareCustomerEntity id(String id) {
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


  public SoftwareCustomerEntity softwareCode(String softwareCode) {
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


  public SoftwareCustomerEntity transmitterTaxId(Integer transmitterTaxId) {
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


  public SoftwareCustomerEntity customerTaxId(Integer customerTaxId) {
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


  public SoftwareCustomerEntity useExclusiveOAuthParams(Boolean useExclusiveOAuthParams) {
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


  public SoftwareCustomerEntity oAuthClientId(String oAuthClientId) {
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


  public SoftwareCustomerEntity oAuthClientSecret(String oAuthClientSecret) {
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


  public SoftwareCustomerEntity oAuthRedirectUris(List<String> oAuthRedirectUris) {
    this.oAuthRedirectUris = oAuthRedirectUris;
    return this;
  }

  public SoftwareCustomerEntity addOAuthRedirectUrisItem(String oAuthRedirectUrisItem) {
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


  public SoftwareCustomerEntity isEnabled(Boolean isEnabled) {
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


  public SoftwareCustomerEntity created(LocalDate created) {
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


  public SoftwareCustomerEntity updated(LocalDate updated) {
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
   * Return true if this SoftwareCustomerEntity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareCustomerEntity softwareCustomerEntity = (SoftwareCustomerEntity) o;
    return Objects.equals(this.id, softwareCustomerEntity.id) &&
        Objects.equals(this.softwareCode, softwareCustomerEntity.softwareCode) &&
        Objects.equals(this.transmitterTaxId, softwareCustomerEntity.transmitterTaxId) &&
        Objects.equals(this.customerTaxId, softwareCustomerEntity.customerTaxId) &&
        Objects.equals(this.useExclusiveOAuthParams, softwareCustomerEntity.useExclusiveOAuthParams) &&
        Objects.equals(this.oAuthClientId, softwareCustomerEntity.oAuthClientId) &&
        Objects.equals(this.oAuthClientSecret, softwareCustomerEntity.oAuthClientSecret) &&
        Objects.equals(this.oAuthRedirectUris, softwareCustomerEntity.oAuthRedirectUris) &&
        Objects.equals(this.isEnabled, softwareCustomerEntity.isEnabled) &&
        Objects.equals(this.created, softwareCustomerEntity.created) &&
        Objects.equals(this.updated, softwareCustomerEntity.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, softwareCode, transmitterTaxId, customerTaxId, useExclusiveOAuthParams, oAuthClientId, oAuthClientSecret, oAuthRedirectUris, isEnabled, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareCustomerEntity {\n");
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
