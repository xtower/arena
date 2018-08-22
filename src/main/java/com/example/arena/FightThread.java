package com.example.arena;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FightThread implements Callable<FightResult> {
  Pair<Creature> originalPair;
  Pair<Creature> duplicatePair;

  FightThread(Pair<Creature> p){
    this.originalPair = p;

    Pair<Creature> duplicatePair = new Pair<>(this.originalPair.getLeft().duplicate(),this.originalPair.getRight().duplicate());
  }

  public FightResult call() throws  InterruptedException{
    FightService fs = new FightService();
    FightResult fr = new FightResult();

    fr.log("Startuje walka");
    fr.log(originalPair.getLeft().toString());
    fr.log("va.");
    fr.log(originalPair.getRight().toString());

    int round = 0;

    while (checkCreaturesAreAlive(duplicatePair)){
      fr.log("Runda : " + round + " atakuje " + duplicatePair.getLeft());
      fs.fight(duplicatePair.getLeft(),duplicatePair.getRight());
      if(checkCreaturesAreAlive(duplicatePair)){
        fr.log("Odpowiedz - atakuje " + duplicatePair.getRight());
        fs.fight(duplicatePair.getRight(),duplicatePair.getLeft());
      }

      round++;
    }

    fr.log("Koniec");
    if(duplicatePair.getLeft().getLifePoints() > 0){

      fr.setWinner(originalPair.getLeft());
      fr.setLooser(originalPair.getRight());
    } else {
      fr.setWinner(originalPair.getLeft());
      fr.setLooser(originalPair.getRight());
    }
    fr.log("Wygral" + fr.getWinner());

    RandomGenerator randomGenerator = new RandomGenerator();
    TimeUnit.MILLISECONDS.sleep(randomGenerator.random(50, 500));
    return fr;
  }

  private boolean checkCreaturesAreAlive(Pair<Creature> pair){
    if(pair.getLeft().getLifePoints() > 0 && pair.getRight().getLifePoints() > 0){
      return true;
    }

    return false;
  }
}
