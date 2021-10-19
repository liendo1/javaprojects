package com.example.helloworld.loops.EXCERSICE;

import java.util.Scanner;

public class exercise1_BewareOfTheKraken {
    public static void main(String[] args){
        System.out.println("Get those flippers and wet");
        System.out.println("Here we gooooooo! *SPLASH*");

        int depthDivedInFt = 0;
        Scanner user = new Scanner(System.in);
        String answer;
        // Turns out the ocean is only so deep 36200 at the deppest survey,
        // so if we reach the bottom we should probably stop
        while (depthDivedInFt < 36200) {
            System.out.println("So far we have swum " + depthDivedInFt + " feet");

            if (depthDivedInFt >= 20000) {
                System.out.println("Uhh i think i see a kraken guys....");
                System.out.println("TIME TO GO!");
                break;
            }
            // i can swim really fast 500ft at a time
            depthDivedInFt +=1000;
            System.out.println("Do you want to continue ?");
            answer = user.nextLine();
            if (answer.equals("no")){
                break;
            }
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down");
        System.out.println("I bet we can do better next time");
    }
}
