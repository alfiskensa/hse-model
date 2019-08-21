package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties("result")
@JsonApiResource(type = "coachingAnswer")
@Getter @Setter
@Entity
@Table(name = "coaching_answer")
public class CoachingAnswer extends BaseEntity {

	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "result_id")
	private CoachingResult result;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id")
	private CoachingQuestion question;

	@Column(name = "answer_1")
	private String answer1;
	
	@Column(name = "answer_2")
	private String answer2;
	
}
