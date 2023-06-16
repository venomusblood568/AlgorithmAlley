package com.coding;

public class pattern16 {
    static  void pattern016(int n){
      for (int i = 0; i<n;i++) {
          char ch = (char) ('A' + i);
          for (int j = 0; j<=i;j++){
              System.out.print(ch + " ");
          }
          System.out.println();
      }
    }

    public static void main(String[] args){
        int n = 5;
        pattern016(n);
    }
}
