package com.fusi24.hse.v2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingQuestionType")
@Getter @Setter
public class CoachingQuestionType extends BaseModel implements HasName{
	
	@Column(name = "type_name")
	private String name;
	
}
