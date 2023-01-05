package com.company.Lab16P1;
import java.util.Scanner;

public class Lab16P1 {

    public static void main(String[] args) {

            System.out.println("Enter the number of students: ");
            Scanner input1 = new Scanner(System.in);
            int numStudents = input1.nextInt();
            int [] studScores = new int[numStudents];
            System.out.println("Enter the scores: ");


            for(int i = 0; i<numStudents; i++) {
                studScores[i] = input1.nextInt();
            }


            spewGrade(maxScore(studScores), studScores);
    }


    public static int maxScore(int[] studentScores) {
        int maxSco = 0;
        for(int i = 0; i<studentScores.length; i++) {
            if(studentScores[i] >= maxSco) {
               maxSco =  studentScores[i];
            }
        }

        return maxSco;
}

public static void spewGrade (int maxScore, int[] studentScores) {
        for(int i = 0; i<studentScores.length; i++) {
            if(studentScores[i] >= maxScore-10) {
                System.out.println("Student " + (i+1) + " score is " + (studentScores[i]) + " and grade is A");
            } else if(studentScores[i] >= maxScore-20) {
                System.out.println("Student " + (i+1) + " score is " + (studentScores[i]) + " and grade is B");
            } else if(studentScores[i] >= maxScore-30) {
                System.out.println("Student " + (i+1) + " score is " + (studentScores[i]) + " and grade is C");
            } else if(studentScores[i] >= maxScore-40) {
                System.out.println("Student " + (i+1) + " score is " + (studentScores[i]) + " and grade is D");
            } else {
                System.out.println("Student " + (i+1) + " score is " + (studentScores[i]) + " and grade is F");
            }



        }

}

}
