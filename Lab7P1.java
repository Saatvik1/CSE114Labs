package com.company.Lab7P1;
import java.util.Scanner;

public class Lab7P1 {

    public static void main(String[] args) {

       double radius = 10;
       double x2;
       double y2;

        System.out.print("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        double distance = Math.pow(((Math.pow(x2,2)) + Math.pow(y2,2)),0.5);

        if(distance <= radius) {
            System.out.print("Point (" + x2 + ", " + y2 + ")" + " is in the circle.");
        } else {
            System.out.print("Point (" + x2 + ", " + y2 + ")" + " is not in the circle.");
        }


    }
}
