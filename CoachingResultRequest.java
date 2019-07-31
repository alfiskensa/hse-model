package com.fusi24.hseauto.model.request;

import java.math.BigInteger;
import java.util.List;

import lombok.Data;

@Data
public class CoachingResultRequest {
	
	private BigInteger coacherId;
	
	private BigInteger coacheeId;
	
	private BigInteger topicId;
	
	private BigInteger locationId;
	
	private List<CoachingAnswerRequest> answers;

}
