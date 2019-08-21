package com.fusi24.hseauto.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fusi24.game.stereotype.Inventory;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gameInventory", postable = false, patchable = false, deletable = false)
@Getter @Setter
@Entity
@Table(name = "game_inventory", catalog = Constants.BEATS_SCHEMA)
public class GameInventory extends BaseEntity implements Inventory<User, GameMetric, GameMetricItem>
{
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_id")
	private GameMetric metric;
	
	@JsonApiRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_metric_item_id")
	private GameMetricItem metricItem;
	
	private Integer quantity;
}
