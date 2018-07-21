package com.example.arena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreaturesFactory {

  private Random random = new Random();

  Creature generate(CreatureType creatureType, int lifePoints, int value) {
    switch (creatureType) {
      case ELF:
        return new Elf(value, value, value, value, value, value, value, lifePoints);
      case ORC:
        return new Orc(value, value, value, value, value, value, value, lifePoints);
      case DWARF:
        return new Dwarf(value, value, value, value, value, value, value, lifePoints);
      case HUMAN:
        return new Human(value, value, value, value, value, value, value, lifePoints);
      case TROLL:
        return new Troll(value, value, value, value, value, value, value, lifePoints);
      case HALFLING:
        return new Halfling(value, value, value, value, value, value, value, lifePoints);
    }

    return null;
  }

  CreatureType randomCreatureType() {
    int r = random.nextInt(CreatureType.values().length);
    return CreatureType.values()[r];
  }

  Creature generateRandomCreature() {
    return generate(randomCreatureType(), random(40, 60), random(1, 9));
  }

  int random(int min, int max) {
    return min + this.random.nextInt(max + 1 - min);
  }

  List<Creature> randomCreatureList(int listSize) {
    List<Creature> creaturesList = new ArrayList<>();

    for (int i = 0; i < listSize; i++) {
      creaturesList.add(generateRandomCreature());
    }

    return creaturesList;
  }
}
