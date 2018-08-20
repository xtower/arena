package com.example.arena;

public class Troll extends Creature {

  public Troll(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
               Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
               Integer lifePoints, String name) {
    super(strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges,
          lifePoints, CreatureType.TROLL, name);
  }

  private Troll(){
    this.setCreatureType(CreatureType.TROLL);
  }

  @Override
  public Creature duplicate() {
    Troll c = new Troll();

    c.copy(this);

    return c;
  }
}
