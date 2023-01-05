package com.company.Lab19P2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a,double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (Math.pow(b, 2.0)) - (4 * a * c);
    }

    public double getRoot1() {
        return (((-b) + (Math.pow(getDiscriminant(), 0.5))) / (2 * a));
    }

    public double getRoot2() {
        return (((-b) - (Math.pow(getDiscriminant(), 0.5))) / (2 * a));
    }

}
