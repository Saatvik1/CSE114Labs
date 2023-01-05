package com.company.Lab13P2;
import java.util.Scanner;

public class Lab13P2 {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        reverse(num);

    }

    public static void reverse(int number) {

        String numbum = "" + number;

        String newnum = "";


        for(int i = numbum.length(); i>0;) {
            i--;
            newnum+=("" + numbum.charAt(i))+"";
        }
        System.out.println(newnum);
    }


}
