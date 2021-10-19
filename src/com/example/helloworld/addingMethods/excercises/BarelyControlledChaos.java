package com.example.helloworld.addingMethods.excercises;

import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args){
        String color = chosenColor(); //call color method here
        String animal = chosenAnimal(); // call animal method here again
        String colorAgain = chosenColor();// call color method again here
        int weight = chosenNumber(5,200) ; // call number method
        //with range between 5 -200
        int distance = chosenNumber(10,20); // call number method
        //with range between 10-20
        int number =chosenNumber(10000,20000) ; //call number method
        //width a range between 10000 - 20000
        int time = chosenNumber(2,6); // call number method
        //with a range between 2 - 6

        System.out.println("Once when i was very small... ");
        System.out.println("I was chased by a " + color + ", " + weight + "lb" + " miniature " + animal + " for over " + distance + " miles !!");
        System.out.println("I had to hide in a field of over " + number + " " + colorAgain + " poppies for nearly " + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, " + "Let me tell you!");

    }
    public static String  chosenColor(){
        Random randomMiser  = new Random();
        String[] colors = new String[] { "Blue","Green", "Yellow", "Red","Black"};
        int randomIndex = randomMiser.nextInt(colors.length);
        String randomColor = colors[randomIndex];
        return randomColor;

    }
    public static String chosenAnimal(){
        Random randomMiser = new Random();
        String[] animals = new String[] {"Tiger", "Lion", "Ape", "Human", "Bird"};
        int randomIndex = randomMiser.nextInt(animals.length);
        String randomAnimal = animals[randomIndex];
        return randomAnimal;

    }
    public static int chosenNumber(int min, int max) {
        Random randomMiser = new Random();
        int number = randomMiser.nextInt((max - min) + 1) + min;
        return number;
    }

}
