import java.util.*;
public class stock_buy_optimised {
    static int maxprofit(int[] arr){
        int maxpro = 0;
        int min_price = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length;i++){
            min_price = Math.min(min_price,arr[i]);
            maxpro = Math.max(maxpro,arr[i] - min_price);
        }
        return maxpro;

    }
    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        int ans = maxprofit(arr);
        System.out.println("max profite is: "+ ans);

    }
}
