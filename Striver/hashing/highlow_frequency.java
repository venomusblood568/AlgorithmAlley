//Find the highest/lowest frequency element
//Example 1:
//Input: array[] = {10,5,10,15,10,5};
//Output: 10 15
//Explanation: The frequency of 10 is 3, i.e. the high

//need to get this in my head more clearly

import  java.util.*;
public class highlow_frequency {
    public static void main(String args[]){
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        countfreq(arr,n);
    }
    static void countfreq(int arr[],int n){
        boolean visited[] = new boolean[n];
        int maxfreq = 0, minfreq = n;
        int maxele = 0, minele = 0;
        for (int i = 0; i<n; i++){
            if (visited[i] == true)
                continue;
            int count = 1;
            for(int j= i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count > maxfreq){
                maxele = arr[i];
                maxfreq = count;
            }
            if(count<minfreq){
                minele = arr[i];
                minfreq = count;
            }
        }
        System.out.println("the hightest frequency element is: " + maxele);
        System.out.println("the lowest freqency element is: "+ minele);
    }
}
