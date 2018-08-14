package com.example.arena;

import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FightService {

  private Creature mostPowerfulHitCreature;
  private int mostPowerfulHitDmg;
  Map<String, Integer> bodyPartHit = new HashMap<>();


  public void fight(Creature attacker, Creature defender) {
    AttackResult ar;

    ar = attack(attacker, defender);
    checkIfMostPowerfullHit(attacker, ar.getPotentialDamage());

    if (defender.isAlive()) {
      ar = attack(defender, attacker);
      checkIfMostPowerfullHit(defender, ar.getPotentialDamage());
    }

    String name;
    if (ar.getWhichAttack() == 1) {
      name = ar.getBodyPart().toString();
    } else if (ar.getWhichAttack() == 2) {
      name = "NOT SPECIFIED";
    } else {
      name = "MISS";
    }
    countBodyPartHit(name);

  }

  public Creature getMostPowerfulHitCreature() {
    return mostPowerfulHitCreature;
  }

  public int getMostPowerfulHitDmg() {
    return mostPowerfulHitDmg;
  }

  public Map<String, Integer> getBodyPartHit() {
    return bodyPartHit;
  }

  public Collection<Collection<Creature>> getDuelPairs(Collection<Creature> creatures) {
    Collection<Collection<Creature>> result;

    for(int i = 0; i < creatures.size(); i++){

    }

    return null;
  }

  private AttackResult attack(Creature attacker, Creature defender) {
    return attacker.attack(defender);
  }

  private void checkIfMostPowerfullHit(Creature creature, int dmg) {
    if (dmg > mostPowerfulHitDmg) {
      mostPowerfulHitDmg = dmg;
      mostPowerfulHitCreature = creature;
    }
  }

  private void countBodyPartHit(String name) {
    int v = 1;

    if (bodyPartHit.containsKey(name)) {
      v = bodyPartHit.get(name) + 1;
    }

    bodyPartHit.put(name, v);
  }

}
