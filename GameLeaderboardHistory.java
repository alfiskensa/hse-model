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

import com.fusi24.game.stereotype.LeaderboardHistory;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gameLeaderboardHistory", postable = false, patchable = false, deletable = false)
@Getter @Setter
@Entity
@Table(name = "game_leaderboard_history", catalog = Constants.BEATS_SCHEMA)
public class GameLeaderboardHistory extends BaseEntity implements LeaderboardHistory<GameLeaderboard>
{	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_leaderboard_id", nullable = false)
	private GameLeaderboard leaderboard;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "is_current", nullable = false)
	private Boolean isCurrent;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated")
	private Date lastUpdated;
}
