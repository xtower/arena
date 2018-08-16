package com.example.arena;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Optional;


@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.example.arena.*")
public class CreatureTest {

  @Test
  public void dodge() throws Exception {
    CreatureNameGenerator cng = new CreatureNameGenerator();
    Creature c = new Human(3,3,2,3,3,3,3,20,cng.getRandomName());

    //  create mock
    RandomGenerator testRandomGenerator = mock(RandomGenerator.class);
    c.setRandomGenerator(testRandomGenerator);

    int dmg;

    when(testRandomGenerator.random(anyInt(),anyInt())).thenReturn(10);
    dmg = c.dodge(new AttackResult(Optional.of(BodyPart.HEAD), 20, 1));

    assertTrue("Expected dodge is 17 but was : " + dmg, dmg == 17 );

    when(testRandomGenerator.random(anyInt(),anyInt())).thenReturn(1);
    dmg = c.dodge(new AttackResult(Optional.of(BodyPart.HEAD),20, 1));

    assertTrue("Expected dodge is 0 but was : " + dmg, dmg == 0 );
  }

  @Test
  public void testEquipment() {
    CreatureNameGenerator cng = new CreatureNameGenerator();
    Creature c = new Human(3,3,3,3,3,3,3, 30,cng.getRandomName());

    c.equip(ArmourType.GLOVES);

    //PowerMockito.mockStatic(RandomUtil.class);
    //Mockito.when(RandomUtil.random(1,10)).thenReturn(5);
  }

}