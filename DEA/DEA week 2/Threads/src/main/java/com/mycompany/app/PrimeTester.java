package com.mycompany.app;

import org.apache.commons.math3.primes.Primes;

public class PrimeTester implements Runnable{

    NumberUnderTest numberUnderTest;
    int highestNumberToTest;

    public PrimeTester(NumberUnderTest numberUnderTest, int highestNumberToTest) {
        this.numberUnderTest = numberUnderTest;
        this.highestNumberToTest = highestNumberToTest;
    }

    public void startTesting() throws OuchIFoundThirtySevenAndHenceMustDieException {

        while (true) {

            var number = numberUnderTest.getNumber();

            if (number > highestNumberToTest) {
                break;
            }

            boolean isPrime = Primes.isPrime(number);

            if (number == 37) {
                System.out.println("37 HIT");
                throw new OuchIFoundThirtySevenAndHenceMustDieException("13 found Thirty Seven and must die.");
            }

            if (isPrime) {
                System.out.println(Thread.currentThread().getId() + " found a prime number: " + number);
            }

        }
    }

    @Override
    public void run()  {
        try {
            startTesting();
        } catch (OuchIFoundThirtySevenAndHenceMustDieException e) {
            throw new RuntimeException(e);
//            System.out.println("13 found Thirty Seven and must die.");
        }
    }
}
