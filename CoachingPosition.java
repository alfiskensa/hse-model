package com.fusi24.hse.v2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fusi24.common.stereotype.HasActive;
import com.fusi24.common.stereotype.HasName;
import com.fusi24.common.stereotype.HasParent;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonApiResource(type = "coachingPosition")
@Getter @Setter
public class CoachingPosition extends BaseModel implements HasName ,HasActive {
	
	@JsonApiRelation
	private CoachingDept department;
	
	@Column(name = "pos_name")
	private String name;
	
	private String description;
	
	@Type(type = "boolean")
	private Boolean isActive;

}
