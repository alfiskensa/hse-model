package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fusi24.game.stereotype.ActionVariable;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties("action")
@JsonApiResource(type = "gameActionVariable")
@Getter @Setter
@Entity
@Table(name = "game_action_variable", catalog = Constants.BEATS_SCHEMA)
public class GameActionVariable extends BaseEntity implements ActionVariable
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_action_id", nullable = false)
	private GameAction action;
	
	@Column(nullable = false)
	private String name;
	
	@Column(name = "variable_type")
	@Enumerated(EnumType.STRING)
	private VariableType variableType;
	
	@Column(name = "is_required")
	private Boolean isRequired;
}
