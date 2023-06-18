package com.coding;

import java.sql.SQLOutput;

public class pattern10 {
    static  void pattern010(int n){
        int i; int j;

        for (i = 1; i <= 2*n-1;i++){
            int  star = i;
            if(i>  n) star = 2*n-i;
            for (j = 1; j<= star;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        pattern010(n);
    }
}
