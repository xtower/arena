package com.example.arena;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomGenerator {
  private Random random = new Random();

  public int random(int min, int max){
    return min + this.random.nextInt(max + 1 - min);
  }
}
