import java.util.HashMap;
import java.util.HashSet;

public class duplicate_array_brute {
    public static void main(String[] args){
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeduplicate(arr);
        System.out.println("the array after removing duplicate: ");
        for(int i = 0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int removeduplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length ; i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for(int x: set){
            arr[j++] = x;
        }
        return k;
    }
}
