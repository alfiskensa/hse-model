package com.fusi24.hseauto.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "position")
@Getter
@Setter
@Entity
@Table(name = "m_jabatan", catalog = Constants.SID_SCHEMA)
public class Position extends BaseEntity implements HasName {

	@Column(name = "nama")
	private String name;

	@Column(name = "deskripsi")
	private String description;

	@JsonApiRelation
	@OneToOne
	@JoinColumn(name = "id_jabatan_tipe")
	private PositionType positionType;

	@Column(name = "tanggal_update")
	private Date updateDate;

	@JsonApiRelation
	@OneToOne
	@JoinColumn(name = "id_jabatan_kategori")
	private PositionType positionCategory;

	@JsonApiRelation
	@OneToOne
	@JoinColumn(name = "id_perusahaan")
	private Company company;

}
