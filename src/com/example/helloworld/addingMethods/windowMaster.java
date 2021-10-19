package com.example.helloworld.addingMethods;

import java.util.Scanner;

public class windowMaster {
    public static void main(String[] args) {
        // declare variables for height and width
        float height;
        float width;

        // declare string variables to hold the user's height and width input
        //String stringHeight;
       // String stringWidth;

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // declare and initialize the scanner
        Scanner myScanner = new Scanner(System.in);

        height = readValue("Please enter window height: ");
        width = readValue("Please enter window width: ");

        //Get input from the user
        //System.out.println("Please enter window height: ");
        //stringHeight = myScanner.nextLine();
       // System.out.println("PLease enter window width: ");
        //stringWidth = myScanner.nextLine();

        //convert string values of height and width to float values
       // height = Float.parseFloat(stringHeight);
        //width = Float.parseFloat(stringWidth);

        //calculate the area of the window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        //calculate the total cost use a hard coded value
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        //display the results to the user
        System.out.println("window height = " + height);
        System.out.println("window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total cost = " + cost);
    }

    public static float readValue(String prompt) {
        // declare and initialize a scanner variable
        Scanner myScanner = new Scanner(System.in);

        //print prompt to console
        System.out.println(prompt);

        //read value into String data type
        String input = myScanner.nextLine();

        //convert the string to a float
        float floatVal = Float.parseFloat(input);

        return floatVal;
    }
}
