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
import io.github.kriolos.efatura.clientapi.generated.model.Address;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * DfeRentReceipt
 */
@JsonPropertyOrder({
  DfeRentReceipt.JSON_PROPERTY_ASSET_ID,
  DfeRentReceipt.JSON_PROPERTY_RENT_PURPOSE_TYPE_CODE,
  DfeRentReceipt.JSON_PROPERTY_CONTRACT_TYPE_CODE,
  DfeRentReceipt.JSON_PROPERTY_RENT_TYPE_CODE,
  DfeRentReceipt.JSON_PROPERTY_REFERENCE_PERIOD,
  DfeRentReceipt.JSON_PROPERTY_ADDRESS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T16:59:08.260554600-01:00[Atlantic/Cape_Verde]")
public class DfeRentReceipt {
  public static final String JSON_PROPERTY_ASSET_ID = "AssetId";
  private String assetId;

  public static final String JSON_PROPERTY_RENT_PURPOSE_TYPE_CODE = "RentPurposeTypeCode";
  private Integer rentPurposeTypeCode;

  public static final String JSON_PROPERTY_CONTRACT_TYPE_CODE = "ContractTypeCode";
  private Integer contractTypeCode;

  public static final String JSON_PROPERTY_RENT_TYPE_CODE = "RentTypeCode";
  private Integer rentTypeCode;

  public static final String JSON_PROPERTY_REFERENCE_PERIOD = "ReferencePeriod";
  private String referencePeriod;

  public static final String JSON_PROPERTY_ADDRESS = "Address";
  private Address address;

  public DfeRentReceipt() { 
  }

  public DfeRentReceipt assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetId() {
    return assetId;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public DfeRentReceipt rentPurposeTypeCode(Integer rentPurposeTypeCode) {
    this.rentPurposeTypeCode = rentPurposeTypeCode;
    return this;
  }

   /**
   * Get rentPurposeTypeCode
   * @return rentPurposeTypeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENT_PURPOSE_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRentPurposeTypeCode() {
    return rentPurposeTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_RENT_PURPOSE_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRentPurposeTypeCode(Integer rentPurposeTypeCode) {
    this.rentPurposeTypeCode = rentPurposeTypeCode;
  }


  public DfeRentReceipt contractTypeCode(Integer contractTypeCode) {
    this.contractTypeCode = contractTypeCode;
    return this;
  }

   /**
   * Get contractTypeCode
   * @return contractTypeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getContractTypeCode() {
    return contractTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractTypeCode(Integer contractTypeCode) {
    this.contractTypeCode = contractTypeCode;
  }


  public DfeRentReceipt rentTypeCode(Integer rentTypeCode) {
    this.rentTypeCode = rentTypeCode;
    return this;
  }

   /**
   * Get rentTypeCode
   * @return rentTypeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRentTypeCode() {
    return rentTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_RENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRentTypeCode(Integer rentTypeCode) {
    this.rentTypeCode = rentTypeCode;
  }


  public DfeRentReceipt referencePeriod(String referencePeriod) {
    this.referencePeriod = referencePeriod;
    return this;
  }

   /**
   * Get referencePeriod
   * @return referencePeriod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferencePeriod() {
    return referencePeriod;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferencePeriod(String referencePeriod) {
    this.referencePeriod = referencePeriod;
  }


  public DfeRentReceipt address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }


  /**
   * Return true if this DfeRentReceipt object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfeRentReceipt dfeRentReceipt = (DfeRentReceipt) o;
    return Objects.equals(this.assetId, dfeRentReceipt.assetId) &&
        Objects.equals(this.rentPurposeTypeCode, dfeRentReceipt.rentPurposeTypeCode) &&
        Objects.equals(this.contractTypeCode, dfeRentReceipt.contractTypeCode) &&
        Objects.equals(this.rentTypeCode, dfeRentReceipt.rentTypeCode) &&
        Objects.equals(this.referencePeriod, dfeRentReceipt.referencePeriod) &&
        Objects.equals(this.address, dfeRentReceipt.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, rentPurposeTypeCode, contractTypeCode, rentTypeCode, referencePeriod, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfeRentReceipt {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    rentPurposeTypeCode: ").append(toIndentedString(rentPurposeTypeCode)).append("\n");
    sb.append("    contractTypeCode: ").append(toIndentedString(contractTypeCode)).append("\n");
    sb.append("    rentTypeCode: ").append(toIndentedString(rentTypeCode)).append("\n");
    sb.append("    referencePeriod: ").append(toIndentedString(referencePeriod)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

