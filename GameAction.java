package com.fusi24.hseauto.model.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fusi24.game.stereotype.Action;
import com.fusi24.game.stereotype.TimePeriod;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gameAction", postable = false, patchable = false, deletable = false)
@Getter @Setter
@Entity
@Table(name = "game_action", catalog = Constants.BEATS_SCHEMA)
public class GameAction extends BaseEntity implements Action<GameCondition, GameActionReward, GameActionVariable>
{
	@Column(nullable = false, unique = true)
	private String code;
	
	@Column(nullable = false)
	private String name;
	
	private String description;
	
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
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@JsonApiRelation
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name = "game_action_condition",
			joinColumns = @JoinColumn(name = "game_action_id"),
			inverseJoinColumns = @JoinColumn(name = "game_condition_id"))
	private Set<GameCondition> conditions;

	@JsonApiRelation
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "action")
	private Set<GameActionReward> rewards;
	
	@JsonApiRelation
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "action")
	private Set<GameActionVariable> variables;

	@Override
	public GameCondition getCondition() {
		// TODO Auto-generated method stub
		return null;
	}
}
