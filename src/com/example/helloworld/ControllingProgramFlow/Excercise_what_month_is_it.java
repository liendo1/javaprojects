package com.example.helloworld.ControllingProgramFlow;

public class Excercise_what_month_is_it {
    public static void main(String [] args){
        int month = 2;
        String monthName = "";

        if (month == 1){
            monthName = "January";
        } else if (month == 2){
            monthName = "February";
        } else if (month == 3) {
            monthName = "Mart";
        }else if (month == 4) {
            monthName = "April";
        }else if (month == 5){
            monthName = "Mei";
        }else if (month == 6) {
            monthName = "Juni";
        }else if (month == 7) {
            monthName = "July";
        }else if (month == 8){
            monthName = "August";
        }else  if (month == 9){
            monthName = "September";
        }else if (month == 10){
            monthName = "Oktober";
        }else if (month == 11){
            monthName = "November";
        }else if (month == 12) {
            monthName = "December";
        } else {
            monthName = "not valid";
        }
        System.out.println("We are in the month :" + monthName);
    }
}
