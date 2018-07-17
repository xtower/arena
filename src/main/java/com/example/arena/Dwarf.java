package com.example.arena;

public class Dwarf extends Creature {

  public Dwarf(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
               Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
               Integer lifePoints) {
    super(strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges,
          lifePoints, CreatureType.DWARF);
  }
}
