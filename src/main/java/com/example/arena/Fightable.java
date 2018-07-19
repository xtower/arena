package com.example.arena;

public interface Fightable {
  int attack(Creature target);

  int dodge(int potentialDamage, Creature attacker);
}
