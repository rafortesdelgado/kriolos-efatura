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
 * Contacts
 */
@JsonPropertyOrder({
  Contacts.JSON_PROPERTY_EMAIL,
  Contacts.JSON_PROPERTY_MOBILEPHONE,
  Contacts.JSON_PROPERTY_TELEFAX,
  Contacts.JSON_PROPERTY_TELEPHONE,
  Contacts.JSON_PROPERTY_WEBSITE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T23:31:50.801935300Z[Europe/Lisbon]")
public class Contacts {
  public static final String JSON_PROPERTY_EMAIL = "Email";
  private String email;

  public static final String JSON_PROPERTY_MOBILEPHONE = "Mobilephone";
  private String mobilephone;

  public static final String JSON_PROPERTY_TELEFAX = "Telefax";
  private String telefax;

  public static final String JSON_PROPERTY_TELEPHONE = "Telephone";
  private String telephone;

  public static final String JSON_PROPERTY_WEBSITE = "Website";
  private String website;

  public Contacts() { 
  }

  public Contacts email(String email) {
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


  public Contacts mobilephone(String mobilephone) {
    this.mobilephone = mobilephone;
    return this;
  }

   /**
   * Get mobilephone
   * @return mobilephone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILEPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobilephone() {
    return mobilephone;
  }


  @JsonProperty(JSON_PROPERTY_MOBILEPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilephone(String mobilephone) {
    this.mobilephone = mobilephone;
  }


  public Contacts telefax(String telefax) {
    this.telefax = telefax;
    return this;
  }

   /**
   * Get telefax
   * @return telefax
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TELEFAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTelefax() {
    return telefax;
  }


  @JsonProperty(JSON_PROPERTY_TELEFAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelefax(String telefax) {
    this.telefax = telefax;
  }


  public Contacts telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TELEPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTelephone() {
    return telephone;
  }


  @JsonProperty(JSON_PROPERTY_TELEPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public Contacts website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsite() {
    return website;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsite(String website) {
    this.website = website;
  }


  /**
   * Return true if this Contacts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contacts contacts = (Contacts) o;
    return Objects.equals(this.email, contacts.email) &&
        Objects.equals(this.mobilephone, contacts.mobilephone) &&
        Objects.equals(this.telefax, contacts.telefax) &&
        Objects.equals(this.telephone, contacts.telephone) &&
        Objects.equals(this.website, contacts.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, mobilephone, telefax, telephone, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contacts {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobilephone: ").append(toIndentedString(mobilephone)).append("\n");
    sb.append("    telefax: ").append(toIndentedString(telefax)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

