package com.example.helloworld.loops;

public class bewareOfTheKraken {
    public static void main(String[] args){
        System.out.println("Get those flippers and wetsuit on we are going diving! ");
        System.out.println("Here we goooooOOOOOoooo.....! *SPLASH*" );

        int depthDivedInFt = 0;

        //Turns out the ocean is only so deep 36200 at the deppest survey
        // so if we reach  the bottom we should probably stop
        while (depthDivedInFt < 36200){
            System.out.println("So far we have swum " + depthDivedInFt + " Feet");
            if (depthDivedInFt >= 20000){
                System.out.println("Uhh i think i see a kragen , guys.....");
                System.out.println("TIME TO GOOOO");
                break;

            }

            //i can swim really fast 500 ft at a time
            depthDivedInFt += 1000;

        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
