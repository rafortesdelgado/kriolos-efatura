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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * SoftwareDto
 */
@JsonPropertyOrder({
  SoftwareDto.JSON_PROPERTY_CODE,
  SoftwareDto.JSON_PROPERTY_NAME,
  SoftwareDto.JSON_PROPERTY_TYPE,
  SoftwareDto.JSON_PROPERTY_TAX_ID,
  SoftwareDto.JSON_PROPERTY_CREATED,
  SoftwareDto.JSON_PROPERTY_INTERNAL,
  SoftwareDto.JSON_PROPERTY_USER_JOINED_PE,
  SoftwareDto.JSON_PROPERTY_INTEGRATED_WITH_PE,
  SoftwareDto.JSON_PROPERTY_GROUP_MEMBERS,
  SoftwareDto.JSON_PROPERTY_TRANSMIT_LEVEL_DATE,
  SoftwareDto.JSON_PROPERTY_RECEIVE_LEVEL_DATE
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-23T13:33:35.367561143-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
public class SoftwareDto {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private Integer taxId;

  public static final String JSON_PROPERTY_CREATED = "created";
  private LocalDate created;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  private Boolean internal;

  public static final String JSON_PROPERTY_USER_JOINED_PE = "userJoinedPe";
  private Boolean userJoinedPe;

  public static final String JSON_PROPERTY_INTEGRATED_WITH_PE = "integratedWithPe";
  private Boolean integratedWithPe;

  public static final String JSON_PROPERTY_GROUP_MEMBERS = "groupMembers";
  private List<Integer> groupMembers = new ArrayList<>();

  public static final String JSON_PROPERTY_TRANSMIT_LEVEL_DATE = "transmitLevelDate";
  private LocalDate transmitLevelDate;

  public static final String JSON_PROPERTY_RECEIVE_LEVEL_DATE = "receiveLevelDate";
  private LocalDate receiveLevelDate;

  public SoftwareDto() { 
  }

  public SoftwareDto code(String code) {
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

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public SoftwareDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
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


  public SoftwareDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public SoftwareDto taxId(Integer taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Get taxId
   * @return taxId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTaxId() {
    return taxId;
  }


  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxId(Integer taxId) {
    this.taxId = taxId;
  }


  public SoftwareDto created(LocalDate created) {
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


  public SoftwareDto internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

  /**
   * Get internal
   * @return internal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInternal() {
    return internal;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public SoftwareDto userJoinedPe(Boolean userJoinedPe) {
    this.userJoinedPe = userJoinedPe;
    return this;
  }

  /**
   * Get userJoinedPe
   * @return userJoinedPe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_JOINED_PE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUserJoinedPe() {
    return userJoinedPe;
  }


  @JsonProperty(JSON_PROPERTY_USER_JOINED_PE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserJoinedPe(Boolean userJoinedPe) {
    this.userJoinedPe = userJoinedPe;
  }


  public SoftwareDto integratedWithPe(Boolean integratedWithPe) {
    this.integratedWithPe = integratedWithPe;
    return this;
  }

  /**
   * Get integratedWithPe
   * @return integratedWithPe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATED_WITH_PE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIntegratedWithPe() {
    return integratedWithPe;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATED_WITH_PE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegratedWithPe(Boolean integratedWithPe) {
    this.integratedWithPe = integratedWithPe;
  }


  public SoftwareDto groupMembers(List<Integer> groupMembers) {
    this.groupMembers = groupMembers;
    return this;
  }

  public SoftwareDto addGroupMembersItem(Integer groupMembersItem) {
    if (this.groupMembers == null) {
      this.groupMembers = new ArrayList<>();
    }
    this.groupMembers.add(groupMembersItem);
    return this;
  }

  /**
   * Get groupMembers
   * @return groupMembers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getGroupMembers() {
    return groupMembers;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupMembers(List<Integer> groupMembers) {
    this.groupMembers = groupMembers;
  }


  public SoftwareDto transmitLevelDate(LocalDate transmitLevelDate) {
    this.transmitLevelDate = transmitLevelDate;
    return this;
  }

  /**
   * Get transmitLevelDate
   * @return transmitLevelDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSMIT_LEVEL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getTransmitLevelDate() {
    return transmitLevelDate;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMIT_LEVEL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmitLevelDate(LocalDate transmitLevelDate) {
    this.transmitLevelDate = transmitLevelDate;
  }


  public SoftwareDto receiveLevelDate(LocalDate receiveLevelDate) {
    this.receiveLevelDate = receiveLevelDate;
    return this;
  }

  /**
   * Get receiveLevelDate
   * @return receiveLevelDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVE_LEVEL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getReceiveLevelDate() {
    return receiveLevelDate;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVE_LEVEL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiveLevelDate(LocalDate receiveLevelDate) {
    this.receiveLevelDate = receiveLevelDate;
  }


  /**
   * Return true if this SoftwareDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareDto softwareDto = (SoftwareDto) o;
    return Objects.equals(this.code, softwareDto.code) &&
        Objects.equals(this.name, softwareDto.name) &&
        Objects.equals(this.type, softwareDto.type) &&
        Objects.equals(this.taxId, softwareDto.taxId) &&
        Objects.equals(this.created, softwareDto.created) &&
        Objects.equals(this.internal, softwareDto.internal) &&
        Objects.equals(this.userJoinedPe, softwareDto.userJoinedPe) &&
        Objects.equals(this.integratedWithPe, softwareDto.integratedWithPe) &&
        Objects.equals(this.groupMembers, softwareDto.groupMembers) &&
        Objects.equals(this.transmitLevelDate, softwareDto.transmitLevelDate) &&
        Objects.equals(this.receiveLevelDate, softwareDto.receiveLevelDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, type, taxId, created, internal, userJoinedPe, integratedWithPe, groupMembers, transmitLevelDate, receiveLevelDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareDto {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    userJoinedPe: ").append(toIndentedString(userJoinedPe)).append("\n");
    sb.append("    integratedWithPe: ").append(toIndentedString(integratedWithPe)).append("\n");
    sb.append("    groupMembers: ").append(toIndentedString(groupMembers)).append("\n");
    sb.append("    transmitLevelDate: ").append(toIndentedString(transmitLevelDate)).append("\n");
    sb.append("    receiveLevelDate: ").append(toIndentedString(receiveLevelDate)).append("\n");
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
