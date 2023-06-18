package com.coding;

public class pattern07{
    static  void pattern007(int n){
        int i; int j;
        for (i = 0; i<n; i++){
            for (j = 1; j<=n-i-1;j++){
                System.out.print(" ");
            }
            for (j = 1; j<=2*i+1;j++){
                System.out.print("*");
            }
            for (j = 1; j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        pattern007(n);
    }
}
