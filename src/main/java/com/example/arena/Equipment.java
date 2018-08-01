package com.example.arena;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


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

  public Collection<ArmourType> getProtectionItems(BodyPart bodyPart){
    List<ArmourType> armourItems = new ArrayList<>();

    for(ArmourType a : itemsList){
      if(a.isProtecting(bodyPart)){
        armourItems.add(a);
      }
    }

    return armourItems;
  }

  public String toString(){
    return itemsList.toString();
  }
}
