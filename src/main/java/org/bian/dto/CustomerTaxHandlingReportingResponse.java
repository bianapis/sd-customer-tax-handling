package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerTaxHandlingReportingResponse
 */
public class CustomerTaxHandlingReportingResponse   {
  private String customerTaxHandlingArrangementReference = null;

  private String customerTaxHandlingReportingTaskReference = null;

  private String customerTaxReportingSchedule = null;

  private Object customerTaxHandlingArrangementRecord = null;

  private String customerTaxReportInstanceReference = null;

  private String customerTaxReportType = null;

  private String customerTaxReportPeriod = null;

  private Object customerTaxReportRecord = null;

  private Object customerTaxHandlingReportingTaskRecord = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the tax reporting to the customer and tax authorities as necessary\" 
   * @return customerTaxHandlingReportingTaskReference
  **/

  public String getCustomerTaxHandlingReportingTaskReference() {
    return customerTaxHandlingReportingTaskReference;
  }

  public void setCustomerTaxHandlingReportingTaskReference(String customerTaxHandlingReportingTaskReference) {
    this.customerTaxHandlingReportingTaskReference = customerTaxHandlingReportingTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"defines the customer tax reporting obligations\" 
   * @return customerTaxReportingSchedule
  **/

  public String getCustomerTaxReportingSchedule() {
    return customerTaxReportingSchedule;
  }

  public void setCustomerTaxReportingSchedule(String customerTaxReportingSchedule) {
    this.customerTaxReportingSchedule = customerTaxReportingSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"consolidated record of the customer tax reporting position - basis for tax reports\" 
   * @return customerTaxHandlingArrangementRecord
  **/

  public Object getCustomerTaxHandlingArrangementRecord() {
    return customerTaxHandlingArrangementRecord;
  }

  public void setCustomerTaxHandlingArrangementRecord(Object customerTaxHandlingArrangementRecord) {
    this.customerTaxHandlingArrangementRecord = customerTaxHandlingArrangementRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the customer tax report - sent to the customer or tax authority directly\" 
   * @return customerTaxReportInstanceReference
  **/

  public String getCustomerTaxReportInstanceReference() {
    return customerTaxReportInstanceReference;
  }

  public void setCustomerTaxReportInstanceReference(String customerTaxReportInstanceReference) {
    this.customerTaxReportInstanceReference = customerTaxReportInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"type of tax report, includes products/services covered and the tax jurisdiction/authority reference as necessary\" 
   * @return customerTaxReportType
  **/

  public String getCustomerTaxReportType() {
    return customerTaxReportType;
  }

  public void setCustomerTaxReportType(String customerTaxReportType) {
    this.customerTaxReportType = customerTaxReportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"from-to dates covered by the tax report\" 
   * @return customerTaxReportPeriod
  **/

  public String getCustomerTaxReportPeriod() {
    return customerTaxReportPeriod;
  }

  public void setCustomerTaxReportPeriod(String customerTaxReportPeriod) {
    this.customerTaxReportPeriod = customerTaxReportPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"the product/service tax report\" 
   * @return customerTaxReportRecord
  **/

  public Object getCustomerTaxReportRecord() {
    return customerTaxReportRecord;
  }

  public void setCustomerTaxReportRecord(Object customerTaxReportRecord) {
    this.customerTaxReportRecord = customerTaxReportRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"the processing record for tax reporting activity\" 
   * @return customerTaxHandlingReportingTaskRecord
  **/

  public Object getCustomerTaxHandlingReportingTaskRecord() {
    return customerTaxHandlingReportingTaskRecord;
  }

  public void setCustomerTaxHandlingReportingTaskRecord(Object customerTaxHandlingReportingTaskRecord) {
    this.customerTaxHandlingReportingTaskRecord = customerTaxHandlingReportingTaskRecord;
  }


}

