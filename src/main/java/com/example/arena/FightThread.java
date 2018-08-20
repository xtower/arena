package com.example.arena;

import java.util.concurrent.Callable;

public class FightThread implements Callable<FightResult> {
  Pair<Creature> pair;

  FightThread(Pair<Creature> p){
    this.pair = p;
  }

  public FightResult call(){
    return null;
  }
}
