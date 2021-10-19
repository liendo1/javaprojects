package com.example.helloworld.loops.EXCERSICE;

import java.util.Scanner;

public class GuessMeFinally {
    public static void main(String[] args) {
        int numberBegin, numberEnd,number;
        int guess;
        int times;
        //let the user input until it get is right
        //if it is on the first try print wow nice gues that was it otherwisej finally it is about imte you got it
        times = 0;
        numberBegin = 5;
        numberEnd = 10;
        number = 6;
        Scanner myScanner = new Scanner(System.in);


        System.out.println("I have chosen a number between " + numberBegin + " and " + numberEnd + " Betcha can not guess it!");
        do {
            System.out.println("Your guess: ");
            guess = myScanner.nextInt();
            if (guess == number && times == 0) {
                System.out.println("Wow nice guess! that was it !");
            } else if (guess == number && times != 0){
                System.out.println("Finally! it is about time you got it ");
            } else if (guess < number) {
                System.out.println("Ha, nice try - too low! Try again!");
                times++;
            }else {
                System.out.println("Too bad, way too high Try again");
                times++;
            }

        }while (guess != number);




    }
}