package com.example.helloworld.ControllingProgramFlow;

public class AboutYou_conditionalOperator {
    public static void main(String[] args){
        int age = 19;
        boolean registered = true;

        // see if a person can vote !
        if (age >= 18 && registered == true){
            System.out.println("You can vote!");
        }
        //see if they are not allowed to vote
        if (age < 18 || registered != true) {
            System.out.println("You not eligible to vote!");
        }
    }
}
