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
 * DfePayableAlternativeAmount
 */
@JsonPropertyOrder({
  DfePayableAlternativeAmount.JSON_PROPERTY_CURRENCY_CODE,
  DfePayableAlternativeAmount.JSON_PROPERTY_EXCHANGE_RATE,
  DfePayableAlternativeAmount.JSON_PROPERTY_VALUE
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-01T21:45:11.948946335-01:00[Atlantic/Cape_Verde]", comments = "Generator version: 7.7.0")
public class DfePayableAlternativeAmount {
  public static final String JSON_PROPERTY_CURRENCY_CODE = "CurrencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_EXCHANGE_RATE = "ExchangeRate";
  private Double exchangeRate;

  public static final String JSON_PROPERTY_VALUE = "Value";
  private Double value;

  public DfePayableAlternativeAmount() { 
  }

  public DfePayableAlternativeAmount currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public DfePayableAlternativeAmount exchangeRate(Double exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Get exchangeRate
   * @return exchangeRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getExchangeRate() {
    return exchangeRate;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExchangeRate(Double exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  public DfePayableAlternativeAmount value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Double value) {
    this.value = value;
  }


  /**
   * Return true if this DfePayableAlternativeAmount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfePayableAlternativeAmount dfePayableAlternativeAmount = (DfePayableAlternativeAmount) o;
    return Objects.equals(this.currencyCode, dfePayableAlternativeAmount.currencyCode) &&
        Objects.equals(this.exchangeRate, dfePayableAlternativeAmount.exchangeRate) &&
        Objects.equals(this.value, dfePayableAlternativeAmount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, exchangeRate, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfePayableAlternativeAmount {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

