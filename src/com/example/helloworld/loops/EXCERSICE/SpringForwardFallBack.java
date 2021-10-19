package com.example.helloworld.loops.EXCERSICE;

public class SpringForwardFallBack {
    public static void main(String [] args) {
        System.out.println("It is spring");
        for (int i = 0; i < 10; i++){
            System.out.println(i + ", ");
        }
        System.out.println("Oh no, it is fall...");
        for (int i = 10; i > 0; i--){
            System.out.println(i + ", ");
        }
    }
}
