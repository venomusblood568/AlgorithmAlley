//take an array as input from the user. search for a given number x and print the index at which it occurs
// this method is known as linear search!!!
package com.coding;

import java.util.Scanner;

public class follow_the_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        //this loop is input
        for(int i= 0; i<size ; i++){
           number[i] = sc.nextInt();
        }
        System.out.println("enter the element X you want search : ");
        int x = sc.nextInt();
        //this loop is for output
        for(int i = 0; i < number.length; i++){
            if (number[i] == x) {
                System.out.println("x fount at index:" + i );
            }
         }
    }
}
