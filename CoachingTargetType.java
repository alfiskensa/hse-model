package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingTargetType")
@Getter
@Setter
@Entity
@Table(name = "coaching_target_type")
public class CoachingTargetType extends BaseEntity implements HasName {

	@Column(name = "type_name")
	private String name;
}
