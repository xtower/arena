package com.example.arena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class ArenaApplicationThread {

  public static void main(String[] args) {
    CreaturesFactory creaturesFactory = new CreaturesFactory();
    FightService fightService = new FightService();

    List<Creature> creatures = creaturesFactory.randomCreatureList(10);
    Collection<Pair<Creature>> pairs = fightService.getPairs(creatures);

    ExecutorService executor = Executors.newFixedThreadPool(2);

    List<Callable<FightResult>> fights = new ArrayList<>();

    for(Pair<Creature> p : pairs){
      fights.add(new FightThread(p));
    }

    Map<Creature,Integer> results = new HashMap<>();
    try {
      List<Future<FightResult>> futures = executor.invokeAll(fights);


      //List<FightResult> fr = futures.stream().map(x -> x.get()).collect(Collectors.toList());
      for (Future<FightResult> f : futures){
        FightResult r = f.get();
        Integer v = results.get(r.getWinner());
        if(v == null){
          results.put(r.getWinner(),1);
        } else {
          results.put(r.getWinner(),v +1);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    for(Creature c : results.keySet()){
      System.out.println("Creature: " + c + " wygral " + results.get(c) + " razy");
    }

    executor.shutdown();
  }
}
