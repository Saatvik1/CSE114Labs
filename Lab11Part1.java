package com.company.Lab11P1;

public class Lab11Part1 {

    public static void main(String[] args) {

        double numerator = 1;
        double denominator = numerator + 2;
        double sum = 0;


        for(int i = 3; i<= 99; i++) {
            sum += (numerator / denominator);
            numerator += 2;
            denominator += 2;
            i++;
        }

        System.out.printf("%3.2f", sum);

    }
}
