package com.company.Lab12P2;
import java.util.Scanner;
public class Lab12P2 {

    public static void main(String[] args) {

        System.out.println("Enter i: ");
        Scanner input1 = new Scanner(System.in);
        int count = input1.nextInt();

        summationM(count);

    }

    public static double summationM(int i) {
        double summation = 0.0;
        System.out.println("i" + "         " + "m(i)");

        for(int k = 1; k<= i; k++) {
            double b = k;

            summation += ((b) / (b+1.0)) ;
            System.out.printf(k + "         " + "%2.4f", summation );
            System.out.println();

        }



        return summation;
    }


}
