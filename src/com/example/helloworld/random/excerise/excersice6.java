package com.example.helloworld.random.excerise;

import java.util.Random;

public class excersice6 {
    public static void main(String[] args){
        //print a random strings each time
        Random randomMiser = new Random();

        String[] phrases = new String[] {"Those aren't the droids you're looking for.","Never go in against a Sicilian when death is on the line!",
                "Goonies never say die.", "With great power, there must also come great responsibility.","Never argue with the data.","Try not. Do, or do not. There is no try.",
                "You are a leaf on the wind, watch how you soar.", "Do absolutely nothing, and it will be everything that you thought it could be.","Kneel before Zod.", "Make it so."};
        int randomIndex = randomMiser.nextInt(phrases.length);
        String randomPhrase = phrases[randomIndex];

        System.out.println("Your Geek Fortune: " + randomPhrase);
    }
}
