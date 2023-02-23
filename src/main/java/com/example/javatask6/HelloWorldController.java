package com.example.javatask6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  @GetMapping("/hello")
  public String hello(){
    return "hello world";
  }
}
