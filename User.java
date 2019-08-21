package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "user")
@Getter @Setter
@Entity
@Table(name = "sys_user", catalog = Constants.BEATS_SCHEMA)
public class User extends BaseEntity implements com.fusi24.common.stereotype.security.User
{
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false)
	private String password;
}