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
  public void getDuelPairs() throws Exception {
    //given
    FightService fightService = new FightService();

    CreaturesFactory creaturesFactory = new CreaturesFactory();

    Collection<Creature> creatures = creaturesFactory.randomCreatureList(4);


    Collection<Collection<Creature>> duelPairs;

    //when
    duelPairs = fightService.getDuelPairs(creatures);

    //then
    assertTrue("Number of combinations is not OK (expected: "
               + pairCombinations(creatures.size(),2)
               + " but is: " + duelPairs.size(),
               pairCombinations(creatures.size(),2) == duelPairs.size());

  }


  private static int factorial(int number) {
    int result = 1;

    for (int i = 2; i <= number; i++) {
      result *= i;
    }

    return result; 
  }

  private static int pairCombinations(int elementCount, int combinationsOf){
    return ((factorial(elementCount)) / (factorial(combinationsOf) * (elementCount - combinationsOf)));
  }

}