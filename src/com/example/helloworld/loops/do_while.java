package com.example.helloworld.loops;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userNumberString;
        int userNumber;

    do {
        System.out.println("PLease enter a number between 1 and 20: ");
        userNumberString = sc.nextLine();
        userNumber = Integer.parseInt(userNumberString);
    }while (userNumber <1 || userNumber > 20);

    }
}
