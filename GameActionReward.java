package com.fusi24.hseauto.model.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fusi24.game.stereotype.ActionReward;
import com.fusi24.game.stereotype.TimePeriod;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties("action")
@JsonApiResource(type = "gameActionReward", postable = false, patchable = false, deletable = false)
@Getter @Setter
@Entity
@Table(name = "game_action_reward", catalog = Constants.BEATS_SCHEMA)
public class GameActionReward extends BaseEntity implements ActionReward<GameMetric, GameMetricItem, GameCondition>
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_action_id", nullable = false)
	private GameAction action;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_id", nullable = false)
	private GameMetric metric;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_item_id")
	private GameMetricItem metricItem;
	
	@Column(name = "reward_value", nullable = false)
	private Integer rewardValue;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "limit_type")
	private LimitType limitType;
	
	@Column(name = "limit_value")
	private Integer limitValue;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "limit_period_type")
	private TimePeriod limitPeriodType;
	
	@Column(name = "limit_period_value")
	private Integer limitPeriodValue;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@JsonApiRelation
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name = "game_action_reward_condition",
			joinColumns = @JoinColumn(name = "game_action_reward_id"),
			inverseJoinColumns = @JoinColumn(name = "game_condition_id"))
	private GameCondition condition;
}
