package com.example.arena;

public enum BodyPart {
  HEAD(5, 3),
  LEFT_ARM(10, 1),
  RIGHT_ARM(10, 1),
  TRUNK(30, 0),
  LEFT_LEG(5, 2),
  RIGHT_LEG(5, 2);

  private int hitProbability;
  private int dmgBonus;

  BodyPart(int hitProbability, int dmgBonus) {
    this.hitProbability = hitProbability;
    this.dmgBonus = dmgBonus;
  }

  public int getHitProbability() {
    return this.hitProbability;
  }

  public int getDmgBonus() {
    return this.dmgBonus;
  }
}
