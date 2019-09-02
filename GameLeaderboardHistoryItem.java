package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fusi24.game.stereotype.LeaderboardHistoryItem;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gameLeaderboardHistoryItem", postable = false, patchable = false, deletable = false)
@Getter @Setter
@Entity
@Table(name = "game_leaderboard_history_item", catalog = Constants.BEATS_SCHEMA)
public class GameLeaderboardHistoryItem extends BaseEntity implements LeaderboardHistoryItem<GameLeaderboardHistory, User, GameMetricItem>
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_leaderboard_history_id", nullable = false)
	private GameLeaderboardHistory leaderboardHistory;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(nullable = false)
	private Integer point;
	
	@Column(name = "previous_point")
	private Integer previousPoint;
	
	@Column(name = "rank_", nullable = false)
	private Integer rank;
	
	@Column(name = "previous_rank")
	private Integer previousRank;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_item_id")
	private GameMetricItem metricItem;
}
