package com.example.helloworld.loops;

import java.util.Scanner;

public class do_while_get_number_in_range {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;
        String userNumberString;

        do {
            System.out.println("Please enter a number between 1 and 20: ");
            userNumberString = sc.nextLine();
            userNumber = Integer.parseInt(userNumberString);
        }while (userNumber < 1 || userNumber > 20);
        System.out.println("THank you your number was :" + userNumber);
    }
}
