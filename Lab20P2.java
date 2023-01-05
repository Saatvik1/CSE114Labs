package com.company.Lab20P2;

import java.util.Scanner;

public class Lab20P2 {

    public static void main(String[] args) {

        System.out.println("Enter the values: ");
        Scanner input = new Scanner(System.in);
        LinearEquation o1 = new LinearEquation(input.nextDouble(),input.nextDouble(),input.nextDouble(),
                input.nextDouble(),input.nextDouble(),input.nextDouble());

        if(o1.isSolvable()) {
            System.out.println("X is: " + o1.getX() + " Y is: " + o1.getY());
        } else {
            System.out.println("Not solvable");
        }

    }
}
