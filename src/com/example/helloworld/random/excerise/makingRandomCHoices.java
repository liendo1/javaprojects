package com.example.helloworld.random.excerise;

import java.util.Random;

public class makingRandomCHoices {
    public static void main(String[] args){

        //iniziate random
        Random randomizer = new Random();

        System.out.println("I can not decide what animal i like the best.");
        System.out.println("I know Random can decide FOR ME!");

        int x = randomizer.nextInt(6);

        System.out.println("The number we chose was : " + x);

        switch (x){
            case 0:
                System.out.println("Llamas are the best");
                break;
            case 1:
                System.out.println("Dodos are the best");
                break;
            case 2:
                System.out.println("Woolly mammoths are DEFINITELY the best!");
                break;
            case 3:
                System.out.println("Shark are the greatest they have their own week");
                break;
            case 4:
                System.out.println("Cocatoos are just so awesomme!");
                break;
            case 5:
                System.out.println("Have you ever met a naked mole rat they are great");
                break;

        }
        System.out.println("Thanks random maybe you are the best");
    }
}
