package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingQuestionCategory")
@Getter
@Setter
@Entity
@Table(name = "coaching_question_category")
public class CoachingQuestionCategory extends BaseEntity implements HasName {

	@Column(name = "category_name")
	private String name;

}
