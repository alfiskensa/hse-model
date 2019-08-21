package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingQuestionType")
@Getter
@Setter
@Entity
@Table(name = "coaching_question_type", catalog = Constants.BEATS_SCHEMA)
public class CoachingQuestionType extends BaseEntity implements HasName {

	@Column(name = "type_name")
	private String name;

}
