package com.example.arena;

import java.util.Random;

public class CreaturesFactory {

  Creature generate(CreatureType creatureType) {
    Creature creature;

    switch (creatureType) {
      case ELF:
        return new Elf(1, 1, 1, 1, 1, 1, 1, 1);
      case ORC:
        return new Orc(1, 1, 1, 1, 1, 1, 1, 1);
      case DWARF:
        return new Dwarf(1, 1, 1, 1, 1, 1, 1, 1);
      case HUMAN:
        return new Human(1, 1, 1, 1, 1, 1, 1, 1);
      case TROLL:
        return new Troll(1, 1, 1, 1, 1, 1, 1, 1);
      case HALFLING:
        return new Halfling(1, 1, 1, 1, 1, 1, 1, 1);
    }

    return null;

  }

  Creature generateRandom(){
    int r = new Random().nextInt(CreatureType.values().length);

    return generate(CreatureType.values()[r]);
  }

  }
