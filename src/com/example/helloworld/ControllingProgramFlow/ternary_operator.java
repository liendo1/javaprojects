package com.example.helloworld.ControllingProgramFlow;

public class ternary_operator {
    public static void main(String[] args){
        int age = 1;
        String result = "";
        result = (age >= 18) ? "You can register" : "You are not old enough to vote";

        System.out.println(result);
    }
}
