package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerTaxHandlingResponse
 */
public class CustomerTaxHandlingResponse   {
  private String customerTaxHandlingArrangementReference = null;

  private String customerReference = null;

  private Object customerTaxHandlingArrangementRecord = null;

  private String taxJurisdictionReference = null;

  private String applicableTaxReportingRegulationReference = null;

  private String applicableTaxReportingRegulationInterpretation = null;

  private String customerTaxReportingSchedule = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the customer for who the consolidated tax position is maintained\" 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::? general-info: \"consolidated record of the customer tax reporting position\" 
   * @return customerTaxHandlingArrangementRecord
  **/

  public Object getCustomerTaxHandlingArrangementRecord() {
    return customerTaxHandlingArrangementRecord;
  }

  public void setCustomerTaxHandlingArrangementRecord(Object customerTaxHandlingArrangementRecord) {
    this.customerTaxHandlingArrangementRecord = customerTaxHandlingArrangementRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the applicable tax authority/jurisdiction that applies for the customer - can be multiple\" 
   * @return taxJurisdictionReference
  **/

  public String getTaxJurisdictionReference() {
    return taxJurisdictionReference;
  }

  public void setTaxJurisdictionReference(String taxJurisdictionReference) {
    this.taxJurisdictionReference = taxJurisdictionReference;
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


}

