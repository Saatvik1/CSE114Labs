package com.company.Lab10P2;
import java.util.Scanner;

public class Lab10Part2 {

    public static void main(String[] args) {

        String Input;

        System.out.print("Enter a SSN: ");
        Scanner userInput = new Scanner(System.in);
        Input = userInput.nextLine();

        /*
       Pattern formatCheck = Pattern.compile("^[0-9]{3}-[0-9]{2}-[0-9]{4}$");
       Matcher wow = formatCheck.matcher(Input);
       boolean check = wow.matches();

       System.out.println(check);
         */

        if (Input.length() == 11) {
           boolean lettercheck = true;

           for (int i = 0; i < 11; i++) {
               char character = Input.charAt(i);
               if (character >= 'A' && character <= 'z') {
                   lettercheck = false;
               }
           }
           if (lettercheck == true) {
               String one = Input.substring(0, 3);
               int a = Integer.valueOf(one);

               String two = Input.substring(4, 5);
               int b = Integer.valueOf(two);

               String three = Input.substring(7, 11);
               int c = Integer.valueOf(three);

               if ((a <= 999 && a >= 0) && (b <= 99 && b >= 0) && (c <= 9999 && c >= 0) && ((int) Input.charAt(3) == 45) && ((int) Input.charAt(6) == 45)) {
                   System.out.println(Input + " is a valid social security number");
               } else {
                   System.out.println(Input + " is not a valid social security number");
               }

           } else {
               System.out.println(Input + " is not a valid social security number");
           }

       } else {
           System.out.println(Input + " is not a valid social security number");
       }
       }
}
