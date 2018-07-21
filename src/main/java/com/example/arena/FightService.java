package com.example.arena;

public class FightService {
  public static void fight(Creature attacker, Creature defender){
    int dmg = attack(attacker, defender);

    if(defender.isAlive()){
      attack(defender, attacker);
    }
  }

  private static int attack(Creature attacker, Creature defender){
    int potentialDamage = attacker.attack(defender);
    return defender.dodge(potentialDamage,attacker);
  }
}
