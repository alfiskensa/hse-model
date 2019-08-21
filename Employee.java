package com.fusi24.hseauto.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "employee")
@Getter
@Setter
@Entity
@Table(name = "m_karyawan", catalog = Constants.SID_SCHEMA)
public class Employee extends BaseEntity implements HasName {

	@Column(name = "kode")
	private String code;

	@Column(name = "kode_sid")
	private String sidCode;

	@Column(name = "nik")
	private String regNumEmployee;

	@JsonApiRelation
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_perusahaan")
	private Company company;

	@Column(name = "nama")
	private String name;

	@Column(name = "tanggal_lahir")
	private Date dateOfBirth;

	@Column(name = "tempat_lahir")
	private String placeOfBirth;

	@JsonApiRelation
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_jabatan")
	private Position structuralPosition;

	@JsonApiRelation
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_jabatan_fungsional")
	private Position functionalPosition;

	@JsonApiRelation
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_jabatan_reserved")
	private Position reservedPosition;

	@Column(name = "tanggal_update")
	private Date updateDate;

	@JsonApiRelation
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_status")
	private SidStatus status;

	@Column(name = "alamat")
	private String address;

	@Column(name = "alamat_kabupaten")
	private String districtAddress;

	@Column(name = "alamat_province")
	private String provinceAddress;

	@Column(name = "negara")
	private String country;

	@Column(name = "telp")
	private String phone;

	@Column(name = "emergency_telp")
	private String emergencyPhone;

	@Column(name = "emergency_contact_person")
	private String emergencyContactPerson;

	@Column(name = "deskripsi")
	private String description;

	@JsonApiRelation
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_karyawan_tipe")
	private EmployeeType employeeType;

	private String email;

	@Column(name = "url_foto")
	private String urlPhoto;

	@Column(name = "url_kode")
	private String urlCode;

	@Column(name = "tanggal_hari_pertama")
	private Date firstDayDate;

	@Column(name = "tanggal_hari_terakhir")
	private Date lastDayDate;

	@Column(name = "alamat_kota")
	private String cityAddress;

	@Column(name = "alamat_kodepos")
	private String postalCodeAddress;

	@Column(name = "alamat_rt")
	private String neighborhoodAssociationAddress;

	@Column(name = "alamat_rw")
	private String hamletAssociationAddress;

	@Column(name = "alamat_kelurahan")
	private String villageAddress;

	@Column(name = "alamat_kecamatan")
	private String subDistrictAddress;

	@JsonApiRelation
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_departemen")
	private Department department;

}
