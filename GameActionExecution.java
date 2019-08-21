package com.fusi24.hseauto.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fusi24.game.stereotype.ActionExecution;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gameActionExecution", postable = false, patchable = false, deletable = false)
@Getter @Setter
@Entity
@Table(name = "game_action_execution", catalog = Constants.BEATS_SCHEMA)
public class GameActionExecution extends BaseEntity implements ActionExecution<GameAction, User>
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_action_id")
	private GameAction action;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date date;
	
	private String variables;
}