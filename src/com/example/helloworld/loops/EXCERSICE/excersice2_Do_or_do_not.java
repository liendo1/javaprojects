package com.example.helloworld.loops.EXCERSICE;

import java.util.Scanner;

public class excersice2_Do_or_do_not {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Should i do it? (y/n)");
        boolean doIt;

        if (input.next().equals("y")){
            doIt = true; //Do it
        } else {
            doIt = false; // Do not you dare
        }
        boolean iDidIt = false;
        do {
            iDidIt = true;
            break;
        } while (doIt);
        if (doIt && iDidIt) {
            System.out.println("I did it");
        } else if (!doIt && iDidIt){
            System.out.println("I know you said not to .. but i totally did anyways.");
        } else {
            System.out.println("Do not look at me i did not do anything !");
        }
    }
}
