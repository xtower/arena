package com.example.arena;

public class Elf extends Creature {


  public Elf(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
             Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
             Integer lifePoints, String name) {
    super(strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges,
          lifePoints, CreatureType.ELF, name);
  }

  private Elf(){
    this.setCreatureType(CreatureType.TROLL);
  }

  @Override
  public Creature duplicate() {
    Elf c = new Elf();

    c.copy(this);

    return c;
  }
}
