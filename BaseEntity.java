package com.fusi24.hseauto.model.entity;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import io.crnk.core.resource.annotations.JsonApiId;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
	@JsonApiId
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
}