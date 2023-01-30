package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup(){
        sut = new FizzBuzzExecutor();
    }
    @Test
    public void executeWithValidIntTest(){

        // Act sut = System Under Test
        String testValue = sut.fizzbuzzGame(37);

        // Assert
        assertEquals("37", testValue);
    }

    @Test
    public void checkIfFunctionReturnsFizz(){

        // Act sut = System Under Test
        String testValue = sut.fizzbuzzGame(3);

        // Assert
        assertEquals("Fizz", testValue);
    }

    @Test
    public void checkIfFunctionReturnsBuzz(){

        String testValue = sut.fizzbuzzGame(5);

        assertEquals("Buzz", testValue);
    }

    @Test
    public void checkIfFunctionReturnsFizzBuzz(){

        String testValue = sut.fizzbuzzGame(15);

        assertEquals("FizzBuzz", testValue);
    }



}
