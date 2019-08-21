package com.fusi24.hseauto.model.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fusi24.game.stereotype.SetMetric;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gameSetMetric")
@Getter @Setter
@Entity
@DiscriminatorValue("SET")
public class GameSetMetric extends GameMetric implements SetMetric<GameMetricItem>
{
	@JsonApiRelation
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "metric")
	private Set<GameMetricItem> items;
	
	@Override
	public String getType()
	{
		return "SET";
	}
}