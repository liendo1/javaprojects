package com.example.helloworld.addingMethods;

public class lookAtScope {
    public static void main(String [] args){
        int age = 42;

        for (int i= 0; i < 5; i++){
            //this is pl the nested block can access the variables in the outer block
            System.out.println(age);
        }
        if (age < 18){
            //this is ok the nested block can access the variables
            // in the outer block
            int yearsTowait = 18 - age;
        }
        // not ok outer block can not acces variable sdeclared inside inner block
        //System.out.println(yearsToWait);
    }
}
