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
 * DfeDiscount
 */
@JsonPropertyOrder({
  DfeDiscount.JSON_PROPERTY_VALUE_TYPE,
  DfeDiscount.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T22:35:54.857427200-01:00[Atlantic/Cape_Verde]")
public class DfeDiscount {
  public static final String JSON_PROPERTY_VALUE_TYPE = "ValueType";
  private String valueType;

  public static final String JSON_PROPERTY_VALUE = "Value";
  private Double value;

  public DfeDiscount() { 
  }

  public DfeDiscount valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueType() {
    return valueType;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  public DfeDiscount value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
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
   * Return true if this DfeDiscount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfeDiscount dfeDiscount = (DfeDiscount) o;
    return Objects.equals(this.valueType, dfeDiscount.valueType) &&
        Objects.equals(this.value, dfeDiscount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfeDiscount {\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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

