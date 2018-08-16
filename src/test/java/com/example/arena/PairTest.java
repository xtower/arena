package com.example.arena;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class PairTest {

  private Pair<?>[] preparePairs(){
    //Given
    Pair<Creature>[] ret = new Pair[3];

    CreatureNameGenerator cng = new CreatureNameGenerator();

    Creature c1 = new Human(1,2,2,2,2,2,2,2,cng.getRandomName());
    Creature c2 = new Troll(1,2,2,2,2,2,2,2,cng.getRandomName());

    ret[0] = new Pair<>(
        new Human(1,2,2,2,2,2,2,2,cng.getRandomName()),
        new Troll(1,2,2,2,2,2,2,2,cng.getRandomName())
    );

    ret[1] = new Pair(c1,c2);
    ret[2] = new Pair(c2,c1);


    return ret;

  }

  @Test
  public void equals() throws Exception {
    //Given
    Pair<?>[] testPairs = preparePairs();

    //When

    //Then
    assertFalse("Pair of different objects but with same properties should not be qeual but is",testPairs[0].equals(testPairs[1]));
    assertFalse("Pair of different objects but with same properties should not be qeual but is",testPairs[1].equals(testPairs[0]));

    assertTrue("Pair of same objects in different order is should be equal but is not",testPairs[1].equals(testPairs[2]));
    assertTrue("Pair of same objects in different order is should be equal but is not",testPairs[2].equals(testPairs[1]));
  }

  @Test
  public void hashCode_method() throws Exception {
    //Given
    Pair<?>[] testPairs = preparePairs();

    //When

    //Then
    assertFalse(testPairs[0].hashCode() == testPairs[1].hashCode());
    assertFalse(testPairs[0].hashCode() == testPairs[2].hashCode());
    assertTrue(testPairs[1].hashCode() == testPairs[2].hashCode());

  }


}