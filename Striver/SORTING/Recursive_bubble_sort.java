import java.util.*;
public class Recursive_bubble_sort {
    static void bubble_sort(int[] arr, int n){
        //base case
        if (n==1) return;

        // didsawp thing will help if all the number are already sorted then it will be out of the loop
        int didSawp = 0;
        for( int j = 0; j <= n-2; j++){
            if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr [j+1];
                arr[j+1] = temp;
                didSawp = 1;
            }
        }

        if(didSawp == 0) return;
        bubble_sort(arr,n-1);
    }
    public static void main(String[] args){
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("before the bubble sort: ");
        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr,n);
        System.out.println("After bubble sort: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
