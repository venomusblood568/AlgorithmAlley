import java.util.Arrays;

public class largest_num_brute {
    public static void main(String [] args){
        int arr1[] ={2,5,1,30,0};
        System.out.println("largest element in the array: " + sort(arr1));
    }
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];

    }
}
