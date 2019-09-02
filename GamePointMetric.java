package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.fusi24.game.stereotype.PointMetric;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gamePointMetric")
@Getter @Setter
@Entity
@DiscriminatorValue("POINT")
public class GamePointMetric extends GameMetric implements PointMetric
{
	@Column(name = "max_point")
	private Integer maxPoint;
	
	@Override
	public String getType()
	{
		return "POINT";
	}
	
	public void setType(String type) {};
}