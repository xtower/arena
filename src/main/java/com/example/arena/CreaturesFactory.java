package com.example.arena;

public class CreaturesFactory {

  Creature generate (CreatureType creatureType){
    Creature creature;

    switch (creatureType){
      case ELF:
        return new Elf(1,1,1,1,1,1,1,1);
      case ORC:
        return new Orc(1,1,1,1,1,1,1,1);
      case DWARF:
        return new Dwarf(1,1,1,1,1,1,1,1);
      case HUMAN:
        return new Human(1,1,1,1,1,1,1,1);
      case TROLL:
        return new Troll(1,1,1,1,1,1,1,1);
      case HALFING:
        return new Halfing(1,1,1,1,1,1,1,1);
    }

  return null;

  }
}
