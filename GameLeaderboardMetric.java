package com.fusi24.hseauto.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fusi24.game.stereotype.LeaderboardMetric;
import com.fusi24.hseauto.model.util.Constants;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "game_action", catalog = Constants.BEATS_SCHEMA)
public class GameLeaderboardMetric extends BaseEntity implements LeaderboardMetric<GamePointMetric>
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "leaderboard_id", nullable = false)
	private GameLeaderboard leaderboard;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "metric_id", nullable = false)
	private GamePointMetric metric;
	
	private Double multiplier;
}
