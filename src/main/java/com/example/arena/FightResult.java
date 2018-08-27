package com.example.arena;

public class FightResult {
  private Creature winner;
  private Creature looser;
  private String log;

  public Creature getWinner() {
    return winner;
  }

  public void setWinner(Creature winner) {
    this.winner = winner;
  }

  public Creature getLooser() {
    return looser;
  }

  public void setLooser(Creature looser) {
    this.looser = looser;
  }

  public void log(String l){
    this.log += l + "/n";
  }

  public String getLog(){
    return log;
  }
}
