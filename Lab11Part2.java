package com.company.Lab11P2;
import java.util.Scanner;

public class Lab11Part2 {

    public static void main(String[] args) {

        String inputTaker = "";

        int month;
        int date;
        int year;

        String displayMonth;

        System.out.print("Enter the date in format : MM/DD/YYYY: ");
        Scanner input = new Scanner(System.in);
        inputTaker = input.nextLine();

        if(inputTaker.length() == 10) {
        String monthS = inputTaker.substring(0,2);
        String dateS = inputTaker.substring(3,5);
        String yearS = inputTaker.substring(6);
        boolean monthCheck = Character.isDigit(monthS.charAt(0)) && Character.isDigit(monthS.charAt(1));
        boolean dateCheck = Character.isDigit((dateS.charAt(0))) && Character.isDigit(dateS.charAt(1));
        boolean yearCheck = Character.isDigit(yearS.charAt(0)) && Character.isDigit(yearS.charAt(1)) && Character.isDigit(yearS.charAt(2)) && Character.isDigit(yearS.charAt(3));

           if (yearCheck && dateCheck && monthCheck) {
               month = Integer.parseInt(monthS);
               date = Integer.parseInt(dateS);
               year = Integer.parseInt(yearS);

               switch (month) {
                   case (1):
                       displayMonth = "January";
                       break;
                   case (2):
                       displayMonth = "February";
                       break;
                   case (3):
                       displayMonth = "March";
                       break;
                   case (4):
                       displayMonth = "April";
                       break;
                   case (5):
                       displayMonth = "May";
                       break;
                   case (6):
                       displayMonth = "June";
                       break;
                   case (7):
                       displayMonth = "July";
                       break;
                   case (8):
                       displayMonth = "August";
                       break;
                   case (9):
                       displayMonth = "September";
                       break;
                   case (10):
                       displayMonth = "October";
                       break;
                   case (11):
                       displayMonth = "November";
                       break;
                   case (12):
                       displayMonth = "December";
                       break;
                   default:
                       displayMonth = "Invalid";
               }
               if ((month < 0 || month > 12) || (date > 32)) {
                   System.out.println("Invalid");
               } else {
                   System.out.println(displayMonth + " " + date + ", " + year);
               }
           } else {
               System.out.println("Invalid");
           }
       } else {
           System.out.println("Invalid");
       }






    }
}
