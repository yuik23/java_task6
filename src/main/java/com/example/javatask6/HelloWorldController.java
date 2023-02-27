package com.example.javatask6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


@RestController
public class HelloWorldController {
  @GetMapping("/hello")
  public String hello() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
    //日本時間を取得
    LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

    if (3 < now.getHour() && now.getHour() < 12) {
      return "<ただいま日本時刻" + now.format(dtf) + "> おはようございます！今日も１日がんばろー！";
    } else if (now.getHour() < 16) {
      return "<ただいま日本時刻" + now.format(dtf) + "> こんにちは！";
    } else {
      return "<ただいま日本時刻" + now.format(dtf) + "> こんばんは！今日も１日おつかれさまです！";
    }
  }
}



