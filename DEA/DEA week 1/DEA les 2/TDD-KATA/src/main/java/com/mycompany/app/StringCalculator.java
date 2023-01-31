package com.mycompany.app;

public class StringCalculator {

    public int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }

        int sum;

        if(numbers.contains(",")){
            String[] numbersArray = numbers.split(",|\n");
            sum = 0;
            for(String number : numbersArray){
                if(Integer.parseInt(number) < 1000) {
                    sum += Integer.parseInt(number);
                }
            }
        } else {
            sum = Integer.parseInt(numbers);
        }

        return sum;
    }
}
