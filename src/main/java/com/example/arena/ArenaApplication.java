package com.example.arena;

import com.sun.javafx.collections.MappingChange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class ArenaApplication {

  public static void upMap(Map<String, Integer> map, String key) {
    int v;

    if (map.containsKey(key)) {
      v = map.get(key) + 1;
    } else {
      v = 1;
    }

    map.put(key, v);
  }


  public static void main(String[] args) {


    //Creature kaziu = new Human(1,1,1,1,1, 1, 1,1);

    CreaturesFactory cf = new CreaturesFactory();
    Creature kazik = cf.generate(CreatureType.ORC, 0, 0);
    System.out.println(kazik);

    Creature mieczyslaw = cf.generateRandomCreature();

    System.out.println(mieczyslaw);


    /*for(int i =0; i< 20; i++){
      //System.out.println(cf.random(1,4));
      System.out.println(cf.generateRandomCreature());
    }*/

    List<Creature> list = cf.randomCreatureList(5);

    //sposob 1szy
//    System.out.println(list);
//
//    for (int i = 0; i < list.size(); i++) {
//      System.out.println("Postac " + i + ":\n" + list.get(i));
//    }
//
//    Iterator<Creature> iter = list.iterator();
//    while (iter.hasNext()) {
//      System.out.println(iter.next());
//    }
//
//    for (Creature c : list) {
//      System.out.println(c);
//    }

    /*Creature creature1 = list.get(0);
    Creature creature2 = list.get(1);
    int rounds = 12;
    while (rounds > 0) {
      FightService.fight(creature1, creature2);
      if (creature1.isAlive() && creature2.isAlive()) {
        FightService.fight(creature2, creature1);
        if (!(creature1.isAlive() && creature2.isAlive())) {
          break;
        }
      } else {
        break;
      }
      rounds--;
    }

    if (rounds == 0) {
      System.out.println("It's a TIE!");
    } else {
      if (creature1.isAlive()) {
        System.out.println("Creature 1 is the winner!");
      } else {
        System.out.println("Creature 2 is the winner!");
      }
    }

    System.out.println(creature1);
    System.out.println(creature2);
    */

    CreatureNameGenerator cng = new CreatureNameGenerator();
    //Test losowania czesci ciala
    Creature c = new Troll(10, 9, 6, 6, 6, 6, 6, 100, cng.getRandomName());

    Map<String, Integer> results = new HashMap<String, Integer>();

    for (int i = 0; i < 10000; i++) {

        Optional<BodyPart> bp = c.hitWhat();

        if(bp.isPresent()){
          upMap(results, bp.get().toString());
        } else {
          upMap(results, "no hit");
        }

    }

    System.out.println(results);

    //Test nowego FightService

    FightService fs = new FightService();

    Creature creature1 = list.get(0);
    Creature creature2 = list.get(1);

    System.out.println("2 Creatures start to fight:\n" + creature1 + " AND \n" + creature2);

    System.out.println("Fight is to the death or for 10 rounds");
    int round = 1;
    while (round <= 10 && creature1.isAlive() && creature2.isAlive()) {
      System.out.println("Round " + round + " FIGHT!");
      fs.fight(creature1, creature2);
      if (creature1.isAlive() && creature2.isAlive()) {
        System.out.println("Retaliate!");
        fs.fight(creature2, creature1);
      }
      round++;
    }

    System.out.println("THE END");
    System.out.println(
        "CREATURE that dealt the most powerful hit (" + fs.getMostPowerfulHitDmg() + "dmg!!):"
        + fs.getMostPowerfulHitCreature());
    Map<String,Integer> hitMap = fs.getBodyPartHit();
    System.out.println("How many times each body part was hit: " + hitMap);

    String maxKey = getMaxFromMap(hitMap);
    System.out.println("Most hit bodyPart: " + maxKey + " : " + hitMap.get(maxKey));
  }

  private static String getMaxFromMap(Map<String, Integer> map) {
    String maxKey = "none";
    Integer maxInt = 0;

    for (String s : map.keySet()) {
      if (map.get(s) > maxInt) {
        maxKey = s;
        maxInt = map.get(s);
      }
    }

    return maxKey;
  }
}
