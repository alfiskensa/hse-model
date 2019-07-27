package com.fusi24.hse.v2.model;

import java.util.Date;

import javax.persistence.Column;

import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "company")
@Getter @Setter
public class Company extends BaseModel implements HasName{

	private String code;
	
	@Column(name = "nama")
	private String name;
	
	private String address;
	
	private String cityAddress;
	
	private String postalCodeAddress;
	
	private String countryTelephoneCode;
	
	private String prefixTelephone;
	
	private String telephone;
	
	private String email;
	
	private String taxIdNumber;
	
	@JsonApiRelation
	private Status status;
	
	private Date updateDate;
	
	private String urlDocument;
	
	private String urlCode;
	
	private String companyCode;
	
	@JsonApiRelation
	private EmployeeType employeeType;

}
