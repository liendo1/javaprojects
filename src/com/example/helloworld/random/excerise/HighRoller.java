package com.example.helloworld.random.excerise;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    public static void main(String[] args){

        int sides ;

        Random diceRoller = new Random();

        Scanner myScanner = new Scanner(System.in);
        System.out.print("How many sides does a single die have: ");
        sides = myScanner.nextInt();
        int rollResult = diceRoller.nextInt(sides) + 1;

        System.out.println("TIME TO ROOOOLLLL THE DIE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult % 2 == 0){
            System.out.println("You rolled an even number : " + rollResult);
        }
        else if(rollResult == sides){
            System.out.println("You rolled a critical nice job: ");
        }
    }
}
