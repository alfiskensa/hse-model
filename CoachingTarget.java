package com.fusi24.hse.v2.model;

import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingTarget")
@Getter @Setter
public class CoachingTarget extends BaseModel{
	
	@JsonApiRelation
	private Position position;
	
	private Integer target;
	
	@JsonApiRelation
	private CoachingTargetType type;
	
	@JsonApiRelation
	@JsonIgnoreProperties("target")
	private Set<CoachingTargetTopic> topics;
	
	private Integer duration;

}
