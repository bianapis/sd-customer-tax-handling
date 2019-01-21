package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerTaxHandlingConsolidationResponse
 */
public class CustomerTaxHandlingConsolidationResponse   {
  private String customerTaxHandlingArrangementReference = null;

  private String customerTaxHandlingConsolidationTaskReference = null;

  private String customerReference = null;

  private String customerProductServiceProfile = null;

  private String customerProductServiceTypeUsage = null;

  private String productInstanceReference = null;

  private String reportInstanceReference = null;

  private String reportType = null;

  private String reportOptionsSelectionCriteria = null;

  private String reportPeriod = null;

  private Object reportFormatTemplate = null;

  private Object reportRecord = null;

  private Object customerTaxHandlingConsolidationTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"customer tax handling arrangement reference\" 
   * @return customerTaxHandlingArrangementReference
  **/

  public String getCustomerTaxHandlingArrangementReference() {
    return customerTaxHandlingArrangementReference;
  }

  public void setCustomerTaxHandlingArrangementReference(String customerTaxHandlingArrangementReference) {
    this.customerTaxHandlingArrangementReference = customerTaxHandlingArrangementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the product activity consolidation task\" 
   * @return customerTaxHandlingConsolidationTaskReference
  **/

  public String getCustomerTaxHandlingConsolidationTaskReference() {
    return customerTaxHandlingConsolidationTaskReference;
  }

  public void setCustomerTaxHandlingConsolidationTaskReference(String customerTaxHandlingConsolidationTaskReference) {
    this.customerTaxHandlingConsolidationTaskReference = customerTaxHandlingConsolidationTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the customer\" 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"the is the eligibility profile including in-force product terms for the customer - defining sources for tax reporting\" 
   * @return customerProductServiceProfile
  **/

  public String getCustomerProductServiceProfile() {
    return customerProductServiceProfile;
  }

  public void setCustomerProductServiceProfile(String customerProductServiceProfile) {
    this.customerProductServiceProfile = customerProductServiceProfile;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"records the sold/in-force status of a product/service with the customer\" 
   * @return customerProductServiceTypeUsage
  **/

  public String getCustomerProductServiceTypeUsage() {
    return customerProductServiceTypeUsage;
  }

  public void setCustomerProductServiceTypeUsage(String customerProductServiceTypeUsage) {
    this.customerProductServiceTypeUsage = customerProductServiceTypeUsage;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the product/service for which transaction activity is to be obtained\" 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the product/service activity report\" 
   * @return reportInstanceReference
  **/

  public String getReportInstanceReference() {
    return reportInstanceReference;
  }

  public void setReportInstanceReference(String reportInstanceReference) {
    this.reportInstanceReference = reportInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"type of product/service activity report - transactional activity used for tax reporting\" 
   * @return reportType
  **/

  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"defines content/transaction types to be included in extract\" 
   * @return reportOptionsSelectionCriteria
  **/

  public String getReportOptionsSelectionCriteria() {
    return reportOptionsSelectionCriteria;
  }

  public void setReportOptionsSelectionCriteria(String reportOptionsSelectionCriteria) {
    this.reportOptionsSelectionCriteria = reportOptionsSelectionCriteria;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"from-to dates covered by the report for tax reporting\" 
   * @return reportPeriod
  **/

  public String getReportPeriod() {
    return reportPeriod;
  }

  public void setReportPeriod(String reportPeriod) {
    this.reportPeriod = reportPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"defines presentation format\" 
   * @return reportFormatTemplate
  **/

  public Object getReportFormatTemplate() {
    return reportFormatTemplate;
  }

  public void setReportFormatTemplate(Object reportFormatTemplate) {
    this.reportFormatTemplate = reportFormatTemplate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"the product/service tax reporting related activity report\" 
   * @return reportRecord
  **/

  public Object getReportRecord() {
    return reportRecord;
  }

  public void setReportRecord(Object reportRecord) {
    this.reportRecord = reportRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"the record that holds the consolidated product activity used to generate customer tax reports\" 
   * @return customerTaxHandlingConsolidationTaskRecord
  **/

  public Object getCustomerTaxHandlingConsolidationTaskRecord() {
    return customerTaxHandlingConsolidationTaskRecord;
  }

  public void setCustomerTaxHandlingConsolidationTaskRecord(Object customerTaxHandlingConsolidationTaskRecord) {
    this.customerTaxHandlingConsolidationTaskRecord = customerTaxHandlingConsolidationTaskRecord;
  }


}

