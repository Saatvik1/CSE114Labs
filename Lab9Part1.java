package com.company.Lab9P1;

public class Main {

    public static void main(String[] args) {

     int random;
     int sum = 0;
     double avg;
     int[] values;
     values = new int[10];

     for(int i = 0; i<10; i++) {
         random = (int) (Math.random() * 100);
        values[i] = random;
     }
     for (int i=0; i<10; i++) {
         sum = sum + values[i];
     }

     avg = sum / 10.0;
        System.out.print(avg);


    }
}
