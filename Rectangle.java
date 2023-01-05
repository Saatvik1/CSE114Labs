package com.company.Lab19P1;


public class Rectangle {

    public double width = 1.0;
    public double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }
}
