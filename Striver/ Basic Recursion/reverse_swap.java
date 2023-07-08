//Reverse a given Array using two Variable
public class reverse_swap {
    public static void main(String args[]){
        int n = 5;
        int arr[] = {1,2,4,5,6};
        rev_array(arr,n);
    }
    //function to reverse array using two Variable
    public static void rev_array(int arr[], int n){
        int l = 0;
        int r = n-1;
        while(l <= r){
          int tmp = arr[l];
          arr[l] = arr[r];
          arr[r] = tmp;
          l++;
          r--;
        }
        printArray(arr,n);
    }
    // fucntion to print array
    public static void printArray(int ans[], int n){
        System.out.print("reversed array:- \n");//don't forget to use print instead of println
        for (int i = 0; i<n ;i++){
            System.out.print(ans[i] + " ");//don't forget to use print instead of println
        }
    }
}
