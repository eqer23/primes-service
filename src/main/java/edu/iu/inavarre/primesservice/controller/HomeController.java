package edu.iu.inavarre.primesservice.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class HomeController {
    @GetMapping
    public String greetings(){
        return "welcome to the primes service!";
    }
}
