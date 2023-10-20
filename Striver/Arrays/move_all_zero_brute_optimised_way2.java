public class move_all_zero_brute_optimised_way2 {
    public static int[] movezeros(int n, int[] a){
        int nonzeroindex = 0;
        for(int i = 0; i <n;i++){
            if (a[i] != 0){
                int temp = a[i];
                a[i] = a[nonzeroindex];
                a[nonzeroindex] = temp;
                nonzeroindex++;
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] arr = {1,0,2,2,3,4,0,0,1,9};
        int n = 10;
        int[] ans = movezeros(n,arr);
        for(int i = 0; i < n; i++ ){
            System.out.print(ans[i] + " ");
        }
        System.out.println(" ");
    }

}
