package com.example.helloworld.ControllingProgramFlow;

import java.util.Scanner;

public class excersice2_guess_me {
    public static void main(String[] args){
        int number;
        int guess;

        number = 5;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose a number: ");
        guess = myScanner.nextInt();
        if (guess == number){
            System.out.println("Wow nice guess that was it");
        } else if (guess <= number){
            System.out.println("Ha nice try too loew i chose " + number);
        } else{
            System.out.println("Too bad way too high is choose " + number);
        }
    }
}
