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
 * DfePayeeFinancialAccount
 */
@JsonPropertyOrder({
  DfePayeeFinancialAccount.JSON_PROPERTY_ACCOUNT_NUMBER,
  DfePayeeFinancialAccount.JSON_PROPERTY_N_I_B,
  DfePayeeFinancialAccount.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T16:43:35.596432800-01:00[Atlantic/Cape_Verde]")
public class DfePayeeFinancialAccount {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "AccountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_N_I_B = "NIB";
  private String NIB;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public DfePayeeFinancialAccount() { 
  }

  public DfePayeeFinancialAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public DfePayeeFinancialAccount NIB(String NIB) {
    this.NIB = NIB;
    return this;
  }

   /**
   * Get NIB
   * @return NIB
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_N_I_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNIB() {
    return NIB;
  }


  @JsonProperty(JSON_PROPERTY_N_I_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNIB(String NIB) {
    this.NIB = NIB;
  }


  public DfePayeeFinancialAccount name(String name) {
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


  /**
   * Return true if this DfePayeeFinancialAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfePayeeFinancialAccount dfePayeeFinancialAccount = (DfePayeeFinancialAccount) o;
    return Objects.equals(this.accountNumber, dfePayeeFinancialAccount.accountNumber) &&
        Objects.equals(this.NIB, dfePayeeFinancialAccount.NIB) &&
        Objects.equals(this.name, dfePayeeFinancialAccount.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, NIB, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfePayeeFinancialAccount {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    NIB: ").append(toIndentedString(NIB)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

