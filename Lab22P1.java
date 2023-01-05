package com.company.Lab22P1;

import java.util.Scanner;

public class Lab22P1 {

    public static void main(String[] args) {

        System.out.println("Enter the sides, color, and if it is filled: ");
        Scanner input = new Scanner(System.in);
        Triangle obj = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.next(),input.nextBoolean());



        System.out.println(obj.toString() + " \n" +
                "color: " + obj.getColor() + "\n" +
               "area: " + obj.getArea() + "\n" +
                "perimeter: " + obj.getPerimeter() + "\n" +
                "filled: " + obj.isFilled());


    }
}
