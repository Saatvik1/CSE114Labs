package com.company.Lab17P1;
import java.util.Scanner;

public class Lab17P1 {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns in the Array: ");
        Scanner input1 = new Scanner(System.in);
        int numRow = input1.nextInt();
        int numColumn = input1.nextInt();

        double[][] inputArray = new double[numRow][numColumn];

        System.out.println("Enter the Array: ");

        userArray(inputArray, numRow, numColumn);

        System.out.println("(" + locateLargest(inputArray)[0] + ", " + locateLargest(inputArray)[1] + ")");

    }

    public static double [] [] userArray(double [][] inputArray, int numRow, int numColumn) {
            Scanner input2 = new Scanner(System.in);

            for(int i = 0; i< numRow; i++ ) {
                for(int k = 0; k< numColumn; k++) {
                    inputArray[i][k] = input2.nextDouble();
                }
            }
        return inputArray;
    }

    public static int[] locateLargest(double[][] inputArray) {
        int [] locationArray = new int[2];
        double maxVal = 0.0;

        for(int i = 0; i<inputArray.length; i++) {
            for(int k = 0; k< inputArray[i].length; k++) {
                if(inputArray[i][k] > maxVal) {
                    maxVal = inputArray[i][k];
                    locationArray[0] = i;
                    locationArray[1] = k;
                }
            }

        }
        return locationArray;
    }
}
