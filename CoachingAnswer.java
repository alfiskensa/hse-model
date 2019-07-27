package com.fusi24.hse.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingAnswer")
@Getter @Setter
public class CoachingAnswer extends BaseModel{

	@JsonApiRelation
	private CoachingQuestion question;
	
	private String answer;
	
	@JsonApiRelation
	@JsonIgnoreProperties("answers")
	private CoachingResult result;

}
