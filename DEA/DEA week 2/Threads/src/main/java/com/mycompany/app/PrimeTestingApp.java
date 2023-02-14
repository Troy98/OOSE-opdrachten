package com.mycompany.app;
import org.apache.commons.math3.primes.Primes;


public class PrimeTestingApp {

    private static final int HIGHEST_NUMBER_TO_TEST = 2000;

    public static void main(String[] args) {
        var app = new PrimeTestingApp();
        app.startTesting();
    }

    private void startTesting() {
        var numberUnderTest = new NumberUnderTest();

        var tester = new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST);
        var tester2 = new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST);
        var tester3 = new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST);
        var tester4 = new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST);

//        tester.startTesting();
//

        //make threads

        //start threads

        //wait for threads to finish

        //print results

//        try{
//            tester.startTesting();
//            tester2.startTesting();
//            tester3.startTesting();
//            tester4.startTesting();
//        } catch (OuchIFoundThirtySevenAndHenceMustDieException e) {
//            System.out.println("13 found Thirty Seven and must die.");
//        }

        var thread1 = new Thread(tester);
        var thread2 = new Thread(tester2);
        var thread3 = new Thread(tester3);
        var thread4 = new Thread(tester4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }


}
