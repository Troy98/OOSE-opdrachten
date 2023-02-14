package com.example.prime;
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

        Thread thread1 = new Thread(tester);
        Thread thread2 = new Thread(tester2);
        Thread thread3 = new Thread(tester3);
        Thread thread4 = new Thread(tester4);
    }


}
