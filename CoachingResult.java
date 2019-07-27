package com.fusi24.hse.v2.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonApiResource(type = "coachingResult")
@Getter @Setter
public class CoachingResult extends BaseModel {
	
	@JsonApiRelation
	private Employee coacher;
	
	@JsonApiRelation
	private Employee coachee;
	
	@JsonApiRelation
	private CoachingTopic topic;
	
	@JsonApiRelation
	@JsonIgnoreProperties("result")
	private Set<CoachingAnswer> answers;
	
	private Double score;
	
	private String predicate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@JsonApiRelation
	private Location location;

}
