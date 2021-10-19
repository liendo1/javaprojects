package com.example.helloworld.hfst1_excercises;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args){
        //Declare the number variables and initialize to 0
        String name = "";
        int age = 0;
        int numComputers = 0;
        String hometown = "";

        //Declare and initiliaxe a scnaner object the scnaneer reads
        //input from the console
        Scanner myScanner = new Scanner(System.in);
        //ask the user to input ehri name
        System.out.println("Please enter your name:");
        name = myScanner.nextLine();

        //ask the user to input their age
        System.out.println("Please enter your age:");
        age = myScanner.nextInt();

        //ask the user to input their number of computers
        System.out.println("PLease enter the number of computers:");
        numComputers = myScanner.nextInt();

        //ask the user to input their hometown
        System.out.println("Please enter your hometown: ");
        hometown = myScanner.nextLine();



        //print the informaion to the console
        System.out.println("HI " + name + " from " + hometown + ".");
        System.out.println("Your age is: " + age);
        System.out.println("Number of computers: " + numComputers);

    }
}
