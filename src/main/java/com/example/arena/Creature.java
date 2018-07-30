package com.example.arena;

import java.util.List;
import java.util.Random;

public abstract class Creature implements Fightable {

  private Integer strength;
  private Integer dexterity;
  private Integer initiative;
  private Integer velocity;
  private Integer endurance;
  private Integer numberOfAttacks;
  private Integer numberOfDodges;
  private Integer lifePoints;
  private CreatureType creatureType;
  private Equipment equipment;

  private RandomGenerator randomGenerator = new RandomGenerator();

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

    equipment = new Equipment();
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

  public CreatureType getCreatureType() {
    return creatureType;
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

  public void setVelocity(Integer velocity) {
    this.velocity = velocity;
  }

  public void setEndurance(Integer endurance) {
    this.endurance = endurance;
  }

  public void setRandomGenerator(RandomGenerator randomGenerator) {
    this.randomGenerator = randomGenerator;
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

  public void setCreatureType(CreatureType creatureType) {
    this.creatureType = creatureType;
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
           "\nequipment : " + equipment.toString() +
           "\nsuper='" + super.toString() +
           "}\n\n";
  }

  int random(int min, int max) {
    return this.randomGenerator.random(min,max);
  }

  @Override
  public AttackResult attack(Creature target) {
    BodyPart damagedBodyPart;

    int potentialDmg;

    try {
      damagedBodyPart = target.hitWhat();

      potentialDmg = this.strength + random(0, 3) + damagedBodyPart.getDmgBonus();
      System.out.println(
          "Creature was hit on the first try " + damagedBodyPart + " for: " + potentialDmg
          + "damage");
      return new AttackResult(damagedBodyPart, potentialDmg, 1);
    } catch (ArenaException e) {
      //hmmm
    }

    if (this.dexterity > random(1, 10)) {

      potentialDmg = this.strength + random(0, 3);
      System.out.println("Creature was hit on the second try for: " + potentialDmg + "damage");
      return new AttackResult(null, potentialDmg, 2);
    }

    System.out.println("Failed attack");

    return new AttackResult(null, 0, 0);

  }

  @Override
  public int dodge(int potentialDamage, Creature attacker) {
    if (this.initiative > random(1, 10)) {
      System.out.println("Dodge Successfull!");
      return 0;
    }

    int dmg = potentialDamage - this.endurance;

    if (dmg > 0) {
      this.lifePoints -= dmg;
    }

    if (!isAlive()) {
      System.out.println("Creature is Dead");
    }

    //troch nie wiem po co zwracam dmg...
    return dmg > 0 ? dmg : 0;
  }

  public boolean isAlive() {
    return this.lifePoints > 0;
  }

  public BodyPart hitWhat() throws NoBodyPartHitArenaException {
    int r = random(0, 99);
    int s = 0;

    for (BodyPart p : BodyPart.values()) {
      s += p.getHitProbability();

      if (s >= r) {
        return p;
      }
    }

    throw new NoBodyPartHitArenaException();
  }

  public void equip(ArmourType item){
    equipment.add(item);
  }


}
