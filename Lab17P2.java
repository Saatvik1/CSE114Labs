package com.company.Lab17P2;
import java.util.Scanner;

public class Lab17P2 {

    public static void main(String[] args) {

        System.out.println("Enter a 3x3 matrix or else: ");
        Scanner input = new Scanner(System.in);

        double[][] inputArray = new double[3][3];

        for(int i = 0; i<3; i++) {
            for(int k = 0; k<3; k++) {
                inputArray[i][k] = input.nextDouble();
            }
        }

        if(isMarkovMatrix(inputArray)) {
            System.out.println("It is a Markov Matrix");
        } else {
            System.out.println("It is not a Markov Matrix");
        }
    }

    public static boolean isMarkovMatrix(double [][] inputArray) {
        boolean isItMarMat = false;

        for(int i = 0; i<3; i++) {
            double rowSum = 0;
            for(int k = 0; k<3; k++) {
                if(inputArray[k][i] >= 0) {
                    rowSum += inputArray[k][i];
                } else {
                    return isItMarMat;
                }
            }
            if(rowSum == 1.0) {
                continue;
            } else {
                return isItMarMat;
            }
        }

        return isItMarMat = true;
    }
}
