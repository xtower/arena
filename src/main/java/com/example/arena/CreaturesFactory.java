package com.example.arena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreaturesFactory {

  private Random random = new Random();

  Creature generate(CreatureType creatureType, int srrength, int value) {
    switch (creatureType) {
      case ELF:
        return new Elf(value, value, value, value, value, value, value, value);
      case ORC:
        return new Orc(value, value, value, value, value, value, value, value);
      case DWARF:
        return new Dwarf(value, value, value, value, value, value, value, value);
      case HUMAN:
        return new Human(value, value, value, value, value, value, value, value);
      case TROLL:
        return new Troll(value, value, value, value, value, value, value, value);
      case HALFLING:
        return new Halfling(value, value, value, value, value, value, value, value);
    }

    return null;
  }

  CreatureType randomCreatureType() {
    int r = random.nextInt(CreatureType.values().length);
    return CreatureType.values()[r];
  }

  Creature generateRandomCreature() {
    return generate(randomCreatureType(), random(4, 20), random(10, 20));
  }

  int random(int min, int max) {
    return min + new Random().nextInt(max + 1 - min);
  }

  List<Creature> randomCreatureList(int listSize) {
    List<Creature> creaturesList = new ArrayList<>();

    for (int i = 0; i < listSize; i++) {
      creaturesList.add(generateRandomCreature());
    }

    return creaturesList;
  }
}
