package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "beatsStatus")
@Getter @Setter
@Entity
@Table(name = "m_status", catalog = Constants.BEATS_SCHEMA)
public class BeatsStatus extends BaseEntity
{
	@Column(name = "nama")
	private String name;
	
	private String description;
	
	private String filter;
}
