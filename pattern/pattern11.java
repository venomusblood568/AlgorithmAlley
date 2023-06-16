package com.coding;

public class pattern11 {
    static  void pattern011(int n){
        int i; int j;
        int start = 1;
        for (i = 0; i <n; i++){
            if(i % 2 == 0 ) start = 1;
            else start = 0;
            for ( j = 0; j<=i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        pattern011(n);
    }
}
