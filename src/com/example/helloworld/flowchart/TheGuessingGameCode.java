package com.example.helloworld.flowchart;

import java.util.Scanner;

public class TheGuessingGameCode {
    public static void main(String[] args){

    // Declare the number variables and initalize to 0
    int answer = 0;
    int guess = 0;
    //declare and initalize a scanner object
    Scanner myScanner = new Scanner(System.in);

    //ask player 1 to enter a number from 1 to 20
    System.out.println("Player 1: please enter a number between 1 and 20:");
    //now wait unitl anumber is entered
    answer = myScanner.nextInt();
    //note that there should be error checking here
    //now start getting guesses
    while (true){
        //get a guess!
        System.out.println("Please guess a number between 1 and 20: ");
        guess = myScanner.nextInt();

        //does the gues equal the answer
        if (guess == answer){
            break; // they have solved the problem
        }
        else if (guess < 1 || guess > 20){
            System.out.println("Enter a guess between 1 and 20");
            continue;
        }
        if (guess > answer){
            System.out.println("Guess too high pick a lower number");
            continue;
        }
        System.out.println("Guess too low pick a higher number");
    }
    System.out.println("You got it the answer was :" + answer);

    }
}
