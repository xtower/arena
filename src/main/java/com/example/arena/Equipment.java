package com.example.arena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Equipment {

  private List<ArmourType> itemsList = new ArrayList<>();

  public void add(ArmourType item){
    if(has(item)){
      throw new CantEquipDuplicateItemArenaException();
    }

    itemsList.add(item);
  }

  public boolean has (ArmourType item){
    return itemsList.contains(item);
  }

  public String toString(){
    return itemsList.toString();
  }
}
