package com.company.Lab24P1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab24P1 {

    public static void main(String[] args) {
        System.out.println("Enter 5 numbers: ");
        Scanner input = new Scanner(System.in);
        Integer[] prim = new Integer[5];
        for (int i = 0; i < 5; i++) {
            prim[i] = input.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(prim));
        sort(list);
        System.out.println(list);
    }
    public static void sort(ArrayList<Integer> list){
        for(int i = 0; i<list.size(); i++) {
            for(int j = 0; j<list.size()-1; j++) {
                if(list.get(j) > list.get(j+1)) {
                    Integer temp = (list.get(j));
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
    }
}
