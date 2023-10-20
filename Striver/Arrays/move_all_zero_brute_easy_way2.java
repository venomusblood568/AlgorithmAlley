public class move_all_zero_brute_easy_way2 {
    public static void movezero(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i <n; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                if(count != i){
                    arr[i] = 0;
                }
                count++;
            }
        }
    }
    public  static void main(String[] args){
        int[] arr = {1,0,2,3,0,0,1,2,3};
        int n = arr.length;
        movezero(arr);
        for(int i = 0; i <n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
