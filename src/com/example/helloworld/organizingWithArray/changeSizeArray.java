package com.example.helloworld.organizingWithArray;

public class changeSizeArray {
    public static void main(String [] args){
        int[] numbers = {3,5,2,1};
        for (int i = 0; i < numbers.length; i++){
            System.out.println("CTR = " + i + " current sum = " + numbers[i]);

        }
        System.out.println("Numbers of item : " + numbers.length);

        numbers = growArray(numbers,5);

        for (int i = 0; i <numbers.length; i ++ ){
            System.out.println("i = " + i + " current value = " + numbers[i]);

        }
        System.out.println("Number of items: " + numbers.length);
    }
    public static int[] growArray(int[] original, int howManyMoreElements){
        int[] newArray = new int[original.length + howManyMoreElements];

        for (int i = 0; i < original.length; i++){
            //copy the element at the current index
            //from original tto new array
            newArray[i] = original[i];
        }
        return newArray;
    }
}
