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

import com.fusi24.game.stereotype.Reward;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gameReward", postable = false, patchable = false, deletable = false)
@Getter @Setter
@Entity
@Table(name = "game_reward", catalog = Constants.BEATS_SCHEMA)
public class GameReward extends BaseEntity implements Reward<User, GameActionExecution, GameActionReward, GameLeaderboardHistory, GameLeaderboardReward, GameMetric, GameMetricItem>
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_action_execution_id")
	private GameActionExecution actionExecution;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_action_reward_id")
	private GameActionReward actionReward;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_leaderboard_history_id")
	private GameLeaderboardHistory leaderboardHistory;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_leaderboard_reward_id")
	private GameLeaderboardReward leaderboardReward;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_id")
	private GameMetric metric;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_item_id")
	private GameMetricItem metricItem;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date date;
	
	@Column(name = "reward_value", nullable = false)
	private Integer rewardValue;
}
