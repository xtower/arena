package com.example.arena;

import jdk.nashorn.internal.objects.annotations.Constructor;

public class AttackResult {

  private BodyPart bodyPart;
  private int damage;
  private int whichAttack;

  /**
   *
   * @param bodyPart
   * @param damage
   * @param whichAttack
   */
  public AttackResult(BodyPart bodyPart, int damage, int whichAttack) {
    this.bodyPart = bodyPart;
    this.damage = damage;
    this.whichAttack = whichAttack;
  }

  public BodyPart getBodyPart() {
    return bodyPart;
  }

  public int getDamage() {
    return damage;
  }

  public int getWhichAttack() {
    return whichAttack;
  }
}
