package com.fusi24.hse.v2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Type;

import com.fusi24.common.stereotype.HasParent;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingProbem")
@Getter @Setter
public class CoachingProblem extends BaseModel implements HasParent<CoachingProblem>{
	
	private String problem;
	
	@JsonApiRelation
	private CoachingProblem parent;

	@Type(type = "boolean")
	private Boolean isActive;

}
