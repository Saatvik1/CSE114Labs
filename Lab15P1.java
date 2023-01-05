package com.company.Lab15P1;
import java.util.Scanner;

public class Lab15P1 {

    public static void main(String[] args) {

        System.out.println("Enter 10 values: ");
        Scanner input = new Scanner(System.in);
        double values[] = new double[10];
        for(int i = 0; i<10; i++) {
            double valHolder = input.nextDouble();
            values[i] = valHolder;
        }


        deviation(values);
    }

    public static double mean(double[] x) {
        double calcMean = 0.0;
        double valSum = 0.0;
        for(int i = 0; i<10; i++){
            valSum+= x[i];
        }
        calcMean = valSum/10.0;

        return calcMean;
    }

    public static double deviation(double[] x) {
        double calcDeviation = 0.0;
        double secMean = mean(x);
        double numDev=0.0;
        System.out.println("Mean is " + mean(x));
        for(int i = 0; i<10; i++) {
            numDev += Math.pow((x[i] - secMean),2.0);
        }
        calcDeviation = Math.pow((numDev/9.0), 0.5);
        System.out.println("Deviation is " + calcDeviation);
        return calcDeviation;
    }
}
