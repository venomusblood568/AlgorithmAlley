package com.coding;

public class pattern09 {
    static  void pattern009(int n){
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
        for (i = 0; i<n; i++){

            for (j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            for( j=0;j< 2*n -(2*i +1);j++){
                System.out.print("*");
            }
            for ( j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        pattern009(n);
    }
}
