package com.company.Lab7P2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            double numSides;
            double lenSide;
            double polyArea;

        System.out.print("Enter the number of sides: " );
        Scanner numside = new Scanner(System.in);
        numSides = numside.nextDouble();

        System.out.print("Enter the side: ");
        Scanner lenside = new Scanner(System.in);
        lenSide = lenside.nextDouble();

        polyArea = (numSides * Math.pow(lenSide,2)) / (4 * Math.tan((Math.PI)/numSides));

        System.out.print("The area of the polygon is " + polyArea + ".");


    }
}
