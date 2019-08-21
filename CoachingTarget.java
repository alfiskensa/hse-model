package com.fusi24.hseauto.model.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingTarget")
@Getter
@Setter
@Entity
@Table(name = "coaching_target", catalog = Constants.BEATS_SCHEMA)
public class CoachingTarget extends BaseEntity {

	@JsonApiRelation
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pos_id")
	private Position position;

	private Integer target;

	@JsonApiRelation
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type_id")
	private CoachingTargetType type;

	@JsonApiRelation
	@OneToMany(mappedBy = "target", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("target")
	private Set<CoachingTargetTopic> topics;

	private Integer duration;
	
	@Column(name = "start_date")
	private Date startDate;

}
