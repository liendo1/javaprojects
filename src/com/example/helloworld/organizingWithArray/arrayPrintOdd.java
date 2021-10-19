package com.example.helloworld.organizingWithArray;

public class arrayPrintOdd {
    public static void main(String[] args){
        int[] numbers = {3,5,2,1,10,42};
        //start at last index go to first (0)
        for (int ctr = numbers.length - 1; ctr >= 0; ctr--){
            if(ctr %2 ==1){
                System.out.println("index  " + ctr + " - " + numbers[ctr]);
            }
        }
    }
}
