package com.codedifferently.labs.partB.ex02;

public class LoopPrintExample { //creates parent class
    public static String loops() { //creates loops method class
        String response = ""; //creates empty response string
        int i = 0; //integer i equals 0
        while (i < 5) { //while i is less than 5
            System.out.println("My name is non ya bidness!"); //print this
            i++; //increase i by 1
        } //close while loop
        return response; //return response

    } //ends loops method class
    public static void main(String[] args) { //creates main class
        String loop = loops(); //creates string equal to loops output
        System.out.print(loop); //prints string
    } //closes main class
} //closes parent class
