package com.fusi24.hse.v2.model;

import javax.persistence.Column;

import org.hibernate.annotations.Type;

import com.fusi24.common.stereotype.HasActive;
import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingTopic")
@Getter @Setter
public class CoachingTopic extends BaseModel implements HasName, HasActive{
	
	@JsonApiRelation
	private CoachingPosition position;
	
	@Column(name = "topic_name")
	private String name;
	
	@Type(type = "boolean")
	private Boolean isActive;
	

}
