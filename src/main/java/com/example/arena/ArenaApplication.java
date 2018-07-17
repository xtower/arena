package com.example.arena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class ArenaApplication {

	public static void main(String[] args) {
		//Creature kaziu = new Human(1,1,1,1,1, 1, 1,1);

		CreaturesFactory cf = new CreaturesFactory();
		Creature kaziu = cf.generate(CreatureType.ORC);
		System.out.println(kaziu);
	}

	public static boolean dupa(){
		return true;
	}
}
