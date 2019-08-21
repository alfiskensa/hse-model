package com.fusi24.hseauto.model.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fusi24.game.stereotype.Leaderboard;
import com.fusi24.game.stereotype.TimePeriod;
import com.fusi24.hseauto.model.util.Constants;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "gane_leaderboard", catalog = Constants.BEATS_SCHEMA)
public class GameLeaderboard extends BaseEntity implements Leaderboard<GameLeaderboardMetric>
{
	@Column(nullable = false, unique = true)
	private String code;
	
	@Column(nullable = false)
	private String name;
	
	private String description;
	
	@Enumerated(EnumType.STRING)
	private TimePeriod period;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date")
	private Date endDate;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "leaderboard")
	private Set<GameLeaderboardMetric> metrics;
}
