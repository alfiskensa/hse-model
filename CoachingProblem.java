package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Type;

import com.fusi24.common.stereotype.HasParent;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingProbem")
@Getter
@Setter
@Entity
@Table(name = "coaching_problem", catalog = Constants.BEATS_SCHEMA)
public class CoachingProblem extends BaseEntity implements HasParent<CoachingProblem> {

	private String problem;

	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name = "parent_id")
	private CoachingProblem parent;

	@Type(type = "boolean")
	@Column(name = "is_active")
	private Boolean isActive;

}
