package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingTopicPosition")
@Getter @Setter
@Entity
@Table(name = "coaching_topic_position", catalog = Constants.BEATS_SCHEMA)
public class CoachingTopicPosition extends BaseEntity{
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coaching_position_id")
	private CoachingPosition position;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coaching_topic_id")
	private CoachingTopic topic;
	
	@Column(name = "is_active")
	@Type(type = "boolean")
	private Boolean isActive;

}
