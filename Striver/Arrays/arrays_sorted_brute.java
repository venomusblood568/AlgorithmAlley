public class arrays_sorted_brute {
    static boolean issorted(int arr[],int n){
        for(int i = 0; i<n; i++){
            for(int j = i +1 ; j<n;j++){
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }
    public  static void main(String[] args){
        int n = 7;
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(issorted(arr,n));
    }

}
