package com.example.helloworld.organizingWithArray;

public class ArrayFun {
    public static void main(String[] agrs){
     int ourNumber = 0;
     int[] numbers = new int[] {3,5,2,0};

     System.out.println("Our Numbers: ");
     System.out.println(numbers[0]);
     System.out.println(numbers[1]);
     System.out.println(numbers[2]);
     System.out.println(numbers[3]);
     System.out.println("Our number: " + ourNumber);

     numbers[1] = 9;
     ourNumber = numbers[0];

     System.out.println("Our number now :" );
     System.out.println(numbers[0]);
     System.out.println(numbers[1]);
     System.out.println(numbers[2]);
     System.out.println(numbers[3]);
     System.out.println("Our number: " + ourNumber);
    }
}
