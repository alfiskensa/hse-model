package com.fusi24.hse.v2.model;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import io.crnk.core.resource.annotations.JsonApiId;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter @Setter
public class BaseModel
{
	@JsonApiId
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
}