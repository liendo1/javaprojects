package com.example.helloworld.hfst1_excercises;

import java.util.Scanner;

public class DontForgetToStroreIt {
    public static void main(String[] args){
        int meaningOfLifeAndEverything = 42;
        double pi =  3.14159;
        String cheese, color;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Give me pi to at least 5 decimals");
        Double.parseDouble(inputReader.nextLine());

        //we have used double.parseDouble but meaningof life and everything is an INT
        //so we will have to use integer.parseINT

        System.out.println("what is the meaning of life, the universe and evertthing ?");
        Integer.parseInt(inputReader.nextLine());

        System.out.println("what is your favorite kind of cheese?");
        inputReader.nextLine();

        System.out.println("Do you like the color red or blue more? ");
        inputReader.nextLine();

        //System.out.println("ooh, " + color + " " + cheese + " sounds delicious!");
        //System.out.println("The circumference of life is " + (2 * pi * meaningOfLifeAndEverything));


    }
}
