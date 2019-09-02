package com.fusi24.hseauto.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fusi24.game.stereotype.CompositeMetricItem;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties("parentMetric")
@JsonApiResource(type = "gameCompositeMetricItem")
@Getter @Setter
@Entity
@Table(name = "game_composite_metric_item", catalog = Constants.BEATS_SCHEMA)
public class GameCompositeMetricItem extends BaseEntity implements CompositeMetricItem<GamePointMetric>
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_parent_metric_id", nullable = false)
	private GameCompositeMetric parentMetric;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_id", nullable = false)
	private GamePointMetric metric;
	
	private Double multiplier;
}
