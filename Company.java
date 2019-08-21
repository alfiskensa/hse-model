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

@JsonApiResource(type = "company")
@Getter
@Setter
@Entity
@Table(name = "m_perusahaan", catalog = Constants.SID_SCHEMA)
public class Company extends BaseEntity implements HasName {

	private String code;

	@Column(name = "nama")
	private String name;

	@Column(name = "alamat")
	private String address;

	@Column(name = "alamat_kota")
	private String cityAddress;

	@Column(name = "alamat_kodepos")
	private String postalCodeAddress;

	@Column(name = "telp_kode_negara")
	private String countryTelephoneCode;

	@Column(name = "telp_prefix")
	private String prefixTelephone;

	@Column(name = "telp")
	private String telephone;

	private String email;

	@Column(name = "npwp")
	private String taxIdNumber;

	@JsonApiRelation
	@OneToOne
	@JoinColumn(name = "id_status")
	private SidStatus status;

	@Column(name = "tanggal_update")
	private Date updateDate;

	@Column(name = "url_dokumen")
	private String urlDocument;

	@Column(name = "url_kode")
	private String urlCode;

	@Column(name = "code_perusahaan")
	private String companyCode;

	@JsonApiRelation
	@OneToOne
	@JoinColumn(name = "id_perusahaan_tipe")
	private EmployeeType employeeType;

}
