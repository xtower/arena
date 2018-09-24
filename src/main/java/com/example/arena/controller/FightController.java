package com.example.arena.controller;

import com.example.arena.BodyPart;
import com.example.arena.Creature;
import com.example.arena.Orc;
import com.example.arena.component.Tourney;
import com.example.arena.request.CreateTourney;
import com.example.arena.response.Points;
import com.example.arena.response.TourneyInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FightController {
  @Autowired
  Tourney tourney;

  @GetMapping("/tourney/info")
  public TourneyInfo info() {
    TourneyInfo tourneyInfo = new TourneyInfo();
    tourneyInfo.capacity = tourney.getCapacity();
    tourneyInfo.occupied = tourney.getOccupied();
    return tourneyInfo;
  }

  @GetMapping("/tourney/results")
  public String results() {
    return "Results";
  }

  @GetMapping("/tourney/list")
  public String list() {
    return "Lista";
  }

  @GetMapping("/tourney/points")
  public Points points() {
    Points points = new Points();
    points.points = 30;
    return points;
  }

  @PostMapping("/tourney/create")
  public String createTourney(@RequestBody() CreateTourney createTourney) {
    tourney.init(createTourney.capacity,createTourney.points);
    return "Tourney Created!";
  }

  @PostMapping("/tourney/add")
  public String add() {
    return "Zgaszam zawodnika";
  }

  @PostMapping("/tourney/run")
  public String run() {
    return "Zaczynam truniej";
  }


}
