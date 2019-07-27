package com.fusi24.hse.v2.model;

import javax.persistence.Column;

import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingTargetType")
@Getter @Setter
public class CoachingTargetType extends BaseModel implements HasName {

	@Column(name = "type_name")
	private String name;
}
