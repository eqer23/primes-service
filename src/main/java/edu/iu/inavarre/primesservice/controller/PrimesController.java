package edu.iu.inavarre.primesservice.controller;

import edu.iu.inavarre.primesservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
// adding a comment for no reason
public class PrimesController {
    IPrimesService primesService;
    public PrimesController(IPrimesService primesService){
        this.primesService = primesService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n){
        return primesService.isPrime(n);
    }
}
