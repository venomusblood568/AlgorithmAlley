import java.util.*;
import java.util.Scanner;
import java.io.*;
public class all_division {
    public void division(int n){
        for(int i = 1; i<= n ; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        all_division obj = new all_division();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you want to check division for: ");
        int n = sc.nextInt();
        obj.division(n);
    }
}