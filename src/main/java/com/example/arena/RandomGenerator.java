package com.example.arena;

import java.util.Random;

public class RandomGenerator {
  private Random random = new Random();

  public int random(int min, int max){
    return min + this.random.nextInt(max + 1 - min);
  }
}
