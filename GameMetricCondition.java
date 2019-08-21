package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fusi24.game.stereotype.MetricCondition;
import com.fusi24.game.stereotype.Operator;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gameMetricCondition")
@Getter @Setter
@Entity
@DiscriminatorValue("METRIC")
public class GameMetricCondition extends GameCondition implements MetricCondition<GameMetric, GameMetricItem>
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_id", nullable = false)
	private GameMetric metric;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_item_id", nullable = false)
	private GameMetricItem metricItem;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Operator operator;
	
	@Column(nullable = false)
	private Integer operand;
}