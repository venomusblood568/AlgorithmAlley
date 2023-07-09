//Optimized approach(Using map):
import java.util.*;
public class highlow_method2 {
    public static void main(String args[]){
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        frequency(arr,n);
    }
    static void frequency(int arr[],int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int maxfreq = 0;
        int minfreq = n;
        int maxele = 0;
        int minele = 0;
        //traverse through map and find the elements
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if(count > maxfreq){
                maxele = element;
                minfreq = count;
            }

            if (count < minfreq) {
                minele = element;
                minfreq = count;
            }
        }
        System.out.println("the highest frequency element is : " + maxele);
        System.out.println("the lowest frequency element is : " + minele);

    }
}
