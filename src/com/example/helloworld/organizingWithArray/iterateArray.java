package com.example.helloworld.organizingWithArray;

public class iterateArray {
    public static void main(String[] args){
        int [] numbers = new int[] {3,5,2,0};

        System.out.println("Starting.....");
        for (int ctr= 0; ctr < numbers.length; ctr++){
            System.out.println("ctr = " + ctr + " Numbers = " + numbers[ctr]);
        }
        System.out.println(".....Done!");
    }
}
