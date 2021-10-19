package com.example.helloworld.hfst1_excercises;

public class BucketsOfFUn {
    public static void  main(String[] args){
        // Declare all the things
        // Usually it is a good idea to declare them at the beginning of the program
        int butterflies, beetles, bugs;

        //now give a couple of them some values
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies");
        System.out.println("but there are " + bugs + " bugs in all :");

        System.out.println("Uh oh my dog ate one");
        butterflies-- ;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can not do math after all");
    }
}
