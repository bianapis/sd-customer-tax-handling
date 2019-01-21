/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerTaxHandlingApiService {

	Void terminate(String crReferenceId);
	
	CustomerTaxHandlingConsolidationResponse executePostConsolidations(String crReferenceId, CustomerTaxHandlingConsolidationRequest request);
	
	CustomerTaxHandlingConsolidationResponse executePutConsolidations(String crReferenceId, String bqReferenceId, CustomerTaxHandlingConsolidationRequest request);
	
	CustomerTaxHandlingResponse initiate(CustomerTaxHandlingRequest request);
	
	CustomerTaxHandlingRecordResponse record(String crReferenceId, CustomerTaxHandlingRecordRequest request);
	
	CustomerTaxHandlingResponse requestPost(CustomerTaxHandlingRequest request);
	
	CustomerTaxHandlingResponse requestPut(String crReferenceId, CustomerTaxHandlingRequest request);
	
	CustomerTaxHandlingResponse retrieve(String crReferenceId);
	
	CustomerTaxHandlingAnalisysResponse retrieveAnalyses(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CustomerTaxHandlingConsolidationResponse retrieveConsolidations(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	CustomerTaxHandlingReportingResponse retrieveReportings(String crReferenceId, String bqReferenceId);
	
	CustomerTaxHandlingResponse update(String crReferenceId, CustomerTaxHandlingRequest request);
	
}
