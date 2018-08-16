package com.example.arena;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.example.arena.*")
public class FightServiceTest {

  @Test
  public void getPairs() throws Exception {
    //given
    FightService fightService = new FightService();

    CreaturesFactory creaturesFactory = new CreaturesFactory();

    List<Creature> creatures = creaturesFactory.randomCreatureList(6);


    Collection<Pair<Creature>> pairs;

    //when
    pairs = fightService.getPairs(creatures);

    //then
    assertTrue("Number of combinations is not OK (expected: "
               + pairCombinations(creatures.size(),2)
               + " but is: " + pairs.size(),
               pairCombinations(creatures.size(),2) == pairs.size());

    for(Pair<Creature> p : pairs){
      System.out.println(p);
    }

    System.out.println("Ilosc Stworow: " + creatures.size() + " Ilosc par: " + pairs.size());
  }


  private static int factorial(int number) {
    int result = 1;

    for (int i = 2; i <= number; i++) {
      result *= i;
    }

    System.out.println("Factorial z " + number + " to " + result);
    return result; 
  }

  private static int pairCombinations(int elementCount, int combinationsOf){
    return ((factorial(elementCount)) / (factorial(combinationsOf) * factorial(elementCount - combinationsOf)));
  }

}