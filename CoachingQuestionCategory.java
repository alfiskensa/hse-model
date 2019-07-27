package com.fusi24.hse.v2.model;

import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingQuestionCategory")
@Getter @Setter
public class CoachingQuestionCategory extends BaseModel implements HasName{
	
	@Column(name = "category_name")
	private String name;

}
