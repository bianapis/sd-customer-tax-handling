package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerTaxHandlingAnalisysResponse
 */
public class CustomerTaxHandlingAnalisysResponse   {
  private String customerTaxHandlingArrangementReference = null;

  private String customerTaxHandlingAnalysisTaskReference = null;

  private Object customerTaxHandlingConsolidationTaskRecord = null;

  private String applicableTaxReportingRegulationReference = null;

  private String applicableTaxReportingRegulationInterpretation = null;

  private String customerTaxReportingSchedule = null;

  private Object customerTaxHandlingArrangementRecord = null;

  private Object customerTaxHandlingAnalysisTaskRecord = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the tax reporting analysis performed\" 
   * @return customerTaxHandlingAnalysisTaskReference
  **/

  public String getCustomerTaxHandlingAnalysisTaskReference() {
    return customerTaxHandlingAnalysisTaskReference;
  }

  public void setCustomerTaxHandlingAnalysisTaskReference(String customerTaxHandlingAnalysisTaskReference) {
    this.customerTaxHandlingAnalysisTaskReference = customerTaxHandlingAnalysisTaskReference;
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


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"\" 
   * @return applicableTaxReportingRegulationReference
  **/

  public String getApplicableTaxReportingRegulationReference() {
    return applicableTaxReportingRegulationReference;
  }

  public void setApplicableTaxReportingRegulationReference(String applicableTaxReportingRegulationReference) {
    this.applicableTaxReportingRegulationReference = applicableTaxReportingRegulationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"covers all tax reporting guidelines, schedule and position reporting requirments for the customer\" 
   * @return applicableTaxReportingRegulationInterpretation
  **/

  public String getApplicableTaxReportingRegulationInterpretation() {
    return applicableTaxReportingRegulationInterpretation;
  }

  public void setApplicableTaxReportingRegulationInterpretation(String applicableTaxReportingRegulationInterpretation) {
    this.applicableTaxReportingRegulationInterpretation = applicableTaxReportingRegulationInterpretation;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"consolidated record of the customer tax reporting position - value is updated by this task\" 
   * @return customerTaxHandlingArrangementRecord
  **/

  public Object getCustomerTaxHandlingArrangementRecord() {
    return customerTaxHandlingArrangementRecord;
  }

  public void setCustomerTaxHandlingArrangementRecord(Object customerTaxHandlingArrangementRecord) {
    this.customerTaxHandlingArrangementRecord = customerTaxHandlingArrangementRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"the derived customer tax position/statement developed by this task and used for reporting\" 
   * @return customerTaxHandlingAnalysisTaskRecord
  **/

  public Object getCustomerTaxHandlingAnalysisTaskRecord() {
    return customerTaxHandlingAnalysisTaskRecord;
  }

  public void setCustomerTaxHandlingAnalysisTaskRecord(Object customerTaxHandlingAnalysisTaskRecord) {
    this.customerTaxHandlingAnalysisTaskRecord = customerTaxHandlingAnalysisTaskRecord;
  }


}

