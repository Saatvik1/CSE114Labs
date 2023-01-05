package com.company.Lab6P1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int number;
        int num1;
        int num2;
        int remainder;


        System.out.print("Enter a three-digit number: ");
        Scanner inputt = new Scanner(System.in);

        number = inputt.nextInt();

        num1 = (int)number/ 100;
        remainder = number % 100;
        num2 = (int)remainder % 10;

        if(num1 == num2) {
            System.out.print(number + " is a palindrome.");
        } else {
            System.out.print(number + " is not a palindrome.");
        }

    }
}
