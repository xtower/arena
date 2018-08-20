package com.example.arena;

public interface Fightable {
  AttackResult attack(Creature target);

  int dodge(AttackResult attackResult);

  Creature duplicate();
}
