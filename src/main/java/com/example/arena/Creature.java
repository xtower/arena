package com.example.arena;

public abstract class Creature {
  private Integer strength;
  private Integer dexterity;
  private Integer initiative;
  private Integer velocity;
  private Integer endurance;
  private Integer numberOfAttacks;
  private Integer numberOfDodges;
  private Integer lifePoints;
  private CreatureType creatureType;

  public Creature(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
                  Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
                  Integer lifePoints, CreatureType creatureType) {
    this.strength = strength;
    this.dexterity = dexterity;
    this.initiative = initiative;
    this.velocity = velocity;
    this.endurance = endurance;
    this.numberOfAttacks = numberOfAttacks;
    this.numberOfDodges = numberOfDodges;
    this.lifePoints = lifePoints;
    this.creatureType = creatureType;
  }

  public Integer getStrength() {
    return strength;
  }

  public Integer getDexterity() {
    return dexterity;
  }

  public Integer getInitiative() {
    return initiative;
  }

  public Integer getVelocity() {
    return velocity;
  }

  public Integer getEndurance() {
    return endurance;
  }

  public Integer getNumberOfAttacks() {
    return numberOfAttacks;
  }

  public Integer getNumberOfDodges() {
    return numberOfDodges;
  }

  public Integer getLifePoints() {
    return lifePoints;
  }

  public void setStrength(Integer strength) {
    this.strength = strength;
  }

  public void setDexterity(Integer dexterity) {
    this.dexterity = dexterity;
  }

  public void setInitiative(Integer initiative) {
    this.initiative = initiative;
  }

  public CreatureType getCreatureType() {
    return creatureType;
  }

  public void setCreatureType(CreatureType creatureType) {
    this.creatureType = creatureType;
  }

  public void setVelocity(Integer velocity) {
    this.velocity = velocity;
  }

  public void setEndurance(Integer endurance) {
    this.endurance = endurance;
  }

  public void setNumberOfAttacks(Integer numberOfAttacks) {
    this.numberOfAttacks = numberOfAttacks;
  }

  public void setNumberOfDodges(Integer numberOfDodges) {
    this.numberOfDodges = numberOfDodges;
  }

  public void setLifePoints(Integer lifePoints) {
    this.lifePoints = lifePoints;
  }

  @Override
  public String toString() {
    return "Creature{" +
           "\nstrength=" + strength +
           "\ndexterity=" + dexterity +
           "\ninitiative=" + initiative +
           "\nvelocity=" + velocity +
           "\nendurance=" + endurance +
           "\nnumberOfAttacks=" + numberOfAttacks +
           "\nnumberOfDodges=" + numberOfDodges +
           "\nlifePoints=" + lifePoints +
           "\ncreatureType='" + creatureType + '\'' +
           "\n\nsuper='" + super.toString() +
           '}';
  }
}
