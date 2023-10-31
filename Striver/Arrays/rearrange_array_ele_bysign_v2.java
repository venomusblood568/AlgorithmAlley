import java.util.*;
public class rearrange_array_ele_bysign_v2 {
    public static void rearrangeBysign(ArrayList<Integer>A){
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int num : A){
            if(num < 0){
                negative.add(num);
            }
            else{
                positives.add(num);
            }
        }
        int i = 0 , j = 0 , k = 0;
        while(i < positives.size() && j < negative.size()){
            A.set(k++,positives.get(i++));
            A.set(k++,negative.get(j++));
        }
        while(i < positives.size()){
            A.set(k++,positives.get(i++));
        }
        while(j < negative.size()){
            A.set(k++,negative.get(j++));
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,3,-4,5,-6,-2));
        rearrangeBysign(A);
        System.out.println("rearranged Array: " + A);
    }
}
