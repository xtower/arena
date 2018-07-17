package com.example.arena;

public class Elf extends Creature {


  public Elf(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
             Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
             Integer lifePoints) {
    super(strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges,
          lifePoints, CreatureType.ELF);
  }
}
