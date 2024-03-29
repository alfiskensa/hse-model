package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingDept")
@Getter
@Setter
@Entity
@Table(name = "coaching_dept", catalog = Constants.BEATS_SCHEMA)
public class CoachingDept extends BaseEntity implements HasName {

	@Column(name = "dept_name")
	private String name;

	@Column(name = "dept_desc")
	private String description;

	@Column(name = "is_active")
	@Type(type = "boolean")
	private Boolean isActive;
}
