package com.example.sayhellospring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class Greetings {


    String name="";

    @GetMapping("{name}")

    public String getHello(@PathVariable String name, @RequestParam String q) {


        return q + " " + name;

    }



    @PostMapping                                // Zum hinzufügen Postman auf Body und dann auf raw ( für rohdaten)
    public String postName(@RequestBody String newName){
        name=newName;
        return "New name equals =" + name;
    }




}


