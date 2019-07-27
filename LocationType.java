package com.fusi24.hse.v2.model;

import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "locationType")
@Getter @Setter
public class LocationType extends BaseModel implements HasName
{
	private String name;
	
	private String description;
}