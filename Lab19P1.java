package com.company.Lab19P1;

public class Lab19P1 {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4,40);
        System.out.println("rectangle1 \n" + "Width is: " + rectangle1.width + "\n" +
                "Length is: " + rectangle1.length + "\n" +
                "Area is: " + rectangle1.getArea() + "\n" +
                "Perimeter is: " + rectangle1.getPerimeter() + "\n");

        Rectangle rectangle2 = new Rectangle(3.5, 35.9 );
        System.out.println("rectangle2 \n" + "Width is: " + rectangle2.width + "\n" +
                "Length is: " + rectangle2.length + "\n" +
                "Area is: " + rectangle2.getArea() + "\n" +
                "Perimeter is: " + rectangle2.getPerimeter() + "\n");


    }
}
