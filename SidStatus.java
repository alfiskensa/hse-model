package com.fusi24.hseauto.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "sidStatus")
@Getter
@Setter
@Entity
@Table(name = "m_status", catalog = Constants.SID_SCHEMA)
public class SidStatus extends BaseEntity implements HasName {

	@Column(name = "nama")
	private String name;

	@Column(name = "deskripsi")
	private String description;

	@Column(name = "tanggal_update")
	private Date updateDate;

	private String category;
}