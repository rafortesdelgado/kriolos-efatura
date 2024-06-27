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
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.kriolos.efatura.clientapi.generated.model.ItemsPaginationObject;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * ItemsPaginationItemsPaginationObject
 */
@JsonPropertyOrder({
  ItemsPaginationItemsPaginationObject.JSON_PROPERTY_ALL_PAGES_ITEM_COUNT,
  ItemsPaginationItemsPaginationObject.JSON_PROPERTY_ITEMS,
  ItemsPaginationItemsPaginationObject.JSON_PROPERTY_PAGE_COUNT
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T10:20:11.702467700-01:00[Atlantic/Cape_Verde]")
public class ItemsPaginationItemsPaginationObject {
  public static final String JSON_PROPERTY_ALL_PAGES_ITEM_COUNT = "allPagesItemCount";
  private Long allPagesItemCount;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<ItemsPaginationObject> items = null;

  public static final String JSON_PROPERTY_PAGE_COUNT = "pageCount";
  private Integer pageCount;

  public ItemsPaginationItemsPaginationObject() { 
  }

  public ItemsPaginationItemsPaginationObject allPagesItemCount(Long allPagesItemCount) {
    this.allPagesItemCount = allPagesItemCount;
    return this;
  }

   /**
   * Get allPagesItemCount
   * @return allPagesItemCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALL_PAGES_ITEM_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAllPagesItemCount() {
    return allPagesItemCount;
  }


  @JsonProperty(JSON_PROPERTY_ALL_PAGES_ITEM_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllPagesItemCount(Long allPagesItemCount) {
    this.allPagesItemCount = allPagesItemCount;
  }


  public ItemsPaginationItemsPaginationObject items(List<ItemsPaginationObject> items) {
    this.items = items;
    return this;
  }

  public ItemsPaginationItemsPaginationObject addItemsItem(ItemsPaginationObject itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ItemsPaginationObject> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<ItemsPaginationObject> items) {
    this.items = items;
  }


  public ItemsPaginationItemsPaginationObject pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageCount() {
    return pageCount;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  /**
   * Return true if this ItemsPaginationItemsPaginationObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemsPaginationItemsPaginationObject itemsPaginationItemsPaginationObject = (ItemsPaginationItemsPaginationObject) o;
    return Objects.equals(this.allPagesItemCount, itemsPaginationItemsPaginationObject.allPagesItemCount) &&
        Objects.equals(this.items, itemsPaginationItemsPaginationObject.items) &&
        Objects.equals(this.pageCount, itemsPaginationItemsPaginationObject.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allPagesItemCount, items, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsPaginationItemsPaginationObject {\n");
    sb.append("    allPagesItemCount: ").append(toIndentedString(allPagesItemCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

