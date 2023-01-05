package com.company.Lab23P1;
import java.util.ArrayList;

public class Lab23P1 {

    public static void main(String[] args) {
        //System.out.println(toCharacterArray("Stony Brook"));

        for(int i = 0; i<toCharacterArray("Stony Brook").size(); i++) {
            System.out.print(toCharacterArray("Stony Brook").get(i) + " ");
        }
    }


    public static ArrayList<Character> toCharacterArray(String s){

        ArrayList<Character> charList = new ArrayList<>(s.length());
        for(int i = 0; i<s.length(); i++) {
            charList.add(s.charAt(i));
        }
        return charList;
    }
}
