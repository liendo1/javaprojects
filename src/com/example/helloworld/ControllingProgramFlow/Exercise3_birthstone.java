package com.example.helloworld.ControllingProgramFlow;

import java.util.Scanner;

public class Exercise3_birthstone {
    public static void main(String[] args) {
        int userGuess;

        Scanner myScanner = new Scanner(System.in);
        System.out.print("What mont's birthdtone do you want to know? ");
        userGuess = myScanner.nextInt();

        if (userGuess == 1){
            System.out.println("January's birthstone is Garnet" );
        } else if (userGuess == 2){
            System.out.println("February's birthstone is Amethyst");
        } else if (userGuess == 3){
            System.out.println("March's birthstone is aguamarine");
        } else if (userGuess == 4){
            System.out.println("April's birtston is Diamond");
        } else  if (userGuess == 5){
            System.out.println("May's birthstone is emerald");
        } else  if (userGuess == 6){
            System.out.println("June's birthstone is pearl");
        } else if (userGuess == 7){
            System.out.println("July birthstone is Ruby");
        } else if (userGuess == 8){
            System.out.println("August birthstone is Peridot");
        } else  if (userGuess == 9){
            System.out.println("September birthstone is sapphiere");
        } else if (userGuess == 10 ){
            System.out.println("October birthstone is opal");
        } else if (userGuess == 11){
            System.out.println("November birthstone is topaz");
        } else if (userGuess == 12){
            System.out.println("December birthstone is Turquoise");
        }else {
            System.out.println("I think you must be confused," + userGuess + " does not match a month.");
        }
    }
}
