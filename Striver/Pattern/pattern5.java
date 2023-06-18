package com.coding;

public class pattern05{
    static  void pattern005(int n){
        int i; int j;
        for (i = 1; i<=n; i++){
            for (j = 1; j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 3;
        pattern005(n);
    }
}
