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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * SoftwareTransmitterDto
 */
@JsonPropertyOrder({
  SoftwareTransmitterDto.JSON_PROPERTY_ID,
  SoftwareTransmitterDto.JSON_PROPERTY_SOFTWARE_CODE,
  SoftwareTransmitterDto.JSON_PROPERTY_SOFTWARE_NAME,
  SoftwareTransmitterDto.JSON_PROPERTY_TRANSMITTER_TAX_ID,
  SoftwareTransmitterDto.JSON_PROPERTY_TRANSMITTER_NAME,
  SoftwareTransmitterDto.JSON_PROPERTY_O_AUTH_CLIENT_ID,
  SoftwareTransmitterDto.JSON_PROPERTY_O_AUTH_CLIENT_SECRET,
  SoftwareTransmitterDto.JSON_PROPERTY_O_AUTH_REDIRECT_URIS,
  SoftwareTransmitterDto.JSON_PROPERTY_IS_ENABLED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T18:43:44.521602200-01:00[Atlantic/Cape_Verde]")
public class SoftwareTransmitterDto {
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

  public SoftwareTransmitterDto() { 
  }

  public SoftwareTransmitterDto id(String id) {
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


  public SoftwareTransmitterDto softwareCode(String softwareCode) {
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


  public SoftwareTransmitterDto softwareName(String softwareName) {
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


  public SoftwareTransmitterDto transmitterTaxId(Integer transmitterTaxId) {
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


  public SoftwareTransmitterDto transmitterName(String transmitterName) {
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


  public SoftwareTransmitterDto oAuthClientId(String oAuthClientId) {
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


  public SoftwareTransmitterDto oAuthClientSecret(String oAuthClientSecret) {
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


  public SoftwareTransmitterDto oAuthRedirectUris(List<String> oAuthRedirectUris) {
    this.oAuthRedirectUris = oAuthRedirectUris;
    return this;
  }

  public SoftwareTransmitterDto addOAuthRedirectUrisItem(String oAuthRedirectUrisItem) {
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


  public SoftwareTransmitterDto isEnabled(Boolean isEnabled) {
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


  /**
   * Return true if this SoftwareTransmitterDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareTransmitterDto softwareTransmitterDto = (SoftwareTransmitterDto) o;
    return Objects.equals(this.id, softwareTransmitterDto.id) &&
        Objects.equals(this.softwareCode, softwareTransmitterDto.softwareCode) &&
        Objects.equals(this.softwareName, softwareTransmitterDto.softwareName) &&
        Objects.equals(this.transmitterTaxId, softwareTransmitterDto.transmitterTaxId) &&
        Objects.equals(this.transmitterName, softwareTransmitterDto.transmitterName) &&
        Objects.equals(this.oAuthClientId, softwareTransmitterDto.oAuthClientId) &&
        Objects.equals(this.oAuthClientSecret, softwareTransmitterDto.oAuthClientSecret) &&
        Objects.equals(this.oAuthRedirectUris, softwareTransmitterDto.oAuthRedirectUris) &&
        Objects.equals(this.isEnabled, softwareTransmitterDto.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, softwareCode, softwareName, transmitterTaxId, transmitterName, oAuthClientId, oAuthClientSecret, oAuthRedirectUris, isEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareTransmitterDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    softwareCode: ").append(toIndentedString(softwareCode)).append("\n");
    sb.append("    softwareName: ").append(toIndentedString(softwareName)).append("\n");
    sb.append("    transmitterTaxId: ").append(toIndentedString(transmitterTaxId)).append("\n");
    sb.append("    transmitterName: ").append(toIndentedString(transmitterName)).append("\n");
    sb.append("    oAuthClientId: ").append(toIndentedString(oAuthClientId)).append("\n");
    sb.append("    oAuthClientSecret: ").append(toIndentedString(oAuthClientSecret)).append("\n");
    sb.append("    oAuthRedirectUris: ").append(toIndentedString(oAuthRedirectUris)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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

