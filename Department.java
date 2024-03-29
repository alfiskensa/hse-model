package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Type;

import com.fusi24.common.stereotype.HasActive;
import com.fusi24.common.stereotype.HasName;
import com.fusi24.common.stereotype.HasParent;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "department")
@Getter
@Setter
@Entity
@Table(name = "m_departemen", catalog = Constants.SID_SCHEMA)
public class Department extends BaseEntity implements HasName, HasParent<Department>, HasActive {

	@Column(name = "nama")
	private String name;

	@JsonApiRelation
	@OneToOne
	@JoinColumn(name = "id_perusahaan")
	private Company company;

	@JsonApiRelation
	@OneToOne
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name = "id_parent")
	private Department parent;

	@Type(type = "boolean")
	@Column(name = "is_active")
	private Boolean isActive;

	@JsonApiRelation
	@OneToOne
	@JoinColumn(name = "id_divisi")
	private Division division;

}
