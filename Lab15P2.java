package com.company.Lab15P2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter 10 digits: ");
        Scanner input = new Scanner(System.in);
        double digitHold[] = new double[10];

        for(int i = 0; i<10; i++) {
            double tempDigit = input.nextDouble();
            digitHold[i] = tempDigit;
        }



        reverse(digitHold);

    }

    public static double[] reverse(double[] x){

        int k = x.length;
        for(int i = 0; i<(x.length/2); i++) {
            double placeHold = x[i];
            //System.out.println(x[k-1] + "wow");
            x[i] = x[k-1];
            x[k-1] = placeHold;
            k-= 1;
            //System.out.println("occur");
        }
        //System.out.println("place");
        for(int i = 0; i<10; i++){
            System.out.print(x[i] + " ");
        }
        return x;
    }
}
