package com.codedifferently.labs.partB.ex01;

public class CountingExample { //creates parent class
    public static String counting() { //creates counting method class
        String response = ""; //creates empty response string
        for(int i = 1; i < 6; i++){ //creates for loop that iterates 5 times
           response += i; //adds on i to response
        } //closes for loop
        return response; //returns response

    } //closes counting method
    public static void main(String[] args) { //creates main class
        String count = counting(); //creates string equal to counting output
        System.out.print(count); //prints out the string
    } //closes main class
} //closes parent class
