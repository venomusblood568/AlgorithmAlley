import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> list, int n, int k) {
        // Write your code here.
        int i =0;
        int j = n-1;
        while(i <= j){
            int mid = (i+(j-i)/2);
            if(list.get(mid) == k)return mid;
            else if(list.get(mid) > list.get(n-1)){
                if(k < list.get(mid) && k >= list.get(i)) j = mid-1;
                else i = mid+1;
            }else{
                if(k > list.get(mid) && k <= list.get(n-1)) i = mid+1;
                else j = mid-1;
            }
        }
        return -1;
    }
}
