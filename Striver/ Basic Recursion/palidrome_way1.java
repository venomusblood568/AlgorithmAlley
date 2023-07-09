import java.io.*;
import java.util.Arrays;
public class palidrome_way1 {
    static private boolean ispalidrome(String s){
        int left = 0;//check for left part of the string
        int right = s.length()-1;//check for right part of the string and l-1 cause of the lenth of the string
        //to check the string in left = right
        while(left<right){
            // l=left side of the string
            // r = right side of the string
            char l = s.charAt(left) ,r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)) //check if the string is letter or digit
                left++;
            else if (!Character.isLetterOrDigit(r))
                right--;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r)) //if string is in capital make it lower case
                return false;
            //condition for checking the string
            else{
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String args[]){
        // string input can be anything like letter or number
        String str = "11211";
        boolean ans = ispalidrome(str);
        //condition for palidrome
        if(ans== true){
            System.out.println("palidrome");
        }
        else{
            System.out.println("not palidrome");
        }
    }
}
