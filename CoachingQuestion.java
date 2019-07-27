package com.fusi24.hse.v2.model;


import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingQuestion")
@Getter @Setter
public class CoachingQuestion extends BaseModel{
	
	private String question;
	
	@JsonApiRelation
	private CoachingTopic topic;
	
	@JsonApiRelation
	private CoachingQuestionType type;
	
	@JsonApiRelation
	private CoachingQuestionCategory category;
	
	private Boolean isActive;

}
