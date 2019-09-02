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
import com.fusi24.game.stereotype.LeaderboardReward;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties("leaderboard")
@JsonApiResource(type = "gameLeaderboardReward")
@Getter @Setter
@Entity
@Table(name = "game_leaderboard_reward", catalog = Constants.BEATS_SCHEMA)
public class GameLeaderboardReward extends BaseEntity implements LeaderboardReward<GameMetric, GameMetricItem>
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_leaderboard_id")
	private GameLeaderboard leaderboard;
	
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
	@Column(name = "reward_time", nullable = false)
	private RewardTime rewardTime;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "reward_measure", nullable = false)
	private RewardMeasure rewardMeasure;
	
	@Column(name = "min_value")
	private Integer minValue;
	
	@Column(name = "max_value")
	private Integer maxValue;
	
	@Column(name = "is_remove_on_finish")
	private Boolean isRemoveOnFinish;
	
	@Column(name = "is_primary")
	private Boolean isPrimary;
}
