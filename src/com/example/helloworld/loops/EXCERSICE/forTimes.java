package com.example.helloworld.loops.EXCERSICE;

import java.util.Scanner;

public class forTimes {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int number;
        int calculation;
        System.out.print("Which times table shall i recite? ");
        number = myScanner.nextInt();
        for (int i = 1; i <= 15; i++){
            calculation = number * i;
            System.out.println(i + " * " + number + " is: "+ calculation);
        }

    }
}
