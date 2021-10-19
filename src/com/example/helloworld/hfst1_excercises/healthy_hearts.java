package com.example.helloworld.hfst1_excercises;

import java.util.Scanner;

public class healthy_hearts {
    public static void main(String [] args){
        int age, heartRate, maxRate, targetRate;
        String stringAge;

        Scanner scanner = new Scanner(System.in);



        System.out.print("What is your age? ");
        stringAge = scanner.nextLine();

        age = Integer.parseInt(stringAge);
        maxRate = 220 - age;
        targetRate = maxRate;

        System.out.println("Your maximum heart rate should be " + maxRate + " beats per minute.");
        System.out.println("Your target HR zone is " + (0.5 * targetRate) + " - " + (0.85 * targetRate) + " beats per minute.");

    }
}
