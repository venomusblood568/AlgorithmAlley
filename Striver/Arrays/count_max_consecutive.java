import java.util.*;
public class count_max_consecutive {
    static int findmaxconsecutive(int nums[]){
        int count = 0;
        int maximum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else {
                count = 0;
            }
            maximum = Math.max(maximum,count);
        }
        return maximum;
    }
    public static void main (String[] args){
        int nums[] = {1, 1, 0, 1, 1, 1 };
        int ans = findmaxconsecutive(nums);
        System.out.println("the maximum consecutive 1's are: "+ ans);
    }
}
