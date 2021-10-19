package com.example.helloworld.hfst1_excercises;

import java.util.Scanner;

public class buildingUsefulProgram  {
    public static void main(String [] args) {
        //Declare variables for height and width
        float height;
        float width;

        //Declare string variables to hold the user's height and
        //width input
        String stringHeight;
        String stringWidth;
        String stringAreaCost;
        String stringPerimeterCost;
        String stringquantity;

        //Declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        float areaCost;
        float perimeterCost;
        float quantity;

        //Declare and initialize the scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from the user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter winodw width:");
        stringWidth = myScanner.nextLine();
        System.out.println("PLease enter the cost per area meter:");
        stringAreaCost = myScanner.nextLine();
        System.out.println("PLease enter the cost per perimeter meter:");
        stringPerimeterCost = myScanner.nextLine();
        System.out.println("How many window do you want to buy:");
        stringquantity = myScanner.nextLine();

        //convert string values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        areaCost = Float.parseFloat(stringAreaCost);
        perimeterCost = Float.parseFloat(stringPerimeterCost);
        quantity = Float.parseFloat(stringquantity);



        //calculate the area of the window
        areaOfWindow = height * width;

        //calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        //calculate the total cost - use a hard coded value
        // for material cost
        cost =quantity * ((areaCost * areaOfWindow) + (perimeterCost * perimeterOfWindow));

        //display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("How many windows will be created = " + stringquantity );
        System.out.println("Total Cost = " + cost);

    }
}
