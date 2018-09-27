package com.example.arena;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;

import java.util.Collection;
import java.util.Optional;

@Getter
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
  private String name;

  @Autowired
  private RandomGenerator randomGenerator; // = new RandomGenerator();

  Creature(){}

  public void copy(Creature c){
    this.strength = c.strength;
    this.dexterity = c.dexterity;
    this.initiative = c.initiative;
    this.velocity = c.velocity;
    this.endurance = c.endurance;
    this.numberOfAttacks = c.numberOfAttacks;
    this.numberOfDodges = c.numberOfDodges;
    this.lifePoints = new Integer(c.lifePoints);
    this.creatureType = c.creatureType;

    this.name = c.name;

    this.equipment = new Equipment(c.getEquipment());
  }

  public Creature(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
                  Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
                  Integer lifePoints, CreatureType creatureType, String name) {
    this.strength = strength;
    this.dexterity = dexterity;
    this.initiative = initiative;
    this.velocity = velocity;
    this.endurance = endurance;
    this.numberOfAttacks = numberOfAttacks;
    this.numberOfDodges = numberOfDodges;
    this.lifePoints = lifePoints;
    this.creatureType = creatureType;

    this.name = name;

    equipment = new Equipment();
  }

  public abstract Creature duplicate();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString(){
    return this.name + "[" + this.creatureType + "]";
  }

  public void setRandomGenerator(RandomGenerator randomGenerator) {
    this.randomGenerator = randomGenerator;
  }

  public void setNumberOfAttacks(Integer numberOfAttacks) {
    this.numberOfAttacks = numberOfAttacks;
  }

  public Equipment getEquipment(){
    return this.equipment;
  }

  public void setEquipment(Equipment e){
    this.equipment = e;
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

  public String toStringFull() {
    return "Creature " + toString() + " {" +
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
    return this.randomGenerator.random(min, max);
  }

  @Override
  public AttackResult attack(Creature target) {
    //BodyPart damagedBodyPart;

    int potentialDmg = 0;
    int attack = 0;

    Optional<BodyPart> damagedBodyPart = target.hitWhat();

    if(damagedBodyPart.isPresent()){
      attack = 1;
      potentialDmg = this.strength + random(0, 3) + damagedBodyPart.get().getDmgBonus();
    } else if(this.dexterity > random(1, 10)) {
      damagedBodyPart = target.hitWhat();
      if(damagedBodyPart.isPresent()) {
        attack = 2;
        potentialDmg = this.strength + random(0, 3);
      }
    }

    return new AttackResult(damagedBodyPart, potentialDmg, attack);


  }

  public int dodge(AttackResult attackResult) {
    if (this.initiative > random(1, 10)) {
      System.out.println("Dodge Successfull!");
      return 0;
    }

    int
        dmg =
        attackResult.getPotentialDamage()
        - this.endurance
        - calculateProtection(this.equipment, attackResult.getBodyPart());

    if (dmg > 0) {
      this.lifePoints -= dmg;
    }

    if (!isAlive()) {
      System.out.println("Creature is Dead");
    }

    return dmg > 0 ? dmg : 0;
  }

  public boolean isAlive() {
    return this.lifePoints > 0;
  }

  public Optional<BodyPart> hitWhat() throws NoBodyPartHitArenaException {
    int r = random(0, 99);
    int s = 0;

    for (BodyPart p : BodyPart.values()) {
      s += p.getHitProbability();

      if (s >= r) {
        return Optional.of(p);
      }
    }

    return Optional.empty();
  }

  public void equip(ArmourType item) {
    equipment.add(item);
  }


  private int calculateProtection(Equipment equipment, Optional<BodyPart> bodyPartHit) {
    int protection = 0;

    if(!bodyPartHit.isPresent()){
      return protection;
    }

    Collection<ArmourType> armor = equipment.getProtectionItems(bodyPartHit.get());

    for (ArmourType a : armor) {
      protection += random(a.getMinProtection(), a.getMaxProtection());
    }

    return protection;
  }
}
