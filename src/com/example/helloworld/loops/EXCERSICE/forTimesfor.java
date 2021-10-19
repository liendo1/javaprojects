package com.example.helloworld.loops.EXCERSICE;

import java.util.Scanner;

public class forTimesfor {
    public static void main(String[] args){
        //Variables
        int number;
        int calculation;
        int guess;
        int procentage;
        int correct = 0;
        int i;
        // input
        Scanner myScanner = new Scanner(System.in);



        System.out.print("Which times table shall i recite? ");
        number = myScanner.nextInt();
        for(i = 1; i <= 15; i++) {

            // mathwork
            calculation = i * number;


            System.out.print(i + " * " + number + " is: ");
            guess = myScanner.nextInt();
            if (guess == calculation){
                System.out.println("Correct!");
                correct++;
            }else {
                System.out.println("Sorry no, the answer is : " + calculation);

            }
        if (i == 15){

            System.out.println("You got " + correct + " correct.");
        }
        }

    }
}
