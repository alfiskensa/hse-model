package com.fusi24.hseauto.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingTargetTopic")
@Getter
@Setter
@Entity
@Table(name = "coaching_target_topic", catalog = Constants.BEATS_SCHEMA)
public class CoachingTargetTopic extends BaseEntity {

	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "target_id")
	// @JsonIgnoreProperties("topics")
	private CoachingTarget target;

	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "topic_id")
	private CoachingTopic topic;

}
