package com.example.arena.controller;

import com.example.arena.BodyPart;
import com.example.arena.Creature;
import com.example.arena.Orc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FightController {

  @GetMapping("/tourney/info")
  public String info() {
    return "Info";
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
  public String points() {
    return "Punkty";
  }

  @PostMapping("/turney/create")
  public String createTourney() {
    return "Tworze Turniej!";
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
