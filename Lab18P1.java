package com.company.Lab18P1;

public class Lab18P1 {

    public static void main(String[] args) {
        int[] countCopy = new int[10];
        System.arraycopy(randomGen100(100),0,countCopy,0,10);
        for(int i =0; i<countCopy.length; i++)
            System.out.println("Number of " + i + "'s is: " + countCopy[i]);
    }

    public static int[] randomGen100(int numGen) {
        int numberGenerated;
        int[] count = new int[10];
        for(int i =0; i<numGen; i++) {
             numberGenerated = (int) (Math.random() * 10);
             count[numberGenerated]++;
        }
        return count;
    }
}
