package com.example.helloworld.addingMethods;

public class methodFunDebugging {
    public static void main(String[] args) {
        int num = 42;
        doIt(num);
        doIt(num);
        doIt(num);

    }
    public static void doIt(int x){
        System.out.println("My number: " + x);
    }
}
