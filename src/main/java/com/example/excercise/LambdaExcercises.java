package com.example.excercise;

import com.example.arena.Creature;
import com.example.arena.CreatureType;
import com.example.arena.CreaturesFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaExcercises {

  public static void main(String[] args) {
    CreaturesFactory creaturesFactory = new CreaturesFactory();
    List<Creature> creatures = creaturesFactory.randomCreatureList(12);

    listAll(creatures);

    System.out.println("\n\n*************");
    listHp(creatures);

    System.out.println("\n\n*************");
    listMaxPoints(creatures);

    System.out.println("\n\n*************");
    Map<CreatureType, List<Creature>> map = getMap(creatures);

    /*for (CreatureType ct : map.keySet()) {
      System.out.println(map.get(ct));
    }*/

    for(Map.Entry<CreatureType,List<Creature>> entry : map.entrySet()){
      System.out.println("TYP: " + entry.getKey());
      System.out.println("Lista: " + entry.getValue() + "\n");
    }
  }

  private static void listAll(List<Creature> list) {
    list.stream()
        .map(Creature::toStringFull)
        .forEach(System.out::println);
  }

  private static void listHp(List<Creature> list) {
    list.stream()
        .sorted((c1, c2) -> Integer.compare(c2.getLifePoints(), c1.getLifePoints()))
        .map(x -> x.toString() + " [" + x.getLifePoints() + "hp]")
        .forEach(System.out::println);
  }

  private static void listMaxPoints(List<Creature> list) {
    List<Creature> sortedList = list.stream()
        .sorted((c1, c2) -> Integer.compare(sumStats(c2), sumStats(c1)))
        //.sorted(Comparator.comparing(LambdaExcercises::sumStats).reversed())
        //.sorted(Comparator.comparing(c -> sumStats(c)).reversed())
        .collect(Collectors.toList());

    Optional<String> s = list.stream()
        .sorted((c1, c2) -> Integer.compare(sumStats(c2), sumStats(c1)))
        //.sorted(Comparator.comparing(LambdaExcercises::sumStats).reversed())
        //.sorted(Comparator.comparing(c -> sumStats(c)).reversed())
        .findFirst()
        .map(Creature::toString);

    System.out.println("Najlepsze staty ma: " + s.orElse("nie ma takiego"));
  }

  private static int sumStats(Creature c) {
    return c.getEndurance()
           + c.getDexterity()
           + c.getInitiative()
           + c.getStrength();
  }

  private static Map<CreatureType, List<Creature>> getMap(List<Creature> list) {

    return list.stream()
        .collect(Collectors.groupingBy(Creature::getCreatureType));
  }


}
