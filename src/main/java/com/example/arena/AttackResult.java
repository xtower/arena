package com.example.arena;

import jdk.nashorn.internal.objects.annotations.Constructor;

import java.util.Optional;

public class AttackResult {

  private Optional<BodyPart> bodyPart;
  private int potentialDamage;
  private int whichAttack;
  private int actualDamage;

  /**
   *
   * @param bodyPart
   * @param damage
   * @param whichAttack
   */
  public AttackResult(Optional<BodyPart> bodyPart, int damage, int whichAttack) {
    this.bodyPart = bodyPart;
    this.potentialDamage = damage;
    this.whichAttack = whichAttack;
  }

  public Optional<BodyPart> getBodyPart() {
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
