package com.example.arena;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FightCallable implements Callable<FightResult> {
  Pair<Creature> originalPair;
  Pair<Creature> duplicatePair;

  FightCallable(Pair<Creature> p){
    this.originalPair = p;

    this.duplicatePair = new Pair<>(this.originalPair.getLeft().duplicate(),this.originalPair.getRight().duplicate());
  }

  @Override
  public FightResult call() throws  InterruptedException{
    FightService fs = new FightService();
    FightResult fr = new FightResult();

    fr.log("Startuje walka");
    fr.log(originalPair.getLeft().toString());
    fr.log("vs.");
    fr.log(originalPair.getRight().toString());

    int round = 0;

    while (checkCreaturesAreAlive(duplicatePair)){
      fr.log("Runda : " + round + " atakuje " + duplicatePair.getLeft());
      fr.log("DMG: " + fs.fight(duplicatePair.getLeft(),duplicatePair.getRight()));
      if(checkCreaturesAreAlive(duplicatePair)){
        fr.log("Odpowiedz - atakuje " + duplicatePair.getRight());
        fr.log("DMG: " + fs.fight(duplicatePair.getRight(),duplicatePair.getLeft()));
      }

      round++;
    }

    fr.log("Koniec");
    if(duplicatePair.getLeft().getLifePoints() > 0){

      fr.setWinner(originalPair.getLeft());
      fr.setLooser(originalPair.getRight());
      System.out.println("Wygral" + originalPair.getLeft() + " zycie " + fr.getWinner().getLifePoints() + "/" + duplicatePair.getLeft().getLifePoints());
    } else {
      fr.setWinner(originalPair.getRight());
      fr.setLooser(originalPair.getLeft());
      System.out.println("Wygral" + originalPair.getRight() + " zycie " + fr.getWinner().getLifePoints() + "/" + duplicatePair.getRight().getLifePoints());
    }
    fr.log("Wygral" + fr.getWinner());


    RandomGenerator randomGenerator = new RandomGenerator();
    //TimeUnit.MILLISECONDS.sleep(randomGenerator.random(50, 500));
    return fr;
  }

  private boolean checkCreaturesAreAlive(Pair<Creature> pair){
    if(pair.getLeft().getLifePoints() > 0 && pair.getRight().getLifePoints() > 0){
      return true;
    }

    return false;
  }
}
