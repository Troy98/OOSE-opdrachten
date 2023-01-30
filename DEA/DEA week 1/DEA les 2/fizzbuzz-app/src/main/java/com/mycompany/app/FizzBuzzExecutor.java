
package com.mycompany.app;

public class FizzBuzzExecutor {
    private final int maxNumber;
    public FizzBuzzExecutor(){
        this.maxNumber = 100;
    }
    public FizzBuzzExecutor(int maxNumber){
        this.maxNumber = maxNumber;
    }
    public String fizzbuzzGame(int i) {
            if (i % 3 == 0 && i % 5 == 0) {
                return "FizzBuzz";
            } else if (i % 3 == 0) {
                return "Fizz";
            } else if (i % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(i);
            }
    }
    public int getMaxNumber() {
        return maxNumber;
    }
}
