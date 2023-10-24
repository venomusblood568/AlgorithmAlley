import java.util.*;
public class find_one_sec_twice_way2 {
    public static int getstringelement(int[] arr){
        int n = arr.length;
        int maximum = arr[0];
        for(int i = 0; i <n;i++){
            maximum = Math.max(maximum,arr[i]);
        }
        int[] hash = new int[maximum +1];
        for(int i = 0; i <n; i++){
            hash[arr[i]]++;
        }
        for(int i = 0; i <n ; i++){
            if(hash[arr[i]] ==1)
                return arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,4,1,2,2};
        int ans = getstringelement(arr);
        System.out.println("the single element is: "+ ans);
    }
}
