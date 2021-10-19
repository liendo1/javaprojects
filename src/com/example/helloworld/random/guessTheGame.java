package com.example.helloworld.random;

import java.util.Random;
import java.util.Scanner;

public class guessTheGame {
    public static void main(String[] args){
        //Declare the number variables and initalize to 0
        int answer = 0;
        int guess = 0;
        Random rng = new Random(); // set up our random range variable

        // declare and initialize a scanner object
        Scanner myScanner = new Scanner(System.in);

        // Generate a random number between 1 and 20
        answer = rng.nextInt(20) + 1;

        // now start getting guesses
        while (true){
            //get a guess
            System.out.println("Please guess a number between 1 and 20: ");
            guess = myScanner.nextInt();

            // does the guess equal the answer?
            if(guess == answer){
                break; // they have solved the problem
            }
            else if (guess < 1 || guess > 20){
                System.out.println("Enter a guess between 1 and 20: ");
                continue;
            }
            if (guess > answer){
                System.out.println("Guess too high pick a lower number");
                continue;
            }
            System.out.println("Guess is too low pick a higher number!");
        }
        System.out.println("You got it the answer was : " + answer);
    }
}
