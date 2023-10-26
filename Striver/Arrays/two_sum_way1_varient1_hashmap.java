import java.util.*;
public class two_sum_way1_varient1_hashmap{
    public static String twosum(int n , int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = arr[i];
            int moreneeded = target - num;
            if (map.containsKey(moreneeded)){
                return "YES";
            }
            map.put(arr[i],i);
        }
        return "NO";
    }
    public static void main(String[] args){
        int n = 5;
        int[] arr = {2,6,5,8,11};
        int target = 14;
        String ans = twosum(n, arr, target);
        System.out.println(" this is the answer for varient 1: "+ ans);
    }
}

