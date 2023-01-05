package com.company.Lab24P2;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab24P2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(30,60,73,89,95));
        System.out.println(toLetterGrade(list));

    }

    public static ArrayList<Character> toLetterGrade(ArrayList<Integer> list){
        ArrayList<Character> gradeList = new ArrayList<Character>();

        for(int i =0; i<list.size(); i++) {
            if(list.get(i)<60)
                gradeList.add('F');
            if(list.get(i)<=69 && list.get(i)>=60)
                gradeList.add('D');
            if(list.get(i)<=79 && list.get(i)>70)
                gradeList.add('C');
            if(list.get(i)<=89 && list.get(i)>80)
                gradeList.add('B');
            if(list.get(i)<=100 && list.get(i)>90)
                gradeList.add('A');

        }

        return gradeList;
    }
}
