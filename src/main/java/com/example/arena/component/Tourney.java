package com.example.arena.component;

import com.example.arena.Creature;
import com.example.arena.domain.TourneyState;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Tourney {
  private TourneyState state = TourneyState.NOTINITIALIZED;
  private int capacity = 0;
  private int points = 0;

  List<Creature> CreatureList = new ArrayList<>();

  public void init(int capacity, int points){
    this.capacity = capacity;
    this.points = points;
    state = TourneyState.CREATED;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getOccupied(){
    return CreatureList.size();
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public boolean canAddCreature(){
    return capacity > getOccupied() ? true : false;
  }
}
