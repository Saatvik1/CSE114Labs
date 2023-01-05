package com.company.Lab6P1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab6Part2 {

    public static void main(String[] args) {

    double distance;
    double mpg;
    double ppg;
    double totalCost;

        System.out.print("Enter the driving distance: ");
        Scanner drive = new Scanner(System.in);
        distance = drive.nextDouble();

        System.out.print("Enter Miles per gallon: ");
        Scanner miles = new Scanner(System.in);
        mpg = miles.nextDouble();

        System.out.print("Enter price per gallon: ");
        Scanner price = new Scanner(System.in);
        ppg = price.nextDouble();

        totalCost = (distance/mpg) * ppg;

        DecimalFormat tc = new DecimalFormat("###.##");
        System.out.print(String.format("The cost of driving is: " + tc.format(totalCost)));


    }
}
