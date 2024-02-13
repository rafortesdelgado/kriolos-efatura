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
import io.github.kriolos.efatura.clientapi.generated.model.DfeDiscount;
import io.github.kriolos.efatura.clientapi.generated.model.DfePayableAlternativeAmount;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * DfeTotals
 */
@JsonPropertyOrder({
  DfeTotals.JSON_PROPERTY_PRICE_EXTENSION_TOTAL_AMOUNT,
  DfeTotals.JSON_PROPERTY_DISCOUNT_TOTAL_AMOUNT,
  DfeTotals.JSON_PROPERTY_CHARGE_TOTAL_AMOUNT,
  DfeTotals.JSON_PROPERTY_NET_TOTAL_AMOUNT,
  DfeTotals.JSON_PROPERTY_DISCOUNT,
  DfeTotals.JSON_PROPERTY_TAX_TOTAL_AMOUNT,
  DfeTotals.JSON_PROPERTY_WITHHOLDING_TAX_TOTAL_AMOUNT,
  DfeTotals.JSON_PROPERTY_PAYABLE_ROUNDING_AMOUNT,
  DfeTotals.JSON_PROPERTY_PAYABLE_AMOUNT,
  DfeTotals.JSON_PROPERTY_PAYABLE_ALTERNATIVE_AMOUNTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T18:43:44.521602200-01:00[Atlantic/Cape_Verde]")
public class DfeTotals {
  public static final String JSON_PROPERTY_PRICE_EXTENSION_TOTAL_AMOUNT = "PriceExtensionTotalAmount";
  private Double priceExtensionTotalAmount;

  public static final String JSON_PROPERTY_DISCOUNT_TOTAL_AMOUNT = "DiscountTotalAmount";
  private Double discountTotalAmount;

  public static final String JSON_PROPERTY_CHARGE_TOTAL_AMOUNT = "ChargeTotalAmount";
  private Double chargeTotalAmount;

  public static final String JSON_PROPERTY_NET_TOTAL_AMOUNT = "NetTotalAmount";
  private Double netTotalAmount;

  public static final String JSON_PROPERTY_DISCOUNT = "Discount";
  private DfeDiscount discount;

  public static final String JSON_PROPERTY_TAX_TOTAL_AMOUNT = "TaxTotalAmount";
  private Double taxTotalAmount;

  public static final String JSON_PROPERTY_WITHHOLDING_TAX_TOTAL_AMOUNT = "WithholdingTaxTotalAmount";
  private Double withholdingTaxTotalAmount;

  public static final String JSON_PROPERTY_PAYABLE_ROUNDING_AMOUNT = "PayableRoundingAmount";
  private Double payableRoundingAmount;

  public static final String JSON_PROPERTY_PAYABLE_AMOUNT = "PayableAmount";
  private Double payableAmount;

  public static final String JSON_PROPERTY_PAYABLE_ALTERNATIVE_AMOUNTS = "PayableAlternativeAmounts";
  private List<DfePayableAlternativeAmount> payableAlternativeAmounts = null;

  public DfeTotals() { 
  }

  public DfeTotals priceExtensionTotalAmount(Double priceExtensionTotalAmount) {
    this.priceExtensionTotalAmount = priceExtensionTotalAmount;
    return this;
  }

   /**
   * Get priceExtensionTotalAmount
   * @return priceExtensionTotalAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE_EXTENSION_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPriceExtensionTotalAmount() {
    return priceExtensionTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_EXTENSION_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceExtensionTotalAmount(Double priceExtensionTotalAmount) {
    this.priceExtensionTotalAmount = priceExtensionTotalAmount;
  }


  public DfeTotals discountTotalAmount(Double discountTotalAmount) {
    this.discountTotalAmount = discountTotalAmount;
    return this;
  }

   /**
   * Get discountTotalAmount
   * @return discountTotalAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCOUNT_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDiscountTotalAmount() {
    return discountTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscountTotalAmount(Double discountTotalAmount) {
    this.discountTotalAmount = discountTotalAmount;
  }


  public DfeTotals chargeTotalAmount(Double chargeTotalAmount) {
    this.chargeTotalAmount = chargeTotalAmount;
    return this;
  }

   /**
   * Get chargeTotalAmount
   * @return chargeTotalAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGE_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getChargeTotalAmount() {
    return chargeTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_CHARGE_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargeTotalAmount(Double chargeTotalAmount) {
    this.chargeTotalAmount = chargeTotalAmount;
  }


  public DfeTotals netTotalAmount(Double netTotalAmount) {
    this.netTotalAmount = netTotalAmount;
    return this;
  }

   /**
   * Get netTotalAmount
   * @return netTotalAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NET_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getNetTotalAmount() {
    return netTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_NET_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetTotalAmount(Double netTotalAmount) {
    this.netTotalAmount = netTotalAmount;
  }


  public DfeTotals discount(DfeDiscount discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DfeDiscount getDiscount() {
    return discount;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscount(DfeDiscount discount) {
    this.discount = discount;
  }


  public DfeTotals taxTotalAmount(Double taxTotalAmount) {
    this.taxTotalAmount = taxTotalAmount;
    return this;
  }

   /**
   * Get taxTotalAmount
   * @return taxTotalAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTaxTotalAmount() {
    return taxTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_TAX_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxTotalAmount(Double taxTotalAmount) {
    this.taxTotalAmount = taxTotalAmount;
  }


  public DfeTotals withholdingTaxTotalAmount(Double withholdingTaxTotalAmount) {
    this.withholdingTaxTotalAmount = withholdingTaxTotalAmount;
    return this;
  }

   /**
   * Get withholdingTaxTotalAmount
   * @return withholdingTaxTotalAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WITHHOLDING_TAX_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWithholdingTaxTotalAmount() {
    return withholdingTaxTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_WITHHOLDING_TAX_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWithholdingTaxTotalAmount(Double withholdingTaxTotalAmount) {
    this.withholdingTaxTotalAmount = withholdingTaxTotalAmount;
  }


  public DfeTotals payableRoundingAmount(Double payableRoundingAmount) {
    this.payableRoundingAmount = payableRoundingAmount;
    return this;
  }

   /**
   * Get payableRoundingAmount
   * @return payableRoundingAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYABLE_ROUNDING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPayableRoundingAmount() {
    return payableRoundingAmount;
  }


  @JsonProperty(JSON_PROPERTY_PAYABLE_ROUNDING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayableRoundingAmount(Double payableRoundingAmount) {
    this.payableRoundingAmount = payableRoundingAmount;
  }


  public DfeTotals payableAmount(Double payableAmount) {
    this.payableAmount = payableAmount;
    return this;
  }

   /**
   * Get payableAmount
   * @return payableAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYABLE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPayableAmount() {
    return payableAmount;
  }


  @JsonProperty(JSON_PROPERTY_PAYABLE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayableAmount(Double payableAmount) {
    this.payableAmount = payableAmount;
  }


  public DfeTotals payableAlternativeAmounts(List<DfePayableAlternativeAmount> payableAlternativeAmounts) {
    this.payableAlternativeAmounts = payableAlternativeAmounts;
    return this;
  }

  public DfeTotals addPayableAlternativeAmountsItem(DfePayableAlternativeAmount payableAlternativeAmountsItem) {
    if (this.payableAlternativeAmounts == null) {
      this.payableAlternativeAmounts = new ArrayList<>();
    }
    this.payableAlternativeAmounts.add(payableAlternativeAmountsItem);
    return this;
  }

   /**
   * Get payableAlternativeAmounts
   * @return payableAlternativeAmounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYABLE_ALTERNATIVE_AMOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DfePayableAlternativeAmount> getPayableAlternativeAmounts() {
    return payableAlternativeAmounts;
  }


  @JsonProperty(JSON_PROPERTY_PAYABLE_ALTERNATIVE_AMOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayableAlternativeAmounts(List<DfePayableAlternativeAmount> payableAlternativeAmounts) {
    this.payableAlternativeAmounts = payableAlternativeAmounts;
  }


  /**
   * Return true if this DfeTotals object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfeTotals dfeTotals = (DfeTotals) o;
    return Objects.equals(this.priceExtensionTotalAmount, dfeTotals.priceExtensionTotalAmount) &&
        Objects.equals(this.discountTotalAmount, dfeTotals.discountTotalAmount) &&
        Objects.equals(this.chargeTotalAmount, dfeTotals.chargeTotalAmount) &&
        Objects.equals(this.netTotalAmount, dfeTotals.netTotalAmount) &&
        Objects.equals(this.discount, dfeTotals.discount) &&
        Objects.equals(this.taxTotalAmount, dfeTotals.taxTotalAmount) &&
        Objects.equals(this.withholdingTaxTotalAmount, dfeTotals.withholdingTaxTotalAmount) &&
        Objects.equals(this.payableRoundingAmount, dfeTotals.payableRoundingAmount) &&
        Objects.equals(this.payableAmount, dfeTotals.payableAmount) &&
        Objects.equals(this.payableAlternativeAmounts, dfeTotals.payableAlternativeAmounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceExtensionTotalAmount, discountTotalAmount, chargeTotalAmount, netTotalAmount, discount, taxTotalAmount, withholdingTaxTotalAmount, payableRoundingAmount, payableAmount, payableAlternativeAmounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfeTotals {\n");
    sb.append("    priceExtensionTotalAmount: ").append(toIndentedString(priceExtensionTotalAmount)).append("\n");
    sb.append("    discountTotalAmount: ").append(toIndentedString(discountTotalAmount)).append("\n");
    sb.append("    chargeTotalAmount: ").append(toIndentedString(chargeTotalAmount)).append("\n");
    sb.append("    netTotalAmount: ").append(toIndentedString(netTotalAmount)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    taxTotalAmount: ").append(toIndentedString(taxTotalAmount)).append("\n");
    sb.append("    withholdingTaxTotalAmount: ").append(toIndentedString(withholdingTaxTotalAmount)).append("\n");
    sb.append("    payableRoundingAmount: ").append(toIndentedString(payableRoundingAmount)).append("\n");
    sb.append("    payableAmount: ").append(toIndentedString(payableAmount)).append("\n");
    sb.append("    payableAlternativeAmounts: ").append(toIndentedString(payableAlternativeAmounts)).append("\n");
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

