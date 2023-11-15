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
 * Address
 */
@JsonPropertyOrder({
  Address.JSON_PROPERTY_ADDRESS_CODE,
  Address.JSON_PROPERTY_ADDRESS_DETAIL,
  Address.JSON_PROPERTY_BUILDING_FLOOR,
  Address.JSON_PROPERTY_BUILDING_NAME,
  Address.JSON_PROPERTY_BUILDING_NUMBER,
  Address.JSON_PROPERTY_CITY,
  Address.JSON_PROPERTY_COUNTRY_CODE,
  Address.JSON_PROPERTY_POSTAL_CODE,
  Address.JSON_PROPERTY_REGION,
  Address.JSON_PROPERTY_STATE,
  Address.JSON_PROPERTY_STREET,
  Address.JSON_PROPERTY_STREET_DETAIL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T16:59:08.260554600-01:00[Atlantic/Cape_Verde]")
public class Address {
  public static final String JSON_PROPERTY_ADDRESS_CODE = "AddressCode";
  private String addressCode;

  public static final String JSON_PROPERTY_ADDRESS_DETAIL = "AddressDetail";
  private String addressDetail;

  public static final String JSON_PROPERTY_BUILDING_FLOOR = "BuildingFloor";
  private String buildingFloor;

  public static final String JSON_PROPERTY_BUILDING_NAME = "BuildingName";
  private String buildingName;

  public static final String JSON_PROPERTY_BUILDING_NUMBER = "BuildingNumber";
  private String buildingNumber;

  public static final String JSON_PROPERTY_CITY = "City";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "CountryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_POSTAL_CODE = "PostalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_REGION = "Region";
  private String region;

  public static final String JSON_PROPERTY_STATE = "State";
  private String state;

  public static final String JSON_PROPERTY_STREET = "Street";
  private String street;

  public static final String JSON_PROPERTY_STREET_DETAIL = "StreetDetail";
  private String streetDetail;

  public Address() { 
  }

  public Address addressCode(String addressCode) {
    this.addressCode = addressCode;
    return this;
  }

   /**
   * Get addressCode
   * @return addressCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressCode() {
    return addressCode;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressCode(String addressCode) {
    this.addressCode = addressCode;
  }


  public Address addressDetail(String addressDetail) {
    this.addressDetail = addressDetail;
    return this;
  }

   /**
   * Get addressDetail
   * @return addressDetail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressDetail() {
    return addressDetail;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressDetail(String addressDetail) {
    this.addressDetail = addressDetail;
  }


  public Address buildingFloor(String buildingFloor) {
    this.buildingFloor = buildingFloor;
    return this;
  }

   /**
   * Get buildingFloor
   * @return buildingFloor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingFloor() {
    return buildingFloor;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingFloor(String buildingFloor) {
    this.buildingFloor = buildingFloor;
  }


  public Address buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

   /**
   * Get buildingName
   * @return buildingName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingName() {
    return buildingName;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }


  public Address buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * Get buildingNumber
   * @return buildingNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingNumber() {
    return buildingNumber;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }


  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public Address region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public Address street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }


  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(String street) {
    this.street = street;
  }


  public Address streetDetail(String streetDetail) {
    this.streetDetail = streetDetail;
    return this;
  }

   /**
   * Get streetDetail
   * @return streetDetail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetDetail() {
    return streetDetail;
  }


  @JsonProperty(JSON_PROPERTY_STREET_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetDetail(String streetDetail) {
    this.streetDetail = streetDetail;
  }


  /**
   * Return true if this Address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressCode, address.addressCode) &&
        Objects.equals(this.addressDetail, address.addressDetail) &&
        Objects.equals(this.buildingFloor, address.buildingFloor) &&
        Objects.equals(this.buildingName, address.buildingName) &&
        Objects.equals(this.buildingNumber, address.buildingNumber) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.region, address.region) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.streetDetail, address.streetDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressCode, addressDetail, buildingFloor, buildingName, buildingNumber, city, countryCode, postalCode, region, state, street, streetDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    addressCode: ").append(toIndentedString(addressCode)).append("\n");
    sb.append("    addressDetail: ").append(toIndentedString(addressDetail)).append("\n");
    sb.append("    buildingFloor: ").append(toIndentedString(buildingFloor)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetDetail: ").append(toIndentedString(streetDetail)).append("\n");
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

