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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * SoftwareTransmitterEntity
 */
@JsonPropertyOrder({
  SoftwareTransmitterEntity.JSON_PROPERTY_ID,
  SoftwareTransmitterEntity.JSON_PROPERTY_SOFTWARE_CODE,
  SoftwareTransmitterEntity.JSON_PROPERTY_TRANSMITTER_TAX_ID,
  SoftwareTransmitterEntity.JSON_PROPERTY_O_AUTH_CLIENT_ID,
  SoftwareTransmitterEntity.JSON_PROPERTY_O_AUTH_CLIENT_SECRET,
  SoftwareTransmitterEntity.JSON_PROPERTY_O_AUTH_REDIRECT_URIS,
  SoftwareTransmitterEntity.JSON_PROPERTY_IS_ENABLED,
  SoftwareTransmitterEntity.JSON_PROPERTY_CREATED,
  SoftwareTransmitterEntity.JSON_PROPERTY_UPDATED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T17:20:58.717987600-01:00[Atlantic/Cape_Verde]")
public class SoftwareTransmitterEntity {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SOFTWARE_CODE = "softwareCode";
  private String softwareCode;

  public static final String JSON_PROPERTY_TRANSMITTER_TAX_ID = "transmitterTaxId";
  private Integer transmitterTaxId;

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

  public SoftwareTransmitterEntity() { 
  }

  public SoftwareTransmitterEntity id(String id) {
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


  public SoftwareTransmitterEntity softwareCode(String softwareCode) {
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


  public SoftwareTransmitterEntity transmitterTaxId(Integer transmitterTaxId) {
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


  public SoftwareTransmitterEntity oAuthClientId(String oAuthClientId) {
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


  public SoftwareTransmitterEntity oAuthClientSecret(String oAuthClientSecret) {
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


  public SoftwareTransmitterEntity oAuthRedirectUris(List<String> oAuthRedirectUris) {
    this.oAuthRedirectUris = oAuthRedirectUris;
    return this;
  }

  public SoftwareTransmitterEntity addOAuthRedirectUrisItem(String oAuthRedirectUrisItem) {
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


  public SoftwareTransmitterEntity isEnabled(Boolean isEnabled) {
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


  public SoftwareTransmitterEntity created(LocalDate created) {
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


  public SoftwareTransmitterEntity updated(LocalDate updated) {
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
   * Return true if this SoftwareTransmitterEntity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareTransmitterEntity softwareTransmitterEntity = (SoftwareTransmitterEntity) o;
    return Objects.equals(this.id, softwareTransmitterEntity.id) &&
        Objects.equals(this.softwareCode, softwareTransmitterEntity.softwareCode) &&
        Objects.equals(this.transmitterTaxId, softwareTransmitterEntity.transmitterTaxId) &&
        Objects.equals(this.oAuthClientId, softwareTransmitterEntity.oAuthClientId) &&
        Objects.equals(this.oAuthClientSecret, softwareTransmitterEntity.oAuthClientSecret) &&
        Objects.equals(this.oAuthRedirectUris, softwareTransmitterEntity.oAuthRedirectUris) &&
        Objects.equals(this.isEnabled, softwareTransmitterEntity.isEnabled) &&
        Objects.equals(this.created, softwareTransmitterEntity.created) &&
        Objects.equals(this.updated, softwareTransmitterEntity.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, softwareCode, transmitterTaxId, oAuthClientId, oAuthClientSecret, oAuthRedirectUris, isEnabled, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareTransmitterEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    softwareCode: ").append(toIndentedString(softwareCode)).append("\n");
    sb.append("    transmitterTaxId: ").append(toIndentedString(transmitterTaxId)).append("\n");
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

