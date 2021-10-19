package com.example.helloworld.hfst1_excercises;

import java.util.Scanner;

public class passingTheTuringTest {
    public static void main(String [] args){
        String name,color,food;
        int number, myNumber;

        myNumber = -7;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.print("What is your name?");
        name = scanner.nextLine();

        System.out.println("Hi, " + name + "! I am michael");
        System.out.print("what is your favorite color? ");
        color = scanner.nextLine();

        System.out.println("huh " + color + "? MIne is electric lime");

        System.out.println("I really like limes. They are my favorite fruit, too.");
        System.out.print("What is your favorite fruit " + name + "?");
        food = scanner.nextLine();

        System.out.println("Really " + food + "? that is wild!");
        System.out.print("Speaking of favorites, what is your favorite number?");
        number = scanner.nextInt();

        System.out.println(number + " is a cool number, mine is " + myNumber);
        System.out.println("Did you know " + number + " * " + myNumber + " is " + (number * myNumber) + "? That is a cool number too!");
        System.out.println("Well thanks for talkking to me " + name);


    }
}
