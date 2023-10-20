public class move_all_zero_brute_way3 {
    public static int[] movezero(int n, int[] arr){
        int count = 0;
        for(int i = 0; i <n; i++){
            if(arr[i] != 0){
                if(count != i){
                    int temp = arr[i];
                    arr[i] = arr[count];
                    arr[count] = temp;
                }
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,0,1,2,3,4,0,0,4,2,5};
        int n = arr.length;

        int[] result = movezero(n,arr);
        for(int i = 0; i<n; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
