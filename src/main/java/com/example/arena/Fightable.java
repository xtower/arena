package com.example.arena;

public interface Fightable {
  AttackResult attack(Creature target);

  int dodge(int potentialDamage, Creature attacker);
}
