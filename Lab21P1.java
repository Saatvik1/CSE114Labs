package com.company.Lab21P1;

public class Lab21P1 {

    public static void main(String[] args) {
        int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort(m);
        print(m);
    }

    public static void sort(int[][] m){

       /* for(int i = 0; i<m.length; i++){
            for(int k = 0; k<m[i].length-1; k++ ) {
                if(m[i][k] > m[i][k+1]) {
                    int temp = m[i][k];
                    m[i][k] = m[i][k+1];
                    m[i][k+1] = temp;
                }

            }

        } */

        for(int j = 0; j<m.length; j++) {
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i][0] > m[i + 1][0] || ((m[i][0] == m[i + 1][0]) && (m[i][1] > m[i + 1][1]))) {
                    int[] temp = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = temp;
                }

            }
        }





    }


    public static void print(int[][] m ) {
        for(int i = 0; i<m.length; i++){
            for(int k = 0; k<m[i].length; k++ ) {
                System.out.print(m[i][k] + " ");
            }
            System.out.println();
        }
    }
 }
