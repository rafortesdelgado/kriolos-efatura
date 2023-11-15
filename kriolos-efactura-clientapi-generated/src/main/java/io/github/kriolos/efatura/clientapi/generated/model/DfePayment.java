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
import io.github.kriolos.efatura.clientapi.generated.model.DfePayeeFinancialAccount;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * DfePayment
 */
@JsonPropertyOrder({
  DfePayment.JSON_PROPERTY_PAYMENT_MEANS_CODE,
  DfePayment.JSON_PROPERTY_PAYMENT_REFERENCE,
  DfePayment.JSON_PROPERTY_PAYMENT_DATE,
  DfePayment.JSON_PROPERTY_PAYMENT_AMOUNT,
  DfePayment.JSON_PROPERTY_PAYEE_FINANCIAL_ACCOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T16:59:08.260554600-01:00[Atlantic/Cape_Verde]")
public class DfePayment {
  public static final String JSON_PROPERTY_PAYMENT_MEANS_CODE = "PaymentMeansCode";
  private Integer paymentMeansCode;

  public static final String JSON_PROPERTY_PAYMENT_REFERENCE = "PaymentReference";
  private String paymentReference;

  public static final String JSON_PROPERTY_PAYMENT_DATE = "PaymentDate";
  private String paymentDate;

  public static final String JSON_PROPERTY_PAYMENT_AMOUNT = "PaymentAmount";
  private Double paymentAmount;

  public static final String JSON_PROPERTY_PAYEE_FINANCIAL_ACCOUNT = "PayeeFinancialAccount";
  private DfePayeeFinancialAccount payeeFinancialAccount;

  public DfePayment() { 
  }

  public DfePayment paymentMeansCode(Integer paymentMeansCode) {
    this.paymentMeansCode = paymentMeansCode;
    return this;
  }

   /**
   * Get paymentMeansCode
   * @return paymentMeansCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_MEANS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaymentMeansCode() {
    return paymentMeansCode;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_MEANS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMeansCode(Integer paymentMeansCode) {
    this.paymentMeansCode = paymentMeansCode;
  }


  public DfePayment paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

   /**
   * Get paymentReference
   * @return paymentReference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentReference() {
    return paymentReference;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }


  public DfePayment paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Get paymentDate
   * @return paymentDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentDate() {
    return paymentDate;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }


  public DfePayment paymentAmount(Double paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * Get paymentAmount
   * @return paymentAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPaymentAmount() {
    return paymentAmount;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentAmount(Double paymentAmount) {
    this.paymentAmount = paymentAmount;
  }


  public DfePayment payeeFinancialAccount(DfePayeeFinancialAccount payeeFinancialAccount) {
    this.payeeFinancialAccount = payeeFinancialAccount;
    return this;
  }

   /**
   * Get payeeFinancialAccount
   * @return payeeFinancialAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYEE_FINANCIAL_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DfePayeeFinancialAccount getPayeeFinancialAccount() {
    return payeeFinancialAccount;
  }


  @JsonProperty(JSON_PROPERTY_PAYEE_FINANCIAL_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayeeFinancialAccount(DfePayeeFinancialAccount payeeFinancialAccount) {
    this.payeeFinancialAccount = payeeFinancialAccount;
  }


  /**
   * Return true if this DfePayment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfePayment dfePayment = (DfePayment) o;
    return Objects.equals(this.paymentMeansCode, dfePayment.paymentMeansCode) &&
        Objects.equals(this.paymentReference, dfePayment.paymentReference) &&
        Objects.equals(this.paymentDate, dfePayment.paymentDate) &&
        Objects.equals(this.paymentAmount, dfePayment.paymentAmount) &&
        Objects.equals(this.payeeFinancialAccount, dfePayment.payeeFinancialAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMeansCode, paymentReference, paymentDate, paymentAmount, payeeFinancialAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfePayment {\n");
    sb.append("    paymentMeansCode: ").append(toIndentedString(paymentMeansCode)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    payeeFinancialAccount: ").append(toIndentedString(payeeFinancialAccount)).append("\n");
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

