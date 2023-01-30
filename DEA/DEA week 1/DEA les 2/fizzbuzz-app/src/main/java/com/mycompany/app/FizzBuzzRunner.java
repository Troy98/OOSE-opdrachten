
package com.mycompany.app;
public class FizzBuzzRunner {
    public static void main(String[] args){
        FizzBuzzExecutor fizzbuzz = new FizzBuzzExecutor();
        for (int i = 0; i < fizzbuzz.getMaxNumber(); i++) {
            System.out.println(fizzbuzz.fizzbuzzGame(i));
        }
    }
}
