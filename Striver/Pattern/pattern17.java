package com.coding;

public class pattern17 {
    static  void pattern017(int n){
      for (int i = 0; i<n;i++) {
          for (int j = 0; j<= n-i-1;j++){
              System.out.print("    ");
          }
          char ch = 'A';
          int breck_point = (2*i+1)/2;
          for (int j =1; j<=2*i+1; j++){
              System.out.print(ch+ " ");
              if (j <= breck_point) ch++;
              else ch--;
          }

          for (int j = 0; j<= n-i-1;j++){
              System.out.print("    ");
          }
          System.out.println();
      }
    }

    public static void main(String[] args){
        int n = 5;
        pattern017(n);
    }
}
