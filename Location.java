package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Type;

import com.fusi24.common.stereotype.HasActive;
import com.fusi24.common.stereotype.HasName;
import com.fusi24.common.stereotype.HasParent;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "location")
@Getter
@Setter
@Entity
@Table(name = "m_lokasi", catalog = Constants.BEATS_SCHEMA)
public class Location extends BaseEntity implements HasParent<Location>, HasActive, HasName {
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name = "id_parent")
	private Location parent;

	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipe")
	private LocationType type;

	@Column(name = "nama")
	private String name;

	@Column(name = "singkatan")
	private String shortName;

	@Column(name = "is_active")
	@Type(type = "boolean")
	private Boolean isActive;
}