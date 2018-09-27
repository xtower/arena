package com.example.arena.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateTourney {
  @JsonProperty(required = true)
  public int capacity;
  public int points;
}
