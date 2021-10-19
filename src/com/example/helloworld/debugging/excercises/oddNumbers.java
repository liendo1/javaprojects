package com.example.helloworld.debugging.excercises;

public class oddNumbers {
    public static void main(String[] args){
        int counter;

        for (counter = 0; counter < 21; counter = counter + 3){
            System.out.println(counter);
        }
        System.out.println("...Done!");
    }
}
