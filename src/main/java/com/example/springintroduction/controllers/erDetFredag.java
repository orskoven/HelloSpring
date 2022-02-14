package com.example.springintroduction.controllers;

import com.fasterxml.jackson.datatype.jsr310.deser.MonthDayDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.YearDeserializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.*;
import java.util.Date;

@RestController
public class erDetFredag {


@GetMapping("/index")
    public static String erDetFredag(){
    Clock clock = Clock.systemDefaultZone();
    String today = clock.instant().toString();

    String[] dateString = today.split("T",2);
    String[] dateString2 = dateString[0].split("-");
    int h = 0;
    int q = Integer.parseInt(dateString2[2]);
    int m = Integer.parseInt(dateString2[1]);
    int j = Integer.parseInt(dateString2[0])/100;
    int k = Integer.parseInt(dateString2[0])%100;
    h = (q+Math.floorDiv(13*(m+1),5)+k+Math.floorDiv(k,4)+Math.floorDiv(j,4)-2*j)%7;
    int d = ((h+5)%7)+1;
    if (d == 1) {
        return "DET ÆææææææÆR FREDAG!";
    } else {
        return "D3T ER IKKE FREDAG!";
    }




    }

}
