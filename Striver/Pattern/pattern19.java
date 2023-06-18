package com.coding;

public class pattern19 {
    static  void pattern019(int N){
        int iniS = 0;
        for(int i=0;i< N;i++){

            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }

            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }
            iniS+=2;
            System.out.println();

        }
        iniS = 2*N -2;
        for(int i=1;i<=N;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            iniS-=2;
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        pattern019(n);
    }
}
