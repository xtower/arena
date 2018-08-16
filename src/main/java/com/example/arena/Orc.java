package com.example.arena;

public class Orc extends Creature {


  public Orc(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
             Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
             Integer lifePoints, String name) {
    super(strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges,
          lifePoints, CreatureType.ORC, name);
  }
}
