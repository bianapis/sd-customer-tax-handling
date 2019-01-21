/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerTaxHandlingApiServiceImpl implements CustomerTaxHandlingApiService {

	public Void terminate(String crReferenceId){
		return null;
	}
	
	public CustomerTaxHandlingConsolidationResponse executePostConsolidations(String crReferenceId, CustomerTaxHandlingConsolidationRequest request){
		return JsonReader.read("executePost-CustomerTaxHandlingConsolidationResponse.json",new TypeReference<CustomerTaxHandlingConsolidationResponse>(){});
	}
	
	public CustomerTaxHandlingConsolidationResponse executePutConsolidations(String crReferenceId, String bqReferenceId, CustomerTaxHandlingConsolidationRequest request){
		return JsonReader.read("executePut-CustomerTaxHandlingConsolidationResponse.json",new TypeReference<CustomerTaxHandlingConsolidationResponse>(){});
	}
	
	public CustomerTaxHandlingResponse initiate(CustomerTaxHandlingRequest request){
		return JsonReader.read("initiate-CustomerTaxHandlingResponse.json",new TypeReference<CustomerTaxHandlingResponse>(){});
	}
	
	public CustomerTaxHandlingRecordResponse record(String crReferenceId, CustomerTaxHandlingRecordRequest request){
		return JsonReader.read("record-CustomerTaxHandlingRecordResponse.json",new TypeReference<CustomerTaxHandlingRecordResponse>(){});
	}
	
	public CustomerTaxHandlingResponse requestPost(CustomerTaxHandlingRequest request){
		return JsonReader.read("requestPost-CustomerTaxHandlingResponse.json",new TypeReference<CustomerTaxHandlingResponse>(){});
	}
	
	public CustomerTaxHandlingResponse requestPut(String crReferenceId, CustomerTaxHandlingRequest request){
		return JsonReader.read("requestPut-CustomerTaxHandlingResponse.json",new TypeReference<CustomerTaxHandlingResponse>(){});
	}
	
	public CustomerTaxHandlingResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CustomerTaxHandlingResponse.json",new TypeReference<CustomerTaxHandlingResponse>(){});
	}
	
	public CustomerTaxHandlingAnalisysResponse retrieveAnalyses(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerTaxHandlingAnalisysResponse.json",new TypeReference<CustomerTaxHandlingAnalisysResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerTaxHandlingConsolidationResponse retrieveConsolidations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerTaxHandlingConsolidationResponse.json",new TypeReference<CustomerTaxHandlingConsolidationResponse>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerTaxHandlingReportingResponse retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerTaxHandlingReportingResponse.json",new TypeReference<CustomerTaxHandlingReportingResponse>(){});
	}
	
	public CustomerTaxHandlingResponse update(String crReferenceId, CustomerTaxHandlingRequest request){
		return JsonReader.read("update-CustomerTaxHandlingResponse.json",new TypeReference<CustomerTaxHandlingResponse>(){});
	}
	
}
