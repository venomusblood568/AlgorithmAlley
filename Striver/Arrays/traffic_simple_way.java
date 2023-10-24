//Problem Statement
//link = https://www.codingninjas.com/studio/problems/traffic_6682625?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
//The Road Department is planning to make some new traffic regulations.
//But to make the regulations they need to analyze the current situation of the traffic.
//The traffic can be analyzed from an array "VEHICLE' of length 'N', which consists of 'O' if there is no vehicle at that point and '1' if there is a vehicle at the point.
//Unfortunately the array 'VEHICLE' got corrupted as at most 'M''1' got flipped to 'O'.
//Traffic jam is defined as the length of consecutive vehicles on the road.
//The Road Department wants to know the worst possible scenario for the traffic jam. Return the maximum possible length of the consecutive vehicles.
import java.util.*;
public class traffic_simple_way {
    public static int traffic(int n, int m, int[] vehicle){
        int i = 0;
        int k = 0;

        while( i < n ){
            if (vehicle[i] == 0){
                m--;
            }
            if(m <= -1){
                if (vehicle[k] == 0) {
                    m++;
                }
                k++;
            }
            i++;
        }
        return i-k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vehicle = new int[n];

        for(int i = 0; i < n; i++){
            vehicle[i] = sc.nextInt();
        }
        int result = traffic(n,m,vehicle);
        System.out.println(result);
        sc.close();
    }
}
//input 10 2
//1 1 0 1 1 1 0 1 0 1