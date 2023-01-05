package com.company.Lab21P2;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return this.value % 2 != 0;
    }

    public boolean isPrime() {
        for(int i = 3; i<this.value; i++) {
            if(this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger obj) {
        return obj.value % 2 ==0;
    }

    public static boolean isOdd(MyInteger obj) {
    return obj.value % 2 != 0;
    }

    public static boolean isPrime(MyInteger obj) {
        for(int i = 3; i<obj.value; i++) {
            if(obj.value % i == 0) {
                return false;
            }
        }
        return true;
    }


    public boolean equals(int a) {
        return this.value == a;
    }

    public boolean equals(MyInteger obj) {
       return obj.value == this.value;
    }

}
