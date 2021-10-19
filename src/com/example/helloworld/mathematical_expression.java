package com.example.helloworld;

/**
 * Program to show the use of expressions and operators
 * Comment provided throughout to explain what is happening
 */


public class mathematical_expression {
    public static void main(String[] args){
        //declare variables to use in the examplesa
        int result;
        int operand1;
        int operand2;
        int operand3;

        //
        // Assignment
        //
        //Initialize result with the value of 0 by using the
        //assignment (=) operator . The assignment operator takes the
        // value on the right and asigns it to the variables on the
        // left
        result = 0; // now result has the value of 0

        //initialize the operands
        operand1 = 5;
        operand2 = 7;
        operand3 = operand2;

        //addition
        result = 42 + 53; //result is now 95

        // it also works with variables
        result = operand1 + operand2; // results now equal 12

        result = 1 + operand1;// result now equals 6

        result = 1 + operand1 + operand2 + operand3;

        result = 2; // set result to 2
        result +=4; // result is now equal to 6 (2+4)
        result += operand1; // result is now equal to 11 (6 +5 )

        // substraction
        result = 9-5;//result is now 4

        // it also works with variables
        result = operand1 - operand2; // result  now equals -2

        //it works with a combination of literals and variables
        result = 15 - operand1;

        // you can chain substraction operators tohgether
        result = 19 - operand1 - operand2 - operand3;

        result = 2; // set result to 2
        result -= 4; // result is now equal to -2 (2-4)
        result -= operand1; // result is now equal to -7 (-2 -5)

        //you can chain division operators togetjer
        //result now equals 1
        result = 245 / operand1 / operand2 / operand3;

        result = 40;
        result /= 4;// result is now equal to 10 40/4
        result /= operand1; // result is now equal to 2 10/5

        operand1 = 10;
        result = ++operand1; // adds 1 to operand then sets result to 11

        operand1 = 10;
        result = operand1++; //sets result to 10 and then sets operand to 11


    }
}
