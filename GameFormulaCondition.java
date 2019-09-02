package com.fusi24.hseauto.model.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.fusi24.game.stereotype.FormulaCondition;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonApiResource(type = "gameFormulaCondition", resourcePath = "gameCondition")
@Getter @Setter
@Entity
@DiscriminatorValue("FORMULA")
public class GameFormulaCondition extends GameCondition implements FormulaCondition
{
	@Column(nullable = false)
	private String formula;
}