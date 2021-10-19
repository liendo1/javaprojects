package com.example.helloworld.debugging;

import com.example.helloworld.hfst1_excercises.MyScanner;

import java.util.Scanner;

public class windowMaster {
    public static void main(String[] args){
        // declare variables for height and width
        float height;
        float width;

        // declare string variables to hold the users height and width input
        String stringHeight;
        String stringWidth;

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // declare and initialize the scanner
        Scanner myScanner = new Scanner(System.in);

        //get input from the user
        System.out.println("Please enter window height: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width: ");
        stringWidth = myScanner.nextLine();

        //convert string values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        // calculate the area of the window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2 * ( height + width);

        //calculate the total cost use a hard coded value for material cost
        cost = ((3.50f * areaOfWindow) + (2.5f * perimeterOfWindow) );

        //display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total cost = " + cost);
    }
}
