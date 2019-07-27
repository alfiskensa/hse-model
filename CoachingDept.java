package com.fusi24.hse.v2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonApiResource(type = "coachingDept")
@Getter @Setter
public class CoachingDept extends BaseModel implements HasName{
	
	@Column(name = "dept_name")
	private String name;
	
	private String description;
	
	@Type(type = "boolean")
	private Boolean isActive;
}
