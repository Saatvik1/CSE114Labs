package com.company.Lab10P1;

import java.util.Scanner;

public class Lab10Part1 {

    public static void main(String[] args) {
        Boolean check = true;
        String Number ;
        Scanner userInput = new Scanner(System.in);
        Number = userInput.nextLine();

        if(Number.length() == 10) {
            for (int i = 0; i < 10; i++) {
                char character = Number.charAt(i);
                if (!(character >= '0' && character <= '9')) {
                    check = false;
                }
            }


            if (check) {
                String a = Number.substring(0, 3);
                String b = Number.substring(3, 6);
                String c = Number.substring(6, 10);

                System.out.print("(" + a + ")" + b + "-" + c);
            } else {
                System.out.print("Invalid Number");
            }
        } else {
            System.out.print("Invalid Number");
        }

    }
}
