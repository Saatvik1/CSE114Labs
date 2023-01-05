package com.company.Lab16P2;
import java.util.Scanner;

public class Lab16P2 {

    public static void main(String[] args) {
        System.out.println("Enter integers between 1 and 100");

        int[] valHold = new int[100];
        enterArray(valHold);
        occurCheck(valHold);
    }

    public static int[] enterArray(int[] valHold) {
        int check = 1;
        int i = 0;
        Scanner input = new Scanner(System.in);
        while(check != 0) {
            valHold[i] = input.nextInt();
            i++;
            check = valHold[i-1];
        }
        return valHold;
    }

    public static void occurCheck(int[] valHold) {
        int[] countCheck = new int[100];

        for(int i = 0; i<valHold.length; i++) {
            boolean checkB = true;
            int numCheck = valHold[i];
            int count = 0;

            for (int k = 0; k < 100; k++) {
                if (valHold[k] == numCheck) {
                    count++;
                }
            }

                if(count > 1) {
                    countCheck[i] = numCheck;
                }

                for(int j = 0; j<i; j++) {
                    if(countCheck[j] == numCheck) {
                        checkB = false;
                        break;
                    }

                }

            if(checkB) {
                System.out.println(numCheck + " occurs " + count + " times.");
            }
        }
    }
}






