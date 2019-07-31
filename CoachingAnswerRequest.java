package com.fusi24.hseauto.model.request;

import java.math.BigInteger;

import lombok.Data;

@Data
public class CoachingAnswerRequest {
	
	private BigInteger questionId;
	
	private String answer;

}
