package com.example.helloworld.hfst1_excercises;

import java.util.Scanner;

public class quest_for_the_user_input {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        String yourName;
        String yourQuest;
        double velocityOfSwallow;

        //we can use the scanner readline to assign value to our string
        // because it is return type is string
        System.out.print("What is your name?? ");
        yourName = inputReader.nextLine();

        System.out.print("What is your quest?! ");
        yourQuest = inputReader.nextLine();

        // when we get to our double data type we use scanner
        //next double method
        //or we can use the double.parse double to convert nextine string

        System.out.print("what is the airspeed velocity of an unalden swallow?");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " + yourName + "?");
        System.out.println("You did not even know if the swallow was adrican or european");
        System.out.println("Maybe skip answering things about birds and insead go " + yourQuest +".");
        }
    }

