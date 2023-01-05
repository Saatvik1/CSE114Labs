package com.company.Lab21P2;

public class Lab21P2 {

    public static void main(String[] args) {

        MyInteger a = new MyInteger(2);
        System.out.println(a.isPrime() + " " + a.isEven() + " " + a.isOdd());

        System.out.println(MyInteger.isEven(a) + " " + MyInteger.isPrime(a) + " " + MyInteger.isOdd(a));

        MyInteger b = new MyInteger(14);
        MyInteger c = new MyInteger(2);

        System.out.println(b.equals(14));
        System.out.println(a.equals(c));

    }
}
