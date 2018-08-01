package com.example.arena;

import jdk.nashorn.internal.objects.annotations.Constructor;

public class AttackResult {

  private BodyPart bodyPart;
  private int potentialDamage;
  private int whichAttack;
  private int actualDamage;

  /**
   *
   * @param bodyPart
   * @param damage
   * @param whichAttack
   */
  public AttackResult(BodyPart bodyPart, int damage, int whichAttack) {
    this.bodyPart = bodyPart;
    this.potentialDamage = damage;
    this.whichAttack = whichAttack;
  }

  public BodyPart getBodyPart() {
    return bodyPart;
  }

  public int getWhichAttack() {
    return whichAttack;
  }

  public int getPotentialDamage() {
    return potentialDamage;
  }

  public int getActualDamage() {
    return actualDamage;
  }

  public void setActualDamage(int actualDamage) {
    this.actualDamage = actualDamage;
  }
}
