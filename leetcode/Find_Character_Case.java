//Problem Statement
//Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
//1, if the character is an uppercase alphabet (A - Z).
//O, if the character is a lowercase alphabet (a - z).
//-1, if the character is not an alphabet.
//Example:
//Input: Character is 'a'
//Output: O
//Explanation: The input character is lowercase, so our answer is 0.
import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char c = sc.next().charAt(0);
      //lower case a-z 
      if(c>=65 && c<= 90)  
       System.out.println(1);
       //upper case A-Z 
       else if(c>=97 && c<=122)
       System.out.println(0);
       //if the input is symbol
       else
       System.out.println(-1);
    }
}
