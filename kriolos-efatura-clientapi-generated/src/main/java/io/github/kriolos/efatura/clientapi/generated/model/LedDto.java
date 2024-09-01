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
import java.time.LocalDate;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * LedDto
 */
@JsonPropertyOrder({
  LedDto.JSON_PROPERTY_CODE,
  LedDto.JSON_PROPERTY_DESCRIPTION,
  LedDto.JSON_PROPERTY_SERIE,
  LedDto.JSON_PROPERTY_ADDRESS_CODE,
  LedDto.JSON_PROPERTY_ADDRESS_DETAIL,
  LedDto.JSON_PROPERTY_SOFTWARE_CODE,
  LedDto.JSON_PROPERTY_CREATED
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-01T21:45:11.948946335-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
public class LedDto {
  public static final String JSON_PROPERTY_CODE = "code";
  private Integer code;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SERIE = "serie";
  private String serie;

  public static final String JSON_PROPERTY_ADDRESS_CODE = "addressCode";
  private String addressCode;

  public static final String JSON_PROPERTY_ADDRESS_DETAIL = "addressDetail";
  private String addressDetail;

  public static final String JSON_PROPERTY_SOFTWARE_CODE = "softwareCode";
  private String softwareCode;

  public static final String JSON_PROPERTY_CREATED = "created";
  private LocalDate created;

  public LedDto() { 
  }

  public LedDto code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(Integer code) {
    this.code = code;
  }


  public LedDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
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


  public LedDto serie(String serie) {
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


  public LedDto addressCode(String addressCode) {
    this.addressCode = addressCode;
    return this;
  }

  /**
   * Get addressCode
   * @return addressCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressCode() {
    return addressCode;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressCode(String addressCode) {
    this.addressCode = addressCode;
  }


  public LedDto addressDetail(String addressDetail) {
    this.addressDetail = addressDetail;
    return this;
  }

  /**
   * Get addressDetail
   * @return addressDetail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressDetail() {
    return addressDetail;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressDetail(String addressDetail) {
    this.addressDetail = addressDetail;
  }


  public LedDto softwareCode(String softwareCode) {
    this.softwareCode = softwareCode;
    return this;
  }

  /**
   * Get softwareCode
   * @return softwareCode
   */
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


  public LedDto created(LocalDate created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
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


  /**
   * Return true if this LedDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LedDto ledDto = (LedDto) o;
    return Objects.equals(this.code, ledDto.code) &&
        Objects.equals(this.description, ledDto.description) &&
        Objects.equals(this.serie, ledDto.serie) &&
        Objects.equals(this.addressCode, ledDto.addressCode) &&
        Objects.equals(this.addressDetail, ledDto.addressDetail) &&
        Objects.equals(this.softwareCode, ledDto.softwareCode) &&
        Objects.equals(this.created, ledDto.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, serie, addressCode, addressDetail, softwareCode, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LedDto {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    addressCode: ").append(toIndentedString(addressCode)).append("\n");
    sb.append("    addressDetail: ").append(toIndentedString(addressDetail)).append("\n");
    sb.append("    softwareCode: ").append(toIndentedString(softwareCode)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

