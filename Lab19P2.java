package com.company.Lab19P2;

import java.util.Scanner;

public class Lab19P2 {

    public static void main(String[] args) {

        System.out.println("Enter a, b and c: ");
        Scanner input = new Scanner(System.in);
        double a,b,c;
        a = input.nextDouble();
        b = input.nextDouble();
        c =  input.nextDouble();

        QuadraticEquation solve = new QuadraticEquation(a,b,c);

        if(solve.getDiscriminant()>0) {
            System.out.println("The equation has two roots: " + solve.getRoot1() + " and " + solve.getRoot2());
        } else if(solve.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + solve.getRoot2());
        } else {
            System.out.println("The equation has no real roots.");
        }


    }
}
