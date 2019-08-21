package com.fusi24.hseauto.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fusi24.common.stereotype.HasName;
import com.fusi24.common.stereotype.HasParent;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "pja")
@Getter
@Setter
@Entity
@Table(name = "m_pja", catalog = Constants.BEATS_SCHEMA)
public class Pja extends BaseEntityMaster implements HasName, HasParent<Pja> {

	private String name;

	@JsonApiRelation
	@OneToOne
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name = "id_parent")
	private Pja parent;

	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_site")
	private Location location;

	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pja_type")
	private PjaType pjaType;

}
