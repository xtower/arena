package com.example.arena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreaturesFactory {

  private Random random = new Random();
  private CreatureNameGenerator cng = new CreatureNameGenerator();

  Creature generate(CreatureType creatureType, int lifePoints, int value) {
    switch (creatureType) {
      case ELF:
        return new Elf(value, value, value, value, value, value, value, lifePoints,cng.getRandomName());
      case ORC:
        return new Orc(value, value, value, value, value, value, value, lifePoints,cng.getRandomName());
      case DWARF:
        return new Dwarf(value, value, value, value, value, value, value, lifePoints,cng.getRandomName());
      case HUMAN:
        return new Human(value, value, value, value, value, value, value, lifePoints,cng.getRandomName());
      case TROLL:
        return new Troll(value, value, value, value, value, value, value, lifePoints,cng.getRandomName());
      case HALFLING:
        return new Halfling(value, value, value, value, value, value, value, lifePoints,cng.getRandomName());
    }

    return null;
  }

  Creature duplicate(Creature c) {
    switch (c.getCreatureType()) {
      case ELF:
        return new Elf(c.getStrength(),c.getDexterity(),c.getInitiative(),c.getVelocity(),c.getEndurance(),c.getNumberOfAttacks(),
                       c.getNumberOfDodges(),c.getLifePoints(), c.getName());
      case ORC:
        return new Orc(c.getStrength(),c.getDexterity(),c.getInitiative(),c.getVelocity(),c.getEndurance(),c.getNumberOfAttacks(),
                       c.getNumberOfDodges(),c.getLifePoints(), c.getName());
      case DWARF:
        return new Dwarf(c.getStrength(),c.getDexterity(),c.getInitiative(),c.getVelocity(),c.getEndurance(),c.getNumberOfAttacks(),
                         c.getNumberOfDodges(),c.getLifePoints(), c.getName());
      case HUMAN:
        return new Human(c.getStrength(),c.getDexterity(),c.getInitiative(),c.getVelocity(),c.getEndurance(),c.getNumberOfAttacks(),
                         c.getNumberOfDodges(),c.getLifePoints(), c.getName());
      case TROLL:
        return new Troll(c.getStrength(),c.getDexterity(),c.getInitiative(),c.getVelocity(),c.getEndurance(),c.getNumberOfAttacks(),
                         c.getNumberOfDodges(),c.getLifePoints(), c.getName());
      case HALFLING:
        return new Halfling(c.getStrength(),c.getDexterity(),c.getInitiative(),c.getVelocity(),c.getEndurance(),c.getNumberOfAttacks(),
                            c.getNumberOfDodges(),c.getLifePoints(), c.getName());
    }

    return null;
  }

  CreatureType randomCreatureType() {
    int r = random.nextInt(CreatureType.values().length);
    return CreatureType.values()[r];
  }

  Creature generateRandomCreature() {
    Creature randomCreature = generate(randomCreatureType(), random(40, 60), random(1, 9));

    generateRandomEquipment(randomCreature);

    return randomCreature;
  }

  private void generateRandomEquipment(Creature creature) {
    int maxItems = ArmourType.values().length;

    List<ArmourType> availableItems = new ArrayList<>();

    for (ArmourType a : ArmourType.values()) {
      availableItems.add(a);
    }

    int r = random(0, maxItems);

    for (int i = 0; i < r; i++) {
      int rr = random(0, availableItems.size() - 1);
      creature.equip(availableItems.get(rr));
      availableItems.remove(rr);
    }
  }

  int random(int min, int max) {
    return min + this.random.nextInt(max + 1 - min);
  }

  public List<Creature> randomCreatureList(int listSize) {
    List<Creature> creaturesList = new ArrayList<>();

    for (int i = 0; i < listSize; i++) {
      creaturesList.add(generateRandomCreature());
    }

    return creaturesList;
  }
}
