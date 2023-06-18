package com.coding;

public class pattern06{
    static  void pattern006(int n){
        int i; int j;
        for (i = 1; i<=n; i++){
            for (j = 1; j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 9;
        pattern006(n);
    }
}
