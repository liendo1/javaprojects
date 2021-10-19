package com.example.helloworld.hfst1_excercises;

import java.util.Scanner;

public class miniMadLibs {
    public static void main(String [] args) {
        String noun1, adjective1, noun2,adjective2, pluralNoun1,pluralNoun2,pluralNoun3,verbIfinitive,verbPast;
        int number;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Lets play MAD LIBS!");

        System.out.print("I need a noun: ");
        noun1 = userInput.nextLine();

        System.out.print("Now an adjective: ");
        adjective1 = userInput.nextLine();

        System.out.print("Another noun: ");
        noun2 = userInput.nextLine();

        System.out.print("And a number: ");
        number = userInput.nextInt();

        System.out.print("Another adjective: ");
        adjective2 = userInput.nextLine();

        System.out.print("A plural noun: ");
        pluralNoun1 = userInput.nextLine();

        System.out.print("Another one: ");
        pluralNoun2 = userInput.nextLine();

        System.out.print("One more: ");
        pluralNoun3 = userInput.nextLine();

        System.out.print("A verb (infinitive form): ");
        verbIfinitive = userInput.nextLine();

        System.out.print("Same verb (past principle): ");
        verbPast = userInput.nextLine();

        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1+": the " + adjective1 + "frontier." + "  These are the voyages of the starship " + noun2 + ". it is " + number + "- year mission: to explore strange");
        System.out.println(adjective2 + pluralNoun1 + ", to seek out " + adjective2 + pluralNoun2 + " and " + adjective2 + pluralNoun3 + " to boldly " + verbIfinitive + " where no one has " + verbPast + " before." );



    }
}
