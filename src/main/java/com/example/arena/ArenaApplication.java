package com.example.arena;

import java.util.Iterator;
import java.util.List;


public class ArenaApplication {

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

    FightService.fight(list.get(0),list.get(1));
  }


}
