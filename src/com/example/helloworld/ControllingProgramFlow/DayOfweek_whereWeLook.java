package com.example.helloworld.ControllingProgramFlow;

public class DayOfweek_whereWeLook {
    public static void main(String [] args){

        int day = 6;
        String dayName = "";

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = " Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("The day is " + dayName);

        if (dayName.equals("Saturday") || dayName.equals("Sunday")) {
            System.out.println("It is the weekend");
        } else {
            System.out.println("It is a weekday");
        }
    }
}
