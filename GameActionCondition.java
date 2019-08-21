package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fusi24.game.stereotype.ActionCondition;
import com.fusi24.game.stereotype.Operator;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gameActionCondition")
@Getter @Setter
@Entity
@DiscriminatorValue("ACTION")
public class GameActionCondition extends GameCondition implements ActionCondition<GameAction>
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_action_id", nullable = false)
	private GameAction action;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Operator operator;
	
	@Column(nullable = false)
	private Integer operand;
}