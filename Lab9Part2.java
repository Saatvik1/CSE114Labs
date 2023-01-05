package com.company.Lab9P2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String first = "";
        String city1;

        String second = "";
        String city2;

         String third = "";
         String city3;

        System.out.print("Enter the first city: " );
        Scanner input1 = new Scanner(System.in);
        city1 = input1.nextLine();


        System.out.print("Enter the second city: ");
        Scanner input2 = new Scanner(System.in);
        city2 = input2.nextLine();

        System.out.print("Enter the third city: ");
        Scanner input3 = new Scanner(System.in);
        city3 = input3.nextLine();

        /*
        for(int i=0; i<5; i++) {
            first[i] = city1.charAt(i);
            second[i] = city2.charAt(i);
            third[i] = city3.charAt(i);
        }
        */

        if(city1.compareTo(city2) < 0 && city2.compareTo(city3) <0) {
            first = city1;
            second = city2;
            third = city3;
        }
        else if (city1.compareTo(city2) > 0 && city2.compareTo(city3) >0) {
            first = city3;
            second = city2;
            third = city1;
        } else if(city1.compareTo(city3) > 0 && city1.compareTo(city2) <0) {
            first = city3;
            second = city1;
            third = city2;

        } else if(city1.compareTo(city3) < 0 && city1.compareTo(city2) >0) {
            first = city2;
            second = city1;
            third = city3;
        }
        else if(city1.compareTo(city2) < 0 ) {
            first = city1;
            second = city3;
            third = city2;
        }

        System.out.print(first + " " + second + " " + third);



    }
}
