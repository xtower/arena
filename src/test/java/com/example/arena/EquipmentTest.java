package com.example.arena;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.example.arena.*")
public class EquipmentTest {

  @Test
  public void add(){
    //given
    Equipment equipment = new Equipment();

    //when
    equipment.add(ArmourType.HELMET);

    //then
    assertTrue("Item is NOT in the equipment after adding it",equipment.has(ArmourType.HELMET) == true);


    //when(equipment.add(ArmourType.HELMET)).thenThrow(new CantEquipDuplicateItemArenaException());
  }
}