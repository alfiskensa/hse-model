package com.fusi24.hse.v2.model;

import javax.persistence.Column;

import com.fusi24.common.stereotype.HasActive;
import com.fusi24.common.stereotype.HasName;
import com.fusi24.common.stereotype.HasParent;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "location")
@Getter @Setter
public class Location extends BaseModel implements HasParent<Location>, HasActive, HasName
{
	@JsonApiRelation
	private Location parent;
	
	@JsonApiRelation
	private LocationType type;
	
	@Column(name = "nama")
	private String name;
	
	private String shortName;
	
	private Boolean isActive;
}