package com.company.Lab11P1;
import java.util.Scanner;
public class Lab13P1 {

    public static void main(String[] args) {
        System.out.println("Enter the number for pattern: ");
        Scanner input1 = new Scanner(System.in);
        int patInt = input1.nextInt();

        displayPattern(patInt);
    }

    public static void displayPattern(int n) {

        int space = n*5;
        int position = 0;
        for(int i = 1; i<=n; i++) {
            for(int k = 0; k< space; k++) {
                System.out.print(" ");
                position = k;
            }
            space -= 5;
            System.out.print(i);

            if(i!=1){
                int num = i;
                for(int m = i; m>1; m--) {

                    for (int j = 0; j <= (3); j++) {
                        System.out.print(" ");
                    }
                    System.out.print(num-1);
                    num-=1;
                }
            }
            System.out.println();

        }


    }


}
