package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingParamterResult")
@Getter @Setter
@Entity
@Table(name = "coaching_paramater_result", catalog = Constants.BEATS_SCHEMA)
public class CoachingParameterResult extends BaseEntity  {
	
	@Column(name = "category_result")
	private String categoryResult;
	
	private String description;
	
	@Column(name = "percentage_from")
	private Integer percentageFrom;
	
	@Column(name = "percentage_to")
	private Integer percentageTo;
	
	@Column(name = "is_active")
	@Type(type = "boolean")
	private Boolean isActive;

}
