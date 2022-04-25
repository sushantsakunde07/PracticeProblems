//Write a program to reverse the integer number ex. Input N = 231 reverse 132
package com.bridgelabz;

import java.util.Scanner;

public class PracticeProblem {

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        //Creating Scanner class for taking input from the user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;

        //it will run the loop until number becomes 0
        while (number != 0) {
            //it will get the last digit from number
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " +reverse);
    }
}



