package edu.iu.inavarre.primesservice.service;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {

    PrimesService primesService = new PrimesService();
    @Test
    void _45IsNotPrime() {
        int n = 45;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected, actual);
    }

    @Test
    void _234521342IsNotPrime(){
        long n = 234521342L;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);

        assertEquals(expected, actual);
    }

    @Test
    void _285191IsPrime(){
        long n = 285191;

        boolean expected = true;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected, actual);
    }
}