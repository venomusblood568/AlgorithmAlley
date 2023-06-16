package com.coding;

public class pattern18 {
    static  void pattern018(int n){
      for (int i = 0; i < n ;i++){
          for (char ch = (char) ('C'- i); ch<='C'-n; ch++){
              System.out.print(ch+" ");
          }
          System.out.println();
      }
    }

    public static void main(String[] args){
        int n = 3;
        pattern018(n);
    }
}
