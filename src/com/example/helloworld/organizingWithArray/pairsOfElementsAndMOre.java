package com.example.helloworld.organizingWithArray;

public class pairsOfElementsAndMOre {
    public static void main(String[] args){
        int [] numbers = {1,2,3,4,5,6};

        for (int i = 0; i < numbers.length - 2; i += 3){
            System.out.println("Pair: (" + numbers[i] + ", " + numbers[i+1] + ")");
        }
    }
}
