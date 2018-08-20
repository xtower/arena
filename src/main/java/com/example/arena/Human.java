package com.example.arena;

public class Human extends Creature {


  public Human(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
               Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
               Integer lifePoints, String name) {
    super(strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges,
          lifePoints, CreatureType.HUMAN, name);
  }

  private Human(){
    this.setCreatureType(CreatureType.TROLL);
  }

  @Override
  public Creature duplicate() {
    Human c = new Human();

    c.copy(this);

    return c;
  }
}
