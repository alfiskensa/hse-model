package com.fusi24.hse.v2.model;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "status")
@Getter @Setter
public class Status extends BaseModel
{
	private String name;
	
	private String description;
	
	private String filter;
}
