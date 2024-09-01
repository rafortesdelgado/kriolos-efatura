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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * DfeSelfBillingAuthorizeResponse
 */
@JsonPropertyOrder({
  DfeSelfBillingAuthorizeResponse.JSON_PROPERTY_AUTHORIZATION_ID,
  DfeSelfBillingAuthorizeResponse.JSON_PROPERTY_AUTHORIZATION_CODE_EXPIRATION_SECONDS,
  DfeSelfBillingAuthorizeResponse.JSON_PROPERTY_IUD,
  DfeSelfBillingAuthorizeResponse.JSON_PROPERTY_SERIE,
  DfeSelfBillingAuthorizeResponse.JSON_PROPERTY_LED_CODE,
  DfeSelfBillingAuthorizeResponse.JSON_PROPERTY_DOCUMENT_NUMBER
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-01T21:45:11.948946335-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
public class DfeSelfBillingAuthorizeResponse {
  public static final String JSON_PROPERTY_AUTHORIZATION_ID = "authorizationId";
  private UUID authorizationId;

  public static final String JSON_PROPERTY_AUTHORIZATION_CODE_EXPIRATION_SECONDS = "authorizationCodeExpirationSeconds";
  private Integer authorizationCodeExpirationSeconds;

  public static final String JSON_PROPERTY_IUD = "iud";
  private String iud;

  public static final String JSON_PROPERTY_SERIE = "serie";
  private String serie;

  public static final String JSON_PROPERTY_LED_CODE = "ledCode";
  private Integer ledCode;

  public static final String JSON_PROPERTY_DOCUMENT_NUMBER = "documentNumber";
  private Integer documentNumber;

  public DfeSelfBillingAuthorizeResponse() { 
  }

  public DfeSelfBillingAuthorizeResponse authorizationId(UUID authorizationId) {
    this.authorizationId = authorizationId;
    return this;
  }

  /**
   * Get authorizationId
   * @return authorizationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAuthorizationId() {
    return authorizationId;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationId(UUID authorizationId) {
    this.authorizationId = authorizationId;
  }


  public DfeSelfBillingAuthorizeResponse authorizationCodeExpirationSeconds(Integer authorizationCodeExpirationSeconds) {
    this.authorizationCodeExpirationSeconds = authorizationCodeExpirationSeconds;
    return this;
  }

  /**
   * Get authorizationCodeExpirationSeconds
   * @return authorizationCodeExpirationSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_CODE_EXPIRATION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAuthorizationCodeExpirationSeconds() {
    return authorizationCodeExpirationSeconds;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_CODE_EXPIRATION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationCodeExpirationSeconds(Integer authorizationCodeExpirationSeconds) {
    this.authorizationCodeExpirationSeconds = authorizationCodeExpirationSeconds;
  }


  public DfeSelfBillingAuthorizeResponse iud(String iud) {
    this.iud = iud;
    return this;
  }

  /**
   * Get iud
   * @return iud
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIud() {
    return iud;
  }


  @JsonProperty(JSON_PROPERTY_IUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIud(String iud) {
    this.iud = iud;
  }


  public DfeSelfBillingAuthorizeResponse serie(String serie) {
    this.serie = serie;
    return this;
  }

  /**
   * Get serie
   * @return serie
   */
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


  public DfeSelfBillingAuthorizeResponse ledCode(Integer ledCode) {
    this.ledCode = ledCode;
    return this;
  }

  /**
   * Get ledCode
   * @return ledCode
   */
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


  public DfeSelfBillingAuthorizeResponse documentNumber(Integer documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDocumentNumber() {
    return documentNumber;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentNumber(Integer documentNumber) {
    this.documentNumber = documentNumber;
  }


  /**
   * Return true if this DfeSelfBillingAuthorizeResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfeSelfBillingAuthorizeResponse dfeSelfBillingAuthorizeResponse = (DfeSelfBillingAuthorizeResponse) o;
    return Objects.equals(this.authorizationId, dfeSelfBillingAuthorizeResponse.authorizationId) &&
        Objects.equals(this.authorizationCodeExpirationSeconds, dfeSelfBillingAuthorizeResponse.authorizationCodeExpirationSeconds) &&
        Objects.equals(this.iud, dfeSelfBillingAuthorizeResponse.iud) &&
        Objects.equals(this.serie, dfeSelfBillingAuthorizeResponse.serie) &&
        Objects.equals(this.ledCode, dfeSelfBillingAuthorizeResponse.ledCode) &&
        Objects.equals(this.documentNumber, dfeSelfBillingAuthorizeResponse.documentNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationId, authorizationCodeExpirationSeconds, iud, serie, ledCode, documentNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfeSelfBillingAuthorizeResponse {\n");
    sb.append("    authorizationId: ").append(toIndentedString(authorizationId)).append("\n");
    sb.append("    authorizationCodeExpirationSeconds: ").append(toIndentedString(authorizationCodeExpirationSeconds)).append("\n");
    sb.append("    iud: ").append(toIndentedString(iud)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    ledCode: ").append(toIndentedString(ledCode)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
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

