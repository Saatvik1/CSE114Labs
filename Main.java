package com.company.Lab20P1;

public class Main {

    public static void main(String[] args) {

        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6,4);
        RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("Areas and perimeters are: " + p1.getArea() + " and " + p1.getPerimeter() + "\n"
                + p2.getArea() + " and " + p2.getPerimeter() + "\n"
                + p3.getArea() + " and " + p3.getPerimeter() + "\n");
    }
}
