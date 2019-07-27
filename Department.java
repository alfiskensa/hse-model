package com.fusi24.hse.v2.model;

import javax.persistence.Column;
import org.hibernate.annotations.Type;

import com.fusi24.common.stereotype.HasActive;
import com.fusi24.common.stereotype.HasName;
import com.fusi24.common.stereotype.HasParent;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "department")
@Getter @Setter
public class Department extends BaseModel implements HasName, HasParent<Department>, HasActive{
	
	@Column(name = "nama")
	private String name;
	
	@JsonApiRelation
	private Company company;
	
	@JsonApiRelation
	private Department parent;
	
	@Type(type = "boolean")
	private Boolean isActive;
	
	@JsonApiRelation
	private Division division;

}
