//Write a program for the sum of n natural number ex. Input N = 5 output 1+2+3+4+5
package com.bridgelabz;

import java.util.Scanner;

public class PracticeProblem {

    public static void main(String[] args) {
        //Creating Scanner class for taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = sc.nextInt();
        int i = 1;
        int sum = 0;

        //while loop will execute the condition until it returns true value
        while (i <= number) {
            //adding value of i into the sum variable
            sum = sum + i;
            //incrementing value of i by 1
            i++;
        }
        //Displaying sum of n natural numbers
        System.out.println("Sum of n Natural Numbers is: " + sum);
    }
}



