package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Setter;
import lombok.Getter;

@JsonApiResource(type = "coachingQuestonItem")
@JsonIgnoreProperties("question")
@Getter @Setter
@Entity
@Table(name = "coaching_question_item", catalog = Constants.BEATS_SCHEMA)
public class CoachingQuestionItem extends BaseEntity implements HasName{
	
	@Column(name = "item_name")
	private String name;
	
	@Column(name = "is_active")
	@Type(type = "boolean")
	private Boolean isActive;
	
	@JsonApiRelation
	@ManyToOne
	@JoinColumn(name = "coaching_question_id")
	private CoachingQuestion question;

}
