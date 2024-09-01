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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * DfeLineTax
 */
@JsonPropertyOrder({
  DfeLineTax.JSON_PROPERTY_TAX_TYPE_CODE,
  DfeLineTax.JSON_PROPERTY_STAMP_TAX_CODE,
  DfeLineTax.JSON_PROPERTY_TAX_PERCENTAGE,
  DfeLineTax.JSON_PROPERTY_TAX_AMOUNT,
  DfeLineTax.JSON_PROPERTY_TAX_EXEMPTION_REASON_CODE,
  DfeLineTax.JSON_PROPERTY_TAX_TOTAL
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-23T13:33:35.367561143-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
public class DfeLineTax {
  public static final String JSON_PROPERTY_TAX_TYPE_CODE = "TaxTypeCode";
  private String taxTypeCode;

  public static final String JSON_PROPERTY_STAMP_TAX_CODE = "StampTaxCode";
  private Integer stampTaxCode;

  public static final String JSON_PROPERTY_TAX_PERCENTAGE = "TaxPercentage";
  private Double taxPercentage;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "TaxAmount";
  private Double taxAmount;

  public static final String JSON_PROPERTY_TAX_EXEMPTION_REASON_CODE = "TaxExemptionReasonCode";
  private Integer taxExemptionReasonCode;

  public static final String JSON_PROPERTY_TAX_TOTAL = "TaxTotal";
  private Double taxTotal;

  public DfeLineTax() { 
  }

  public DfeLineTax taxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
    return this;
  }

  /**
   * Get taxTypeCode
   * @return taxTypeCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxTypeCode() {
    return taxTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_TAX_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
  }


  public DfeLineTax stampTaxCode(Integer stampTaxCode) {
    this.stampTaxCode = stampTaxCode;
    return this;
  }

  /**
   * Get stampTaxCode
   * @return stampTaxCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STAMP_TAX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStampTaxCode() {
    return stampTaxCode;
  }


  @JsonProperty(JSON_PROPERTY_STAMP_TAX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStampTaxCode(Integer stampTaxCode) {
    this.stampTaxCode = stampTaxCode;
  }


  public DfeLineTax taxPercentage(Double taxPercentage) {
    this.taxPercentage = taxPercentage;
    return this;
  }

  /**
   * Get taxPercentage
   * @return taxPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTaxPercentage() {
    return taxPercentage;
  }


  @JsonProperty(JSON_PROPERTY_TAX_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxPercentage(Double taxPercentage) {
    this.taxPercentage = taxPercentage;
  }


  public DfeLineTax taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Get taxAmount
   * @return taxAmount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTaxAmount() {
    return taxAmount;
  }


  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }


  public DfeLineTax taxExemptionReasonCode(Integer taxExemptionReasonCode) {
    this.taxExemptionReasonCode = taxExemptionReasonCode;
    return this;
  }

  /**
   * Get taxExemptionReasonCode
   * @return taxExemptionReasonCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_EXEMPTION_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTaxExemptionReasonCode() {
    return taxExemptionReasonCode;
  }


  @JsonProperty(JSON_PROPERTY_TAX_EXEMPTION_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxExemptionReasonCode(Integer taxExemptionReasonCode) {
    this.taxExemptionReasonCode = taxExemptionReasonCode;
  }


  public DfeLineTax taxTotal(Double taxTotal) {
    this.taxTotal = taxTotal;
    return this;
  }

  /**
   * Get taxTotal
   * @return taxTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTaxTotal() {
    return taxTotal;
  }


  @JsonProperty(JSON_PROPERTY_TAX_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxTotal(Double taxTotal) {
    this.taxTotal = taxTotal;
  }


  /**
   * Return true if this DfeLineTax object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfeLineTax dfeLineTax = (DfeLineTax) o;
    return Objects.equals(this.taxTypeCode, dfeLineTax.taxTypeCode) &&
        Objects.equals(this.stampTaxCode, dfeLineTax.stampTaxCode) &&
        Objects.equals(this.taxPercentage, dfeLineTax.taxPercentage) &&
        Objects.equals(this.taxAmount, dfeLineTax.taxAmount) &&
        Objects.equals(this.taxExemptionReasonCode, dfeLineTax.taxExemptionReasonCode) &&
        Objects.equals(this.taxTotal, dfeLineTax.taxTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxTypeCode, stampTaxCode, taxPercentage, taxAmount, taxExemptionReasonCode, taxTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfeLineTax {\n");
    sb.append("    taxTypeCode: ").append(toIndentedString(taxTypeCode)).append("\n");
    sb.append("    stampTaxCode: ").append(toIndentedString(stampTaxCode)).append("\n");
    sb.append("    taxPercentage: ").append(toIndentedString(taxPercentage)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxExemptionReasonCode: ").append(toIndentedString(taxExemptionReasonCode)).append("\n");
    sb.append("    taxTotal: ").append(toIndentedString(taxTotal)).append("\n");
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
