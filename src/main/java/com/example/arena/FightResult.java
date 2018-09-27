package com.example.arena;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FightResult {
  private Creature winner;
  private Creature looser;
  @Setter(value = AccessLevel.NONE)
  private String log;

  public void log(String l){
    this.log += l + "/n";
  }

}
