package com.fusi24.hse.v2.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingTargetTopic")
@Getter @Setter
public class CoachingTargetTopic extends BaseModel {
	
	@JsonApiRelation
	@JsonIgnoreProperties("topics")
	private CoachingTarget target;
	
	@JsonApiRelation
	private CoachingTopic topic;

}
