import java.util.Arrays;

public class second_largest_brute {
    static private void getElement(int[] arr, int n){
        /*
        if (n == 0 || n==1)
        {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        */
        //the above commented code is written in one line ↓
        System.out.println((n==0 ||n==1) ? "-1 -1" : " ");
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n-2];
        System.out.println("second smallest is " + small);
        System.out.println("second largest is "+ large);
    }
    public static void main(String[] args){
        int arr[] = {1,2,4,6,7,5};
        int n = arr.length;
        getElement(arr,n);
    }
}
