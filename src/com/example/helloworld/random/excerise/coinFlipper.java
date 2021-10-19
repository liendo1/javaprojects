package com.example.helloworld.random.excerise;

import java.util.Random;

public class coinFlipper {
    public static void main(String[] args){
        Random randomizer = new Random();

        System.out.println("Ready, Set, Flip....!!");

        boolean face = randomizer.nextBoolean();

        if (face == true){
            System.out.println("You got Tails");
        } else {
            System.out.println("You got face");
        }
    }
}
