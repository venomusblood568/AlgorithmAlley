//dutch national flag algorithum
import java.util.*;
import java.io.*;

public class sorted_an_array_brute1 {
    public static void sort012(int[] arr){
        int a[] = new int[3];
        for(int i = 0; i < arr.length; i++){
            a[arr[i]]++;
        }
        int k = 0;
        for(int i = 0; i <a.length; i++){
            while(a[i]>0){
                arr[k] = i;
                a[i]--;
                k++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,0,1,1,0,2,1,0};
        System.out.println("original array: "+ Arrays.toString(arr));
        sort012(arr);
        System.out.println("sorted array: "+ Arrays.toString(arr));
    }
}
