package com.coding;

public class pattern01{
    static  void pattern001(int n){
        int i; int j;
        for (i = 0; i<n; i++){
            for (j = 0; j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        int n = 4;
        pattern001(n);
    }
}


