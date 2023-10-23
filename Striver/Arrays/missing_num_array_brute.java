import java.util.*;
public class missing_num_array_brute{
    public static int missing_number_algo(int[] a, int n){
        //first loop
        for(int i = 1; i <= n ; i++){
            //counter for checking if element exists
            int flag = 0;
            // second loop for using linear search
            for(int j = 0; j < n-1; j++){
                if(a[j] == i){
                    //array found
                    flag = 1;
                    //if found then break out of loop....
                    break;
                }
            }
        //check if the element is missing(ie flag == 0);
        if (flag == 0 ) return i;
        }
        //it is just for avoiding warnings
        return -1;
    }
    public  static void main(String[] args){
        int n = 5;
        int[] a = {1,2,3,5};
        int ans = missing_number_algo(a,n);
        System.out.println(ans);

    }
}
