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

@JsonApiResource(type = "division")
@Getter
@Setter
@Entity
@Table(name = "m_divisi", catalog = Constants.SID_SCHEMA)
public class Division extends BaseEntity implements HasName {

	@Column(name = "nama")
	private String name;

	@JsonApiRelation
	@OneToOne
	@JoinColumn(name = "id_perusahaan")
	private Company company;

	@JsonApiRelation
	@OneToOne
	@JoinColumn(name = "id_status")
	private SidStatus status;

	@Column(name = "tanggal_update")
	private Date updateDate;

}
