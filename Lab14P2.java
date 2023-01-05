package com.company.Lab14P2;

public class Lab14P2 {

    public static void main(String[] args) {
numList(1000);
    }

    public static int numList(int limit) {
        int num = 1;
        int numplus2 = 3;
        int prime1=0;
        int prime2 = 0;
        boolean check = true;
        for(int i = numplus2; i<=limit;i++) {
            //System.out.println("P");
            for(int ko = 1; ko<= num; ko++) {

                if(num % ko == 0 && ko<num && (ko!=1)) {
                    prime1 = 0;
                    check = false;
                   // System.out.print("np");
                }else if((num % ko == 0) && (ko==num)) {
                prime1 = ko;
                }
            }

            for(int ro = 1; ro<=numplus2; ro++) {
                //System.out.println(numplus2);
                if(numplus2 % ro == 0 && ro<numplus2 && (ro!=1)) {
                    prime2 = 0;
                    check = false;
                   // System.out.print("npro" + ro + " ");
                }else if((numplus2 % ro == 0) && (ro==numplus2)) {
                    prime2 = ro;
                }


            }
            if ((prime2!=0 && prime1 !=0) && check ) {
                System.out.println("(" + prime1 + "," + prime2 + ")");
            }
            check = true;
            num++;
            numplus2++;
        }


        return num;

    }

}
