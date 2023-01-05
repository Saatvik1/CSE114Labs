package com.company.Lab8P1;

public class Lab8Part1 {

    public static void main(String[] args) {

       int randomNum = (int)(Math.random() * 26);

       String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print(alphabet.charAt(randomNum));


    }
}
