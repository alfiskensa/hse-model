package com.fusi24.hseauto.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "pjaType")
@Getter
@Setter
@Entity
@Table(name = "m_pja_type", catalog = Constants.BEATS_SCHEMA)
public class PjaType extends BaseEntityMaster implements HasName {

	private String name;

	private String description;

}
