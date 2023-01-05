package com.company.Lab22P1;

public class Triangle extends GeometricObject{
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = ((side1 + side2 + side3) / 2);
        return (Math.pow((s * (s-side1)*(s-side2)*(s-side3)),0.5));
    }

    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle: Side1 = " + side1 + " Side2 = " + side2 + " Side3 = " + side3;
    }

}
