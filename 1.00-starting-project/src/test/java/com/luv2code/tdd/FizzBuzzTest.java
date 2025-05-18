package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // If number is divisible by 3, print Fizz
    // If number is divisible by 5, print Buzz
    // If number is divisible by 3 and 5, print FizzBuzz
    // If number is NOT divisible by 3 or 5, then print the number

    @Test
    @DisplayName("Divisible by Three")
    @Order(1)
    void testForDivisibleByThree(){
    //        fail("fail");
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "should return Fizz");
    }

    // If number is divisible by 5, print Buzz
    @Test
    @DisplayName("Divisible by Five")
    @Order(1)
    void testForDivisibleByFive(){
        //        fail("fail");
        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "should return Buzz");
    }


}
