package com.coding;

public class pattern04{
    static  void pattern004(int n){
        int i; int j;
        for (i = 1; i<=n; i++){
            for (j = 1; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 3;
        pattern004(n);
    }
}
