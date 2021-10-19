package com.example.helloworld.loops.EXCERSICE;

import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {

        // variables
        int number;
        int units;
        int i;
        int buzz;
        int test;
        buzz = 0;

        test = 0;
        // user input
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many units of fizzing and buzzing do you need in your life? ");
        units = userInput.nextInt();
        for(i = 0;test <= units; i++){
            if ((i % 3 == 0) && (i % 5 == 0) && (i > 0)){
                System.out.println("fizz buzz");

                buzz++;
            }else if (i % 3 == 0 && i > 0){
                System.out.println("fizz");
                buzz++;
            }else if (i % 5 == 0 && i > 0){
                System.out.println("buzz");
                buzz++;
            }else if (buzz == units ){
                test = units;
                System.out.println("TRADITION");
                break;
            }else {
                System.out.println(i);
            }
        }




    }
}
