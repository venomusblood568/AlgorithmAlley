package com.coding;

public class pattern12 {
    static  void pattern012(int n){
        int i; int j;
        int space = 2*(n - 1);
        for(i = 1; i <=n; i++){
            for (j = 1; j<= i; j++){
                System.out.print(j);
            }
            for (j = 1; j<= space;j++){
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void main(String[] args){
        int n = 3;
        pattern012(n);
    }
}
