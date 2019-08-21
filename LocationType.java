package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "locationType")
@Getter
@Setter
@Entity
@Table(name = "m_lokasi_tipe", catalog = Constants.BEATS_SCHEMA)
public class LocationType extends BaseEntity implements HasName {
	@Column(name = "nama")
	private String name;

	@Column(name = "deskripsi")
	private String description;
}