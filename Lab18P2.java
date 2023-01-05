package com.company.Lab18P2;
import java.util.Scanner;

public class Lab18P2 {

    public static void main(String[] args) {

        System.out.println("Enter the matrix row by row: ");
        Scanner input = new Scanner(System.in);
        double[][] userMatrix = new double[4][4];

        for(int i = 0; i<4; i++) {
            for(int j = 0; j<4; j++) {
                userMatrix[i][j] = input.nextDouble();
            }
        }

        System.out.println("The sum is: " + sumMajorDiagonal(userMatrix));
    }

    public static double sumMajorDiagonal(double[][] userMatrix) {
        double majorSum = 0;
        for(int i = userMatrix.length-1; i>=0; i--) {
            majorSum += userMatrix[i][i];
        }


        return majorSum;
    }
}
