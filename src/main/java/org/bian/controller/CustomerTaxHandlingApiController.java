/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CustomerTaxHandlingApiController {

	@Autowired
	CustomerTaxHandlingApiService service;
	
	@Fulfill.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@BQ("consolidations")
	@Fulfill.ExecutePost
	public BianResponse<CustomerTaxHandlingConsolidationResponse> executePostConsolidations(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerTaxHandlingConsolidationRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostConsolidations(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("consolidations")
	@Fulfill.ExecutePut
	public BianResponse<CustomerTaxHandlingConsolidationResponse> executePutConsolidations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerTaxHandlingConsolidationRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutConsolidations(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CustomerTaxHandlingResponse> initiate(@RequestBody BianRequest<CustomerTaxHandlingRequest> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<CustomerTaxHandlingRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerTaxHandlingRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.RequestPost
	public BianResponse<CustomerTaxHandlingResponse> requestPost(@RequestBody BianRequest<CustomerTaxHandlingRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Fulfill.RequestPut
	public BianResponse<CustomerTaxHandlingResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerTaxHandlingRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CustomerTaxHandlingResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("analyses")
	@Fulfill.Retrieve
	public BianResponse<CustomerTaxHandlingAnalisysResponse> retrieveAnalyses(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAnalyses(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("consolidations")
	@Fulfill.Retrieve
	public BianResponse<CustomerTaxHandlingConsolidationResponse> retrieveConsolidations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConsolidations(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reportings")
	@Fulfill.Retrieve
	public BianResponse<CustomerTaxHandlingReportingResponse> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CustomerTaxHandlingResponse> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerTaxHandlingRequest> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
