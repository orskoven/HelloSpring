package com.example.springintroduction.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/world")
    public String echoMethode(@RequestParam String input){
        return "Will display a message " + "\"" + input + "\""  + " on screen.";
    }
}
