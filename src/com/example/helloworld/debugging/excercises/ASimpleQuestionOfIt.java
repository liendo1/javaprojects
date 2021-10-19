package com.example.helloworld.debugging.excercises;

public class ASimpleQuestionOfIt {
    public static void main(String[] args){
        int counter = 10;
        for (int looper =1 ; looper < 10; looper++) {
            if (looper < counter){
                //put a break point on the followeing line
                System.out.println("Counter is less than 10!");
            }else {
                System.out.println("Counter is greater or equal to 10!");
            }
            System.out.println(counter);
        }
    }
}
