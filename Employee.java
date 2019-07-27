package com.fusi24.hse.v2.model;

import java.util.Date;

import javax.persistence.Column;

import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "employee")
@Getter @Setter
public class Employee extends BaseModel implements HasName{
	
	private String code;

	private String sidCode;
	
	private String regNumEmployee;
	
	@JsonApiRelation
	private Company company;
	
	@Column(name = "nama")
	private String name;

	private Date dateOfBirth;

	private String placeOfBirth;
	
	@JsonApiRelation
	private Position structuralPosition;

	@JsonApiRelation
	private Position functionalPosition;
	
	@JsonApiRelation
	private Position reservedPosition;

	private Date updateDate;
	
	@JsonApiRelation
	private Status status;
	
	private String address;

	private String districtAddress;

	private String provinceAddress;

	private String country;

	private String phone;

	private String emergencyPhone;

	private String emergencyContactPerson;

	private String description;
	
	@JsonApiRelation
	private EmployeeType employeeType;

	private String email;

	private String urlPhoto;
	
	private String urlCode;

	private Date firstDayDate;
	
	private Date lastDayDate;

	private String cityAddress;
	
	private String postalCodeAddress;

	private String neighborhoodAssociationAddress;

	private String hamletAssociationAddress;

	private String villageAddress;

	private String subDistrictAddress;
	
	@JsonApiRelation
	private Department department;

}
