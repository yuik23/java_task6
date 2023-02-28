package com.example.javatask6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


@RestController
public class HelloWorldController {
  DateTimeFormatter dtfHm = DateTimeFormatter.ofPattern("HH:mm");
  DateTimeFormatter dtfH = DateTimeFormatter.ofPattern("HH");
  LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

  //時間によって異なる挨拶を表示するメソッド
  private String getGreetingMessage(int hour) {
    if (3 < hour && hour < 12) {
      return "<ただいま日本時刻" + now.format(dtfHm) + ">おはようございます！今日も１日がんばろー！";
    } else if (hour < 16) {
      return "<ただいま日本時刻" + now.format(dtfHm) + ">こんにちは！";
    } else {
      return "<ただいま日本時刻" + now.format(dtfHm) + ">こんばんは！今日も１日おつかれさまです！";
    }
  }

  @GetMapping("/hello")
  public String greeting() {
    int hour = Integer.parseInt(now.format(dtfH));
    return getGreetingMessage(hour);
  }
}



