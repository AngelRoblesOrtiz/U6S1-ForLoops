package com.codedifferently.labs.partB.ex03;

public class ArrayLoopExample { //creates parent class

    public static String ArrayLoops() { //creates ArrayLoops method class
        String response = ""; //creates empty response string
        double[] numbers = {1.2, 2.1, 3.4, 4.3}; //creates double array with 4 values
        for(int i = 0; i < numbers.length; i++){ //creates for loop equal to arrays length
            System.out.println(numbers[i]); //prints out the array index equal to i
        } //closes for loop

        return response; //returns response

    } //closes ArrayLoops method class
    public static void main(String[] args) { //creates main class
        String loop = ArrayLoops(); //sets string equal to ArrayLoops method class
        System.out.print(loop); //prints the string
    } //closes main class

} //closes parent class
