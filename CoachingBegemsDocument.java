package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingBegemsDocument")
@Getter @Setter
@Entity
@Table(name = "coaching_document_begems", catalog = Constants.BEATS_SCHEMA)
public class CoachingBegemsDocument extends BaseEntity implements HasName {
	
	@Column(name = "document_name")
	private String name;
	
	@Type(type = "boolean")
	@Column(name = "is_active")
	private Boolean isActive;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coaching_level_id")
	private CoachingLevel level;
	

}
