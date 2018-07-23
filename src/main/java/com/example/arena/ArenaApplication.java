package com.example.arena;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class ArenaApplication {

  public static void upMap(Map<String, Integer> map, String key){
    int v;

    if(map.containsKey(key)) {
      v = map.get(key) + 1;
    } else {
      v = 1;
    }

    map.put(key,v);
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

    Creature c = new Troll(10,9,6,6,6,6,6,100);

    Map<String, Integer> results = new HashMap<String, Integer>();

    for(int i = 0; i<10000; i++) {
      //System.out.print("Tura: " + i + " : ");
      try{
        BodyPart bp = c.hitWhat();
        //System.out.println(bp);
        upMap(results,bp.toString());
      } catch(NullPointerException e){
        //System.out.println("NO HIT!");
        upMap(results,"no hit");
      }
    }

    System.out.println(results);
  }


}
