package com.company.Lab8P1;

public class Lab8Part2 {

    public static void main(String[] args) {

        int randomNum = (int)(Math.random() * 26);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char one = alphabet.charAt(randomNum);
        randomNum = (int)(Math.random() * 26);
        char two = alphabet.charAt(randomNum);
        randomNum = (int)(Math.random() * 26);
        char three = alphabet.charAt(randomNum);

        int nOne = (int)(Math.random() * 9);
        int nTwo = (int)(Math.random() * 9);
        int nThree = (int)(Math.random() * 9);
        int nFour = (int)(Math.random() * 9);

        System.out.print(one+""+two+""+three+""+nOne+""+""+nTwo+""+""+nThree+""+""+nFour);


    }
}
