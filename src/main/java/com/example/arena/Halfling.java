package com.example.arena;

public class Halfling extends Creature {

  public Halfling(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
                  Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
                  Integer lifePoints, String name) {
    super(strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges,
          lifePoints, CreatureType.HALFLING, name);
  }

  private Halfling(){
    this.setCreatureType(CreatureType.TROLL);
  }

  @Override
  public Creature duplicate() {
    Halfling c = new Halfling();

    c.copy(this);

    return c;
  }

}
