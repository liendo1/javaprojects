package com.example.helloworld.addingMethods;

public class aMethodWithTwoParameters {
    public static void main(String[] args){
        sayHello("bob","sue");
    }
    public static void sayHello(String a, String b){
        System.out.println("Hello " + a + " and " + b);
    }
}
