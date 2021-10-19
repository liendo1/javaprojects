package com.example.helloworld.hfst1_excercises;

import java.util.Scanner;

public class TheAdderProgram {
    public static void main(String[] args) {
        // declare sum and initialize it to 0
        int sum = 0;


        //declare and initiliaze our operands
        int operand1 = 0;
        int operand2 = 0;

        String stringOperand1 = "";
        String stringOperand2 = "";

        // declare a scanner variable for input
        Scanner myScanner = new Scanner(System.in);

        // getting the value from the user
        System.out.println("Please enter the first number to be added: ");

        //read user input
        stringOperand1 = myScanner.nextLine();

        System.out.println("PLease enter the second number to be added:");
        stringOperand2 = myScanner.nextLine();

        // change the string to int
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);

        //assign the sum of opernad1 and operand2 to sum
        sum = operand1 + operand2;

        //NOTE: in the output below the plus (+) operator
        // is acting as the string concatenation operator
        // instead of the addition operator. In JAVA  we use
        // the plus (+) operator to concatenate (or glue otgether)
        //stringf value
        System.out.println("Sum is : " + sum);
    }
}
