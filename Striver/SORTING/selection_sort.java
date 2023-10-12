import java.util.*;
public class selection_sort {
    static void algo_part(int arr[],int n){
        for (int i = 0; i < n-1 ; i++){
            int mini = i;
            for (int j = i+1 ; j < n ; j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            //swap module
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        //sorted number will be displayed
        System.out.println("after the selection sort: ");
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }
    public static  void main(String args[]){
        int arr[] ={13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("before the selection sort: ");
        for (int i = 0 ; i < n ; i ++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        algo_part(arr,n);
    }
}
