package com.example.helloworld.ControllingProgramFlow;

public class Ecercise5_space_Rustlers {
    public static void main(String[] args){
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if (aliens > spaceships){
            System.out.println("Vroom, vroom lets get going" );
        } else {
            System.out.println("These are are not enough green guys to drive these ships");
        }

        if (cows == spaceships){
            System.out.println("Wow way to plan ahead just enough room for all these walking hamburgers");
        } else if(cows > spaceships){
            System.out.println("Dang it i do not how we are going to fit all these cows in here");
        } else {
            System.out.println("Too many ships not enough cows");
        }
    }
}
