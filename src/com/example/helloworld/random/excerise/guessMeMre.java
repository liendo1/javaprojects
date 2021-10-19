package com.example.helloworld.random.excerise;

import java.util.Random;
import java.util.Scanner;

public class guessMeMre {
    public static void main(String[] args){
        // declare the number variables and inizelize to 0
        int answer = 0;
        int guess = 0;
        int max = 100;
        int min = -100;
        int teller = 0;
        Random rng = new Random(); // set up our random range variable

        // declare and initialize a scanner object
        Scanner myScanner = new Scanner(System.in);

        // Generate a random number between -100 and 100
        answer = rng.nextInt((max - min) + 1) + min;

        //now start getting guesses !
        while (true){
            //get a guess
            System.out.println("Please guess a number between -100 and 100: ");
            guess = myScanner.nextInt();
            teller++;
            if (guess == answer){
                break;
            }
            else if (guess < -100 || guess > 100){

                continue;
            }
            if (guess > answer){
                System.out.println("Guess is too high pick a lower number!");

                continue;
            }
            System.out.println("Guess is too low pick a higher number");
        }
        System.out.println("You got it the answer was: " + answer);
        System.out.println("Number of guesses " + teller);
    }
}
