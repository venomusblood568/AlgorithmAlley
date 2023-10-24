import java.util.*;

public class find_one_sec_twice_way1 {
    public static int getsingle_elemet(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < n; j++){
                if(arr[j] == num)
                    count++;
            }
            if(count == 1 ) return  num;

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {4,1,2,1,2};
        int ans = getsingle_elemet(arr);
        System.out.println("the single element is: "+ ans);
    }
}
