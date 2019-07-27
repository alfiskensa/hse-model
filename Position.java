package com.fusi24.hse.v2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "position")
@Getter @Setter
public class Position extends BaseModel implements HasName {
	
	@Column(name = "nama")
	private String name;
	
	private String description;
	
	@JsonApiRelation
	private PositionType positionType;
	
	private Date updateDate;
	
	@JsonApiRelation
	private PositionType positionCategory;
	
	@JsonApiRelation
	private Company company;

}
