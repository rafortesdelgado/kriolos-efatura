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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * SoftwareGroupMemberEntity
 */
@JsonPropertyOrder({
  SoftwareGroupMemberEntity.JSON_PROPERTY_ID,
  SoftwareGroupMemberEntity.JSON_PROPERTY_SOFTWARE_CODE,
  SoftwareGroupMemberEntity.JSON_PROPERTY_GROUP_MEMBER_TAX_ID,
  SoftwareGroupMemberEntity.JSON_PROPERTY_CREATED,
  SoftwareGroupMemberEntity.JSON_PROPERTY_UPDATED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T17:20:58.717987600-01:00[Atlantic/Cape_Verde]")
public class SoftwareGroupMemberEntity {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SOFTWARE_CODE = "softwareCode";
  private String softwareCode;

  public static final String JSON_PROPERTY_GROUP_MEMBER_TAX_ID = "groupMemberTaxId";
  private Integer groupMemberTaxId;

  public static final String JSON_PROPERTY_CREATED = "created";
  private LocalDate created;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private LocalDate updated;

  public SoftwareGroupMemberEntity() { 
  }

  public SoftwareGroupMemberEntity id(String id) {
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


  public SoftwareGroupMemberEntity softwareCode(String softwareCode) {
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


  public SoftwareGroupMemberEntity groupMemberTaxId(Integer groupMemberTaxId) {
    this.groupMemberTaxId = groupMemberTaxId;
    return this;
  }

   /**
   * Get groupMemberTaxId
   * minimum: 100000000
   * maximum: 999999999
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


  public SoftwareGroupMemberEntity created(LocalDate created) {
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


  public SoftwareGroupMemberEntity updated(LocalDate updated) {
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
   * Return true if this SoftwareGroupMemberEntity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareGroupMemberEntity softwareGroupMemberEntity = (SoftwareGroupMemberEntity) o;
    return Objects.equals(this.id, softwareGroupMemberEntity.id) &&
        Objects.equals(this.softwareCode, softwareGroupMemberEntity.softwareCode) &&
        Objects.equals(this.groupMemberTaxId, softwareGroupMemberEntity.groupMemberTaxId) &&
        Objects.equals(this.created, softwareGroupMemberEntity.created) &&
        Objects.equals(this.updated, softwareGroupMemberEntity.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, softwareCode, groupMemberTaxId, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareGroupMemberEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    softwareCode: ").append(toIndentedString(softwareCode)).append("\n");
    sb.append("    groupMemberTaxId: ").append(toIndentedString(groupMemberTaxId)).append("\n");
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

