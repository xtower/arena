package com.example.arena;

public class Halfling extends Creature {

  public Halfling(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
                  Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
                  Integer lifePoints) {
    super(strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges,
          lifePoints, CreatureType.HALFLING);
  }
}
