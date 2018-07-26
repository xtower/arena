package com.example.arena;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.example.arena.*")
public class CreatureTest {

  @Test
  public void dodge() throws Exception {
    Creature c = new Human(3,3,2,3,3,3,3,20);

    //  create mock
    RandomGenerator testRandomGenerator = mock(RandomGenerator.class);
    c.setRandomGenerator(testRandomGenerator);

    int dmg;

    when(testRandomGenerator.random(anyInt(),anyInt())).thenReturn(10);
    dmg = c.dodge(6,null);

    assertTrue("Expected dodge is 3 but was : " + dmg, dmg == 3 );

    when(testRandomGenerator.random(anyInt(),anyInt())).thenReturn(1);
    dmg = c.dodge(6,null);

    assertTrue("Expected dodge is 0 but was : " + dmg, dmg == 0 );
  }



}