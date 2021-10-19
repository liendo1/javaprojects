package com.example.helloworld.ControllingProgramFlow;

import java.util.Scanner;

public class Excersice6_picky_eater {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("How many times has it been fried? (#) ");
        int timesFried = Integer.parseInt(userInput.nextLine());

        System.out.print("Does it have any spinach in it? (y/n) ");
        String hasSpinach = userInput.nextLine();

        System.out.print("Is it covered in cheese? (Y/N) ");
        String cheeseCovered = userInput.nextLine();

        System.out.print("How many pats of butter are on top? (#) ");
        int butterPats = Integer.parseInt(userInput.nextLine());

        System.out.print("Is it covered in chocolate? (y/n) ");
        String chocolateCovered = userInput.nextLine();

        System.out.print("Does it have a funny name? (y/n) ");
        String funnyName = userInput.nextLine();

        System.out.print("is it broccoly? (y/n) ");
        String isBroccoli = userInput.nextLine();

        // conditionals should go here here is the first one for free

        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            System.out.println("these is not way he will be eating that");
        } else if (timesFried >= 2 && timesFried <= 4 && chocolateCovered.equals("y")){
            System.out.println("Oh it is like a deep fried snickers that will be a hit");
        } else if (timesFried == 2 && cheeseCovered.equals("y")) {
            System.out.println("MMM yeah he will eat fried cheesy doodles");
        } else if (isBroccoli.equals("y") && butterPats >= 6 && cheeseCovered.equals("y")){
            System.out.println("As long as the green is hidden by cheddar it will happen!");
        } else if(isBroccoli.equals("y")){
            System.out.println("Oh green stiff like that might as well go in the bin");
        }
    }
}
