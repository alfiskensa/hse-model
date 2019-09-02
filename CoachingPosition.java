package com.fusi24.hseauto.model.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fusi24.common.stereotype.HasActive;
import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingPosition")
@Getter
@Setter
@Entity
@Table(name = "coaching_position", catalog = Constants.BEATS_SCHEMA)
public class CoachingPosition extends BaseEntity implements HasName, HasActive {

	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name = "sid_department_id")
	private Department department;

	@Column(name = "pos_name")
	private String name;

	@Column(name = "pos_desc")
	private String description;

	@Column(name = "is_active")
	@Type(type = "boolean")
	private Boolean isActive;
	
	@JsonApiRelation
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "position")
	@JsonIgnoreProperties("position")
	private Set<CoachingTopicPosition> topics;

}
