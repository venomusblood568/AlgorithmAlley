//Problem Statement
//link = https://www.codingninjas.com/studio/problems/traffic_6682625?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
//The Road Department is planning to make some new traffic regulations.
//But to make the regulations they need to analyze the current situation of the traffic.
//The traffic can be analyzed from an array "VEHICLE' of length 'N', which consists of 'O' if there is no vehicle at that point and '1' if there is a vehicle at the point.
//Unfortunately the array 'VEHICLE' got corrupted as at most 'M''1' got flipped to 'O'.
//Traffic jam is defined as the length of consecutive vehicles on the road.
//The Road Department wants to know the worst possible scenario for the traffic jam. Return the maximum possible length of the consecutive vehicles.
import java.util.*;
public class traffic_sliding_window {
    public static int traffic(int n , int m, int[] vehicle){
        int maxlen = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(right < n){
            sum += vehicle[right];
            if(sum < right - left + 1 -m){
                sum -= vehicle[left];
                left++;
            }
            maxlen = Math.max(maxlen,right-left + 1);
            right++;

        }
        return maxlen;
    }
}
