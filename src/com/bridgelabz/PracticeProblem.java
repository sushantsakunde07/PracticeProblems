//Write a program to reverse the integer number ex. Input N = 231 reverse 132
package com.bridgelabz;

import java.util.Scanner;

public class PracticeProblem {

    public static void main(String[] args) {
        char ch;
        //Scanner class takes input from the user
        Scanner sc = new Scanner(System.in);
        //get input and it is stored ch variable
        System.out.println("Enter any Alphabet: ");
        ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}

