package com.fusi24.hseauto.model.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fusi24.game.stereotype.Leaderboard;
import com.fusi24.game.stereotype.TimePeriod;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

//@JsonIgnoreProperties("metric")
@JsonApiResource(type = "gameLeaderboard")
@Getter @Setter
@Entity
@Table(name = "game_leaderboard", catalog = Constants.BEATS_SCHEMA)
public class GameLeaderboard extends BaseEntity implements Leaderboard<GameMetric, GameLeaderboardReward>
{
	@Column(nullable = false, unique = true)
	private String code;
	
	@Column(nullable = false)
	private String name;
	
	private String description;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_id", nullable = false)
	private GameMetric metric;
	
	@Enumerated(EnumType.STRING)
	private TimePeriod period;
	
	@Column(name = "period_value")
	private Integer periodValue;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date")
	private Date endDate;
	
	@JsonApiRelation
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "leaderboard")
	private Set<GameLeaderboardReward> rewards;
}
