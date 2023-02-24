package com.example.javatask6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldController {
  @GetMapping("/hello")
  public String hello() {
    LocalDateTime now = LocalDateTime.now();
    if (3 < now.getHour() && now.getHour() < 12) {
      return "おはようございます！今日も１日がんばろー！";
    } else if (now.getHour() < 16) {
      return "こんにちは！";
    } else {
      return "こんばんは！今日も１日おつかれさまです！";
    }
  }
}



