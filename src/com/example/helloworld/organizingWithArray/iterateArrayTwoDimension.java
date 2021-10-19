package com.example.helloworld.organizingWithArray;

public class iterateArrayTwoDimension {
    public static void main(String[] args){
        String[] [] words = {{"ONE","TWO","THREE","five","six","seven"},{"RED","WHITE","BLUE"},{"CAT","RABBIT","COW"}};

        System.out.println("Starting..... ");
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words[i].length; j++){
                System.out.println("i = " + i + " j = " + j + " is " + words[i][j]);
            }
            System.out.println("------");
        }
    }
}
