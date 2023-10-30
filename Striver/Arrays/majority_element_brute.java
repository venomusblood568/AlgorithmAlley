//Find the Majority Element that occurs more than N/2 times
//Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.
import java.util.*;
public class majority_element_brute {
    public static int majorityelement(int[]v){
        int n = v.length;
        for(int i = 0; i <n ; i++){
            int count = 0;
            for(int j = 0; j <n; j++){
                if(v[j] == v[i]){
                    count++;
                }
            }
            if(count > (n/2))
                return v[i];
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr = {2,2,1,1,1,2,2};
        int ans = majorityelement(arr);
        System.out.println("The majority element is : " + ans);
    }
}
