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
import io.github.kriolos.efatura.clientapi.generated.model.DfeLine;
import io.github.kriolos.efatura.clientapi.generated.model.DfeOrderReference;
import io.github.kriolos.efatura.clientapi.generated.model.DfePayments;
import io.github.kriolos.efatura.clientapi.generated.model.DfeReference;
import io.github.kriolos.efatura.clientapi.generated.model.DfeRentReceipt;
import io.github.kriolos.efatura.clientapi.generated.model.DfeTotals;
import io.github.kriolos.efatura.clientapi.generated.model.DfeTransportLocation;
import io.github.kriolos.efatura.clientapi.generated.model.EfParty;
import io.github.kriolos.efatura.clientapi.generated.model.EfTransmission;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.kriolos.efatura.clientapi.generated.JSON;


/**
 * Dfe
 */
@JsonPropertyOrder({
  Dfe.JSON_PROPERTY_ID,
  Dfe.JSON_PROPERTY_VERSION,
  Dfe.JSON_PROPERTY_TRANSMISSION,
  Dfe.JSON_PROPERTY_REPOSITORY_CODE,
  Dfe.JSON_PROPERTY_DOCUMENT_TYPE_CODE,
  Dfe.JSON_PROPERTY_IS_SPECIMEN,
  Dfe.JSON_PROPERTY_LED_CODE,
  Dfe.JSON_PROPERTY_LED_DESCRIPTION,
  Dfe.JSON_PROPERTY_SERIE,
  Dfe.JSON_PROPERTY_DOCUMENT_NUMBER,
  Dfe.JSON_PROPERTY_ISSUE_DATE,
  Dfe.JSON_PROPERTY_ISSUE_TIME,
  Dfe.JSON_PROPERTY_DUE_DATE,
  Dfe.JSON_PROPERTY_ORDER_REFERENCE,
  Dfe.JSON_PROPERTY_TAX_POINT_DATE,
  Dfe.JSON_PROPERTY_ISSUE_REASON_CODE,
  Dfe.JSON_PROPERTY_ISSUE_REASON_DESCRIPTION,
  Dfe.JSON_PROPERTY_EMITTER_PARTY,
  Dfe.JSON_PROPERTY_RECEIVER_PARTY,
  Dfe.JSON_PROPERTY_TRANSPORT_SERVICE_PROVIDER_PARTY,
  Dfe.JSON_PROPERTY_TRANSPORT_ROUTE,
  Dfe.JSON_PROPERTY_RECEIPT_TYPE_CODE,
  Dfe.JSON_PROPERTY_RENT_RECEIPT,
  Dfe.JSON_PROPERTY_RECEIVER_TYPE_CODE,
  Dfe.JSON_PROPERTY_TRANSPORT_DOCUMENT_TYPE_CODE,
  Dfe.JSON_PROPERTY_LINES,
  Dfe.JSON_PROPERTY_TOTALS,
  Dfe.JSON_PROPERTY_PAYMENTS,
  Dfe.JSON_PROPERTY_REFERENCES,
  Dfe.JSON_PROPERTY_NOTE,
  Dfe.JSON_PROPERTY_CANCELED_DATE_TIME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-13T10:03:03.079208700-01:00[Atlantic/Cape_Verde]")
public class Dfe {
  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "Version";
  private String version;

  public static final String JSON_PROPERTY_TRANSMISSION = "Transmission";
  private EfTransmission transmission;

  public static final String JSON_PROPERTY_REPOSITORY_CODE = "RepositoryCode";
  private Integer repositoryCode;

  public static final String JSON_PROPERTY_DOCUMENT_TYPE_CODE = "DocumentTypeCode";
  private Integer documentTypeCode;

  public static final String JSON_PROPERTY_IS_SPECIMEN = "IsSpecimen";
  private Boolean isSpecimen;

  public static final String JSON_PROPERTY_LED_CODE = "LedCode";
  private Integer ledCode;

  public static final String JSON_PROPERTY_LED_DESCRIPTION = "LedDescription";
  private String ledDescription;

  public static final String JSON_PROPERTY_SERIE = "Serie";
  private String serie;

  public static final String JSON_PROPERTY_DOCUMENT_NUMBER = "DocumentNumber";
  private Integer documentNumber;

  public static final String JSON_PROPERTY_ISSUE_DATE = "IssueDate";
  private String issueDate;

  public static final String JSON_PROPERTY_ISSUE_TIME = "IssueTime";
  private String issueTime;

  public static final String JSON_PROPERTY_DUE_DATE = "DueDate";
  private String dueDate;

  public static final String JSON_PROPERTY_ORDER_REFERENCE = "OrderReference";
  private DfeOrderReference orderReference;

  public static final String JSON_PROPERTY_TAX_POINT_DATE = "TaxPointDate";
  private String taxPointDate;

  public static final String JSON_PROPERTY_ISSUE_REASON_CODE = "IssueReasonCode";
  private String issueReasonCode;

  public static final String JSON_PROPERTY_ISSUE_REASON_DESCRIPTION = "IssueReasonDescription";
  private String issueReasonDescription;

  public static final String JSON_PROPERTY_EMITTER_PARTY = "EmitterParty";
  private EfParty emitterParty;

  public static final String JSON_PROPERTY_RECEIVER_PARTY = "ReceiverParty";
  private EfParty receiverParty;

  public static final String JSON_PROPERTY_TRANSPORT_SERVICE_PROVIDER_PARTY = "TransportServiceProviderParty";
  private EfParty transportServiceProviderParty;

  public static final String JSON_PROPERTY_TRANSPORT_ROUTE = "TransportRoute";
  private List<DfeTransportLocation> transportRoute = null;

  public static final String JSON_PROPERTY_RECEIPT_TYPE_CODE = "ReceiptTypeCode";
  private Integer receiptTypeCode;

  public static final String JSON_PROPERTY_RENT_RECEIPT = "RentReceipt";
  private DfeRentReceipt rentReceipt;

  public static final String JSON_PROPERTY_RECEIVER_TYPE_CODE = "ReceiverTypeCode";
  private Integer receiverTypeCode;

  public static final String JSON_PROPERTY_TRANSPORT_DOCUMENT_TYPE_CODE = "TransportDocumentTypeCode";
  private Integer transportDocumentTypeCode;

  public static final String JSON_PROPERTY_LINES = "Lines";
  private List<DfeLine> lines = null;

  public static final String JSON_PROPERTY_TOTALS = "Totals";
  private DfeTotals totals;

  public static final String JSON_PROPERTY_PAYMENTS = "Payments";
  private DfePayments payments;

  public static final String JSON_PROPERTY_REFERENCES = "References";
  private List<DfeReference> references = null;

  public static final String JSON_PROPERTY_NOTE = "Note";
  private String note;

  public static final String JSON_PROPERTY_CANCELED_DATE_TIME = "CanceledDateTime";
  private String canceledDateTime;

  public Dfe() { 
  }

  public Dfe id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Dfe version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public Dfe transmission(EfTransmission transmission) {
    this.transmission = transmission;
    return this;
  }

   /**
   * Get transmission
   * @return transmission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EfTransmission getTransmission() {
    return transmission;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmission(EfTransmission transmission) {
    this.transmission = transmission;
  }


  public Dfe repositoryCode(Integer repositoryCode) {
    this.repositoryCode = repositoryCode;
    return this;
  }

   /**
   * Get repositoryCode
   * @return repositoryCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRepositoryCode() {
    return repositoryCode;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepositoryCode(Integer repositoryCode) {
    this.repositoryCode = repositoryCode;
  }


  public Dfe documentTypeCode(Integer documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
    return this;
  }

   /**
   * Get documentTypeCode
   * @return documentTypeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDocumentTypeCode() {
    return documentTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentTypeCode(Integer documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
  }


  public Dfe isSpecimen(Boolean isSpecimen) {
    this.isSpecimen = isSpecimen;
    return this;
  }

   /**
   * Get isSpecimen
   * @return isSpecimen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SPECIMEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSpecimen() {
    return isSpecimen;
  }


  @JsonProperty(JSON_PROPERTY_IS_SPECIMEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSpecimen(Boolean isSpecimen) {
    this.isSpecimen = isSpecimen;
  }


  public Dfe ledCode(Integer ledCode) {
    this.ledCode = ledCode;
    return this;
  }

   /**
   * Get ledCode
   * @return ledCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LED_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLedCode() {
    return ledCode;
  }


  @JsonProperty(JSON_PROPERTY_LED_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLedCode(Integer ledCode) {
    this.ledCode = ledCode;
  }


  public Dfe ledDescription(String ledDescription) {
    this.ledDescription = ledDescription;
    return this;
  }

   /**
   * Get ledDescription
   * @return ledDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLedDescription() {
    return ledDescription;
  }


  @JsonProperty(JSON_PROPERTY_LED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLedDescription(String ledDescription) {
    this.ledDescription = ledDescription;
  }


  public Dfe serie(String serie) {
    this.serie = serie;
    return this;
  }

   /**
   * Get serie
   * @return serie
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerie() {
    return serie;
  }


  @JsonProperty(JSON_PROPERTY_SERIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerie(String serie) {
    this.serie = serie;
  }


  public Dfe documentNumber(Integer documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * Get documentNumber
   * @return documentNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDocumentNumber() {
    return documentNumber;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentNumber(Integer documentNumber) {
    this.documentNumber = documentNumber;
  }


  public Dfe issueDate(String issueDate) {
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueDate() {
    return issueDate;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public Dfe issueTime(String issueTime) {
    this.issueTime = issueTime;
    return this;
  }

   /**
   * Get issueTime
   * @return issueTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueTime() {
    return issueTime;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueTime(String issueTime) {
    this.issueTime = issueTime;
  }


  public Dfe dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDueDate() {
    return dueDate;
  }


  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  public Dfe orderReference(DfeOrderReference orderReference) {
    this.orderReference = orderReference;
    return this;
  }

   /**
   * Get orderReference
   * @return orderReference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DfeOrderReference getOrderReference() {
    return orderReference;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderReference(DfeOrderReference orderReference) {
    this.orderReference = orderReference;
  }


  public Dfe taxPointDate(String taxPointDate) {
    this.taxPointDate = taxPointDate;
    return this;
  }

   /**
   * Get taxPointDate
   * @return taxPointDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_POINT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxPointDate() {
    return taxPointDate;
  }


  @JsonProperty(JSON_PROPERTY_TAX_POINT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxPointDate(String taxPointDate) {
    this.taxPointDate = taxPointDate;
  }


  public Dfe issueReasonCode(String issueReasonCode) {
    this.issueReasonCode = issueReasonCode;
    return this;
  }

   /**
   * Get issueReasonCode
   * @return issueReasonCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueReasonCode() {
    return issueReasonCode;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueReasonCode(String issueReasonCode) {
    this.issueReasonCode = issueReasonCode;
  }


  public Dfe issueReasonDescription(String issueReasonDescription) {
    this.issueReasonDescription = issueReasonDescription;
    return this;
  }

   /**
   * Get issueReasonDescription
   * @return issueReasonDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_REASON_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueReasonDescription() {
    return issueReasonDescription;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_REASON_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueReasonDescription(String issueReasonDescription) {
    this.issueReasonDescription = issueReasonDescription;
  }


  public Dfe emitterParty(EfParty emitterParty) {
    this.emitterParty = emitterParty;
    return this;
  }

   /**
   * Get emitterParty
   * @return emitterParty
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMITTER_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EfParty getEmitterParty() {
    return emitterParty;
  }


  @JsonProperty(JSON_PROPERTY_EMITTER_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmitterParty(EfParty emitterParty) {
    this.emitterParty = emitterParty;
  }


  public Dfe receiverParty(EfParty receiverParty) {
    this.receiverParty = receiverParty;
    return this;
  }

   /**
   * Get receiverParty
   * @return receiverParty
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVER_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EfParty getReceiverParty() {
    return receiverParty;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiverParty(EfParty receiverParty) {
    this.receiverParty = receiverParty;
  }


  public Dfe transportServiceProviderParty(EfParty transportServiceProviderParty) {
    this.transportServiceProviderParty = transportServiceProviderParty;
    return this;
  }

   /**
   * Get transportServiceProviderParty
   * @return transportServiceProviderParty
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSPORT_SERVICE_PROVIDER_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EfParty getTransportServiceProviderParty() {
    return transportServiceProviderParty;
  }


  @JsonProperty(JSON_PROPERTY_TRANSPORT_SERVICE_PROVIDER_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportServiceProviderParty(EfParty transportServiceProviderParty) {
    this.transportServiceProviderParty = transportServiceProviderParty;
  }


  public Dfe transportRoute(List<DfeTransportLocation> transportRoute) {
    this.transportRoute = transportRoute;
    return this;
  }

  public Dfe addTransportRouteItem(DfeTransportLocation transportRouteItem) {
    if (this.transportRoute == null) {
      this.transportRoute = new ArrayList<>();
    }
    this.transportRoute.add(transportRouteItem);
    return this;
  }

   /**
   * Get transportRoute
   * @return transportRoute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSPORT_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DfeTransportLocation> getTransportRoute() {
    return transportRoute;
  }


  @JsonProperty(JSON_PROPERTY_TRANSPORT_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportRoute(List<DfeTransportLocation> transportRoute) {
    this.transportRoute = transportRoute;
  }


  public Dfe receiptTypeCode(Integer receiptTypeCode) {
    this.receiptTypeCode = receiptTypeCode;
    return this;
  }

   /**
   * Get receiptTypeCode
   * @return receiptTypeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReceiptTypeCode() {
    return receiptTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptTypeCode(Integer receiptTypeCode) {
    this.receiptTypeCode = receiptTypeCode;
  }


  public Dfe rentReceipt(DfeRentReceipt rentReceipt) {
    this.rentReceipt = rentReceipt;
    return this;
  }

   /**
   * Get rentReceipt
   * @return rentReceipt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENT_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DfeRentReceipt getRentReceipt() {
    return rentReceipt;
  }


  @JsonProperty(JSON_PROPERTY_RENT_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRentReceipt(DfeRentReceipt rentReceipt) {
    this.rentReceipt = rentReceipt;
  }


  public Dfe receiverTypeCode(Integer receiverTypeCode) {
    this.receiverTypeCode = receiverTypeCode;
    return this;
  }

   /**
   * Get receiverTypeCode
   * @return receiverTypeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVER_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReceiverTypeCode() {
    return receiverTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiverTypeCode(Integer receiverTypeCode) {
    this.receiverTypeCode = receiverTypeCode;
  }


  public Dfe transportDocumentTypeCode(Integer transportDocumentTypeCode) {
    this.transportDocumentTypeCode = transportDocumentTypeCode;
    return this;
  }

   /**
   * Get transportDocumentTypeCode
   * @return transportDocumentTypeCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSPORT_DOCUMENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTransportDocumentTypeCode() {
    return transportDocumentTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_TRANSPORT_DOCUMENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportDocumentTypeCode(Integer transportDocumentTypeCode) {
    this.transportDocumentTypeCode = transportDocumentTypeCode;
  }


  public Dfe lines(List<DfeLine> lines) {
    this.lines = lines;
    return this;
  }

  public Dfe addLinesItem(DfeLine linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DfeLine> getLines() {
    return lines;
  }


  @JsonProperty(JSON_PROPERTY_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLines(List<DfeLine> lines) {
    this.lines = lines;
  }


  public Dfe totals(DfeTotals totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DfeTotals getTotals() {
    return totals;
  }


  @JsonProperty(JSON_PROPERTY_TOTALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotals(DfeTotals totals) {
    this.totals = totals;
  }


  public Dfe payments(DfePayments payments) {
    this.payments = payments;
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DfePayments getPayments() {
    return payments;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayments(DfePayments payments) {
    this.payments = payments;
  }


  public Dfe references(List<DfeReference> references) {
    this.references = references;
    return this;
  }

  public Dfe addReferencesItem(DfeReference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DfeReference> getReferences() {
    return references;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(List<DfeReference> references) {
    this.references = references;
  }


  public Dfe note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNote() {
    return note;
  }


  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNote(String note) {
    this.note = note;
  }


  public Dfe canceledDateTime(String canceledDateTime) {
    this.canceledDateTime = canceledDateTime;
    return this;
  }

   /**
   * Get canceledDateTime
   * @return canceledDateTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANCELED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCanceledDateTime() {
    return canceledDateTime;
  }


  @JsonProperty(JSON_PROPERTY_CANCELED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanceledDateTime(String canceledDateTime) {
    this.canceledDateTime = canceledDateTime;
  }


  /**
   * Return true if this Dfe object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dfe dfe = (Dfe) o;
    return Objects.equals(this.id, dfe.id) &&
        Objects.equals(this.version, dfe.version) &&
        Objects.equals(this.transmission, dfe.transmission) &&
        Objects.equals(this.repositoryCode, dfe.repositoryCode) &&
        Objects.equals(this.documentTypeCode, dfe.documentTypeCode) &&
        Objects.equals(this.isSpecimen, dfe.isSpecimen) &&
        Objects.equals(this.ledCode, dfe.ledCode) &&
        Objects.equals(this.ledDescription, dfe.ledDescription) &&
        Objects.equals(this.serie, dfe.serie) &&
        Objects.equals(this.documentNumber, dfe.documentNumber) &&
        Objects.equals(this.issueDate, dfe.issueDate) &&
        Objects.equals(this.issueTime, dfe.issueTime) &&
        Objects.equals(this.dueDate, dfe.dueDate) &&
        Objects.equals(this.orderReference, dfe.orderReference) &&
        Objects.equals(this.taxPointDate, dfe.taxPointDate) &&
        Objects.equals(this.issueReasonCode, dfe.issueReasonCode) &&
        Objects.equals(this.issueReasonDescription, dfe.issueReasonDescription) &&
        Objects.equals(this.emitterParty, dfe.emitterParty) &&
        Objects.equals(this.receiverParty, dfe.receiverParty) &&
        Objects.equals(this.transportServiceProviderParty, dfe.transportServiceProviderParty) &&
        Objects.equals(this.transportRoute, dfe.transportRoute) &&
        Objects.equals(this.receiptTypeCode, dfe.receiptTypeCode) &&
        Objects.equals(this.rentReceipt, dfe.rentReceipt) &&
        Objects.equals(this.receiverTypeCode, dfe.receiverTypeCode) &&
        Objects.equals(this.transportDocumentTypeCode, dfe.transportDocumentTypeCode) &&
        Objects.equals(this.lines, dfe.lines) &&
        Objects.equals(this.totals, dfe.totals) &&
        Objects.equals(this.payments, dfe.payments) &&
        Objects.equals(this.references, dfe.references) &&
        Objects.equals(this.note, dfe.note) &&
        Objects.equals(this.canceledDateTime, dfe.canceledDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, transmission, repositoryCode, documentTypeCode, isSpecimen, ledCode, ledDescription, serie, documentNumber, issueDate, issueTime, dueDate, orderReference, taxPointDate, issueReasonCode, issueReasonDescription, emitterParty, receiverParty, transportServiceProviderParty, transportRoute, receiptTypeCode, rentReceipt, receiverTypeCode, transportDocumentTypeCode, lines, totals, payments, references, note, canceledDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dfe {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    transmission: ").append(toIndentedString(transmission)).append("\n");
    sb.append("    repositoryCode: ").append(toIndentedString(repositoryCode)).append("\n");
    sb.append("    documentTypeCode: ").append(toIndentedString(documentTypeCode)).append("\n");
    sb.append("    isSpecimen: ").append(toIndentedString(isSpecimen)).append("\n");
    sb.append("    ledCode: ").append(toIndentedString(ledCode)).append("\n");
    sb.append("    ledDescription: ").append(toIndentedString(ledDescription)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    issueTime: ").append(toIndentedString(issueTime)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    orderReference: ").append(toIndentedString(orderReference)).append("\n");
    sb.append("    taxPointDate: ").append(toIndentedString(taxPointDate)).append("\n");
    sb.append("    issueReasonCode: ").append(toIndentedString(issueReasonCode)).append("\n");
    sb.append("    issueReasonDescription: ").append(toIndentedString(issueReasonDescription)).append("\n");
    sb.append("    emitterParty: ").append(toIndentedString(emitterParty)).append("\n");
    sb.append("    receiverParty: ").append(toIndentedString(receiverParty)).append("\n");
    sb.append("    transportServiceProviderParty: ").append(toIndentedString(transportServiceProviderParty)).append("\n");
    sb.append("    transportRoute: ").append(toIndentedString(transportRoute)).append("\n");
    sb.append("    receiptTypeCode: ").append(toIndentedString(receiptTypeCode)).append("\n");
    sb.append("    rentReceipt: ").append(toIndentedString(rentReceipt)).append("\n");
    sb.append("    receiverTypeCode: ").append(toIndentedString(receiverTypeCode)).append("\n");
    sb.append("    transportDocumentTypeCode: ").append(toIndentedString(transportDocumentTypeCode)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    canceledDateTime: ").append(toIndentedString(canceledDateTime)).append("\n");
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

