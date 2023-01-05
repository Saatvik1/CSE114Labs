package com.company.Lab14P1;
import java.util.Scanner;

public class Lab14P1 {

    public static void main(String[] args) {
        System.out.println("Enter the length of the sides: ");
        Scanner input = new Scanner(System.in);
        double sideLength = input.nextDouble();

        Lab14P1.area(sideLength);

    }
    public static double area(double side) {

        double pentArea = ((5.0 * Math.pow(side,2)) / (4.0 * (Math.tan((Math.PI) / 5.0))) );
        System.out.println(pentArea);
        return pentArea;
    }


}

