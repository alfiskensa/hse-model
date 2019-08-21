package com.fusi24.hseauto.model.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fusi24.common.stereotype.HasActive;
import com.fusi24.common.stereotype.HasName;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "coachingTopic")
@Getter
@Setter
@Entity
@Table(name = "coaching_topic", catalog = Constants.BEATS_SCHEMA)
public class CoachingTopic extends BaseEntity implements HasName, HasActive {
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name = "coaching_document_begems_id")
	private CoachingBegemsDocument document;

	@Column(name = "topic_code")
	private String code;
	
	@Column(name = "topic_name")
	private String name;
	
	private Date date;
	
	private String revision;
	
	@Column(name = "filename")
	private String fileName;
	
	@Column(name = "filepath")
	private String filePath;

	@Column(name = "is_active")
	@Type(type = "boolean")
	private Boolean isActive;

}
