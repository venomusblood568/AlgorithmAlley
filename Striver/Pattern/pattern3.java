package com.coding;

public class pattern03{
    static  void pattern003(int n){
        int i; int j;
        for (i = 1; i<=n; i++){
            for (j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 3;
        pattern003(n);
    }
}
