package com.example.helloworld.ControllingProgramFlow;

import java.util.Scanner;

public class excersice4_TriviaNIght {
    public static void main(String[] args){
        int firstQuestion, secondQuestion, thirdQuestion;
        int answerOne , answerTwo, answerThree;
        int totalScore;
        answerOne = 2;
        answerTwo = 4;
        answerThree = 2;
        totalScore = 0;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("It is TRIVIA NIGHT Are you ready? ");
        System.out.println("");
        System.out.println("First question!");
        System.out.println("What is the lowest-level programming language?");
        System.out.print("""
                1) Source code
                2) Assembly language
                3) C#
                4) Machine code
                
                Your answer: """);
        firstQuestion = myScanner.nextInt();
        if (firstQuestion == answerOne){
            totalScore += 1;
        }


        System.out.print("""
                Second question
                Website security CAPTHCA forms are descended from the work of ?
                1) Grace hopper
                2) Alan Turing
                3) CHarles Babbage
                4) Larry Page
                
                Your answer : """);
        secondQuestion = myScanner.nextInt();
        if (secondQuestion == answerTwo) {
            totalScore += 1;
        }

        System.out.print("""
                Last question
                which of these scifi ships was once slated for a full size replica in las vegas?
                1) Serenty
                2) The battlestar galatica
                3) the uss enterprise
                4) the millenium falcon
                
                Your answer: """);
        thirdQuestion = myScanner.nextInt();

        if (thirdQuestion == answerThree){
            totalScore += 1;
        }

        if(totalScore == 0) {
            System.out.println("You did not respond any of the answer correctly");
        }else if (totalScore == 1){
            System.out.println("You did answer one of the question correctly");
        } else if (totalScore == 2){
            System.out.println("You did answer two question correctly");
        }else if (totalScore == 3){
            System.out.println("Hode you are amazing you answer everything right");
        }


    }
}
