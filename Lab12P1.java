package com.company.Lab12P1;
import java.util.Scanner;

public class Lab12P1 {

    public static void main(String[] args) {

        Character check;

        System.out.println("Enter String: ");
        Scanner input1 = new Scanner(System.in);
        String form = input1.nextLine();

        System.out.println("Enter the character: ");
        Scanner input2 = new Scanner(System.in);
        String characterCheck = input2.nextLine();

        if(characterCheck.length() == 1) {
            check = characterCheck.charAt(0);
            count(form, check);
        } else {
            System.out.println("Invalid input");
        }



    }

    public static int count(String str, char a) {
        int count2 = 0;

        for(int i = str.length(); i> 0; i--) {

            if(str.charAt(i-1) == a) {
                count2 += 1;
            }

        }

        System.out.println(count2);



        return count2 ;
    }





}
