package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fusi24.game.stereotype.MetricItem;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties("metric")
@JsonApiResource(type = "gameMetricItem")
@Getter @Setter
@Entity
@Table(name = "game_metric_item", catalog = Constants.BEATS_SCHEMA)
public class GameMetricItem extends BaseEntity implements MetricItem
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_id", nullable = false)
	private GameMetric metric;
	
	@Column(nullable = false)
	private String code;
	
	@Column(nullable = false)
	private String name;
	
	private String description;
	
	@Column(name = "max_count")
	private Integer maxCount;
}