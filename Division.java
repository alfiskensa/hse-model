package com.fusi24.hse.v2.model;

import java.util.Date;

import javax.persistence.Column;

import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "division")
@Getter @Setter
public class Division extends BaseModel implements HasName{
	
	@Column(name = "nama")
	private String name;
	
	@JsonApiRelation
	private Company company;
	
	@JsonApiRelation
	private Status status;
	
	private Date updateDate;

	
}
