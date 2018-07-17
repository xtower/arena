package com.example.arena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class ArenaApplication {

  public static void main(String[] args) {
    //Creature kaziu = new Human(1,1,1,1,1, 1, 1,1);

    CreaturesFactory cf = new CreaturesFactory();
    Creature kazik = cf.generate(CreatureType.ORC);
    System.out.println(kazik);

    Creature mieczyslaw = cf.generateRandom();

    System.out.println(mieczyslaw);
  }

  public static boolean dupa() {
    return true;
  }
}
