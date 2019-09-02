package com.fusi24.hseauto.model.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fusi24.game.stereotype.Condition;
import com.fusi24.hseauto.model.util.Constants;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.Setter;

@JsonTypeInfo(use = Id.MINIMAL_CLASS, include = As.PROPERTY, property = "@class")
@JsonApiResource(type = "gameCondition", subTypes = {GameActionCondition.class, GameMetricCondition.class, GameFormulaCondition.class})
@Getter @Setter
@Entity
@Table(name = "game_condition", catalog = Constants.BEATS_SCHEMA)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class GameCondition extends BaseEntity implements Condition
{

}