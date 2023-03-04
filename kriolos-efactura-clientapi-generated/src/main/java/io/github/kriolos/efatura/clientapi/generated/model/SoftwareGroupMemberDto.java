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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * SoftwareGroupMemberDto
 */
@JsonPropertyOrder({
  SoftwareGroupMemberDto.JSON_PROPERTY_ID,
  SoftwareGroupMemberDto.JSON_PROPERTY_SOFTWARE_CODE,
  SoftwareGroupMemberDto.JSON_PROPERTY_SOFTWARE_NAME,
  SoftwareGroupMemberDto.JSON_PROPERTY_GROUP_MEMBER_TAX_ID,
  SoftwareGroupMemberDto.JSON_PROPERTY_GROUP_MEMBER_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T23:31:50.801935300Z[Europe/Lisbon]")
public class SoftwareGroupMemberDto {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SOFTWARE_CODE = "softwareCode";
  private String softwareCode;

  public static final String JSON_PROPERTY_SOFTWARE_NAME = "softwareName";
  private String softwareName;

  public static final String JSON_PROPERTY_GROUP_MEMBER_TAX_ID = "groupMemberTaxId";
  private Integer groupMemberTaxId;

  public static final String JSON_PROPERTY_GROUP_MEMBER_NAME = "groupMemberName";
  private String groupMemberName;

  public SoftwareGroupMemberDto() { 
  }

  public SoftwareGroupMemberDto id(String id) {
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


  public SoftwareGroupMemberDto softwareCode(String softwareCode) {
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


  public SoftwareGroupMemberDto softwareName(String softwareName) {
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


  public SoftwareGroupMemberDto groupMemberTaxId(Integer groupMemberTaxId) {
    this.groupMemberTaxId = groupMemberTaxId;
    return this;
  }

   /**
   * Get groupMemberTaxId
   * @return groupMemberTaxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_MEMBER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroupMemberTaxId() {
    return groupMemberTaxId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_MEMBER_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupMemberTaxId(Integer groupMemberTaxId) {
    this.groupMemberTaxId = groupMemberTaxId;
  }


  public SoftwareGroupMemberDto groupMemberName(String groupMemberName) {
    this.groupMemberName = groupMemberName;
    return this;
  }

   /**
   * Get groupMemberName
   * @return groupMemberName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_MEMBER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupMemberName() {
    return groupMemberName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_MEMBER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupMemberName(String groupMemberName) {
    this.groupMemberName = groupMemberName;
  }


  /**
   * Return true if this SoftwareGroupMemberDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareGroupMemberDto softwareGroupMemberDto = (SoftwareGroupMemberDto) o;
    return Objects.equals(this.id, softwareGroupMemberDto.id) &&
        Objects.equals(this.softwareCode, softwareGroupMemberDto.softwareCode) &&
        Objects.equals(this.softwareName, softwareGroupMemberDto.softwareName) &&
        Objects.equals(this.groupMemberTaxId, softwareGroupMemberDto.groupMemberTaxId) &&
        Objects.equals(this.groupMemberName, softwareGroupMemberDto.groupMemberName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, softwareCode, softwareName, groupMemberTaxId, groupMemberName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareGroupMemberDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    softwareCode: ").append(toIndentedString(softwareCode)).append("\n");
    sb.append("    softwareName: ").append(toIndentedString(softwareName)).append("\n");
    sb.append("    groupMemberTaxId: ").append(toIndentedString(groupMemberTaxId)).append("\n");
    sb.append("    groupMemberName: ").append(toIndentedString(groupMemberName)).append("\n");
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
