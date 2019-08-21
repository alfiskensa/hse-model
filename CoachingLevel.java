package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingLevel")
@Getter @Setter
@Entity
@Table(name = "coaching_level", catalog = Constants.BEATS_SCHEMA)
public class CoachingLevel extends BaseEntity implements HasName {

	@Column(name = "level_name")
	private String name;
}
