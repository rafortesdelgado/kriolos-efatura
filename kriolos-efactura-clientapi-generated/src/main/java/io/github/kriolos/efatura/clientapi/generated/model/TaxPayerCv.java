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
 * TaxPayerCv
 */
@JsonPropertyOrder({
  TaxPayerCv.JSON_PROPERTY_NAME,
  TaxPayerCv.JSON_PROPERTY_NORMALIZED_NAME,
  TaxPayerCv.JSON_PROPERTY_TYPE_CODE,
  TaxPayerCv.JSON_PROPERTY_TYPE_DESCRIPTION,
  TaxPayerCv.JSON_PROPERTY_EMAIL,
  TaxPayerCv.JSON_PROPERTY_MOBILE,
  TaxPayerCv.JSON_PROPERTY_B_I,
  TaxPayerCv.JSON_PROPERTY_IS_TAXABLE,
  TaxPayerCv.JSON_PROPERTY_NIC_LAST5_CHARS,
  TaxPayerCv.JSON_PROPERTY_TAX_AREA_CODE,
  TaxPayerCv.JSON_PROPERTY_TAX_ID,
  TaxPayerCv.JSON_PROPERTY_TAX_REGIME_CODE,
  TaxPayerCv.JSON_PROPERTY_TAX_REGIME_DESCRIPTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T23:31:50.801935300Z[Europe/Lisbon]")
public class TaxPayerCv {
  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_NORMALIZED_NAME = "NormalizedName";
  private String normalizedName;

  public static final String JSON_PROPERTY_TYPE_CODE = "TypeCode";
  private String typeCode;

  public static final String JSON_PROPERTY_TYPE_DESCRIPTION = "TypeDescription";
  private String typeDescription;

  public static final String JSON_PROPERTY_EMAIL = "Email";
  private String email;

  public static final String JSON_PROPERTY_MOBILE = "Mobile";
  private String mobile;

  public static final String JSON_PROPERTY_B_I = "BI";
  private Integer BI;

  public static final String JSON_PROPERTY_IS_TAXABLE = "IsTaxable";
  private Boolean isTaxable;

  public static final String JSON_PROPERTY_NIC_LAST5_CHARS = "NicLast5Chars";
  private String nicLast5Chars;

  public static final String JSON_PROPERTY_TAX_AREA_CODE = "TaxAreaCode";
  private Integer taxAreaCode;

  public static final String JSON_PROPERTY_TAX_ID = "TaxId";
  private Integer taxId;

  public static final String JSON_PROPERTY_TAX_REGIME_CODE = "TaxRegimeCode";
  private String taxRegimeCode;

  public static final String JSON_PROPERTY_TAX_REGIME_DESCRIPTION = "TaxRegimeDescription";
  private String taxRegimeDescription;

  public TaxPayerCv() { 
  }

  public TaxPayerCv name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
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


  public TaxPayerCv normalizedName(String normalizedName) {
    this.normalizedName = normalizedName;
    return this;
  }

   /**
   * Get normalizedName
   * @return normalizedName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NORMALIZED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNormalizedName() {
    return normalizedName;
  }


  @JsonProperty(JSON_PROPERTY_NORMALIZED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizedName(String normalizedName) {
    this.normalizedName = normalizedName;
  }


  public TaxPayerCv typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

   /**
   * Get typeCode
   * @return typeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeCode() {
    return typeCode;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }


  public TaxPayerCv typeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
    return this;
  }

   /**
   * Get typeDescription
   * @return typeDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeDescription() {
    return typeDescription;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
  }


  public TaxPayerCv email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public TaxPayerCv mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobile() {
    return mobile;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public TaxPayerCv BI(Integer BI) {
    this.BI = BI;
    return this;
  }

   /**
   * Get BI
   * @return BI
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_B_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBI() {
    return BI;
  }


  @JsonProperty(JSON_PROPERTY_B_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBI(Integer BI) {
    this.BI = BI;
  }


  public TaxPayerCv isTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
    return this;
  }

   /**
   * Get isTaxable
   * @return isTaxable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_TAXABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsTaxable() {
    return isTaxable;
  }


  @JsonProperty(JSON_PROPERTY_IS_TAXABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
  }


  public TaxPayerCv nicLast5Chars(String nicLast5Chars) {
    this.nicLast5Chars = nicLast5Chars;
    return this;
  }

   /**
   * Get nicLast5Chars
   * @return nicLast5Chars
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NIC_LAST5_CHARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNicLast5Chars() {
    return nicLast5Chars;
  }


  @JsonProperty(JSON_PROPERTY_NIC_LAST5_CHARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNicLast5Chars(String nicLast5Chars) {
    this.nicLast5Chars = nicLast5Chars;
  }


  public TaxPayerCv taxAreaCode(Integer taxAreaCode) {
    this.taxAreaCode = taxAreaCode;
    return this;
  }

   /**
   * Get taxAreaCode
   * @return taxAreaCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_AREA_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTaxAreaCode() {
    return taxAreaCode;
  }


  @JsonProperty(JSON_PROPERTY_TAX_AREA_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxAreaCode(Integer taxAreaCode) {
    this.taxAreaCode = taxAreaCode;
  }


  public TaxPayerCv taxId(Integer taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
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


  public TaxPayerCv taxRegimeCode(String taxRegimeCode) {
    this.taxRegimeCode = taxRegimeCode;
    return this;
  }

   /**
   * Get taxRegimeCode
   * @return taxRegimeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_REGIME_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxRegimeCode() {
    return taxRegimeCode;
  }


  @JsonProperty(JSON_PROPERTY_TAX_REGIME_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxRegimeCode(String taxRegimeCode) {
    this.taxRegimeCode = taxRegimeCode;
  }


  public TaxPayerCv taxRegimeDescription(String taxRegimeDescription) {
    this.taxRegimeDescription = taxRegimeDescription;
    return this;
  }

   /**
   * Get taxRegimeDescription
   * @return taxRegimeDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_REGIME_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxRegimeDescription() {
    return taxRegimeDescription;
  }


  @JsonProperty(JSON_PROPERTY_TAX_REGIME_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxRegimeDescription(String taxRegimeDescription) {
    this.taxRegimeDescription = taxRegimeDescription;
  }


  /**
   * Return true if this TaxPayerCv object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxPayerCv taxPayerCv = (TaxPayerCv) o;
    return Objects.equals(this.name, taxPayerCv.name) &&
        Objects.equals(this.normalizedName, taxPayerCv.normalizedName) &&
        Objects.equals(this.typeCode, taxPayerCv.typeCode) &&
        Objects.equals(this.typeDescription, taxPayerCv.typeDescription) &&
        Objects.equals(this.email, taxPayerCv.email) &&
        Objects.equals(this.mobile, taxPayerCv.mobile) &&
        Objects.equals(this.BI, taxPayerCv.BI) &&
        Objects.equals(this.isTaxable, taxPayerCv.isTaxable) &&
        Objects.equals(this.nicLast5Chars, taxPayerCv.nicLast5Chars) &&
        Objects.equals(this.taxAreaCode, taxPayerCv.taxAreaCode) &&
        Objects.equals(this.taxId, taxPayerCv.taxId) &&
        Objects.equals(this.taxRegimeCode, taxPayerCv.taxRegimeCode) &&
        Objects.equals(this.taxRegimeDescription, taxPayerCv.taxRegimeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, normalizedName, typeCode, typeDescription, email, mobile, BI, isTaxable, nicLast5Chars, taxAreaCode, taxId, taxRegimeCode, taxRegimeDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxPayerCv {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    normalizedName: ").append(toIndentedString(normalizedName)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    typeDescription: ").append(toIndentedString(typeDescription)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    BI: ").append(toIndentedString(BI)).append("\n");
    sb.append("    isTaxable: ").append(toIndentedString(isTaxable)).append("\n");
    sb.append("    nicLast5Chars: ").append(toIndentedString(nicLast5Chars)).append("\n");
    sb.append("    taxAreaCode: ").append(toIndentedString(taxAreaCode)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    taxRegimeCode: ").append(toIndentedString(taxRegimeCode)).append("\n");
    sb.append("    taxRegimeDescription: ").append(toIndentedString(taxRegimeDescription)).append("\n");
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

