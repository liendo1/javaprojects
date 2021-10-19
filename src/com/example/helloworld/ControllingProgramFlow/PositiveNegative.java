package com.example.helloworld.ControllingProgramFlow;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] agrs){

        int number = 0;
        String stringValue = "";

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        stringValue = inputReader.nextLine();
        number = Integer.parseInt(stringValue);

        if (number >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

    }
}
