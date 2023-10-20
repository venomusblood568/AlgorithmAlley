public class array_sorted_optimised {
    public  static int  issorted(int a[],int n ){
        for(int i = 1; i <n;i++){
            if(a[i] < a[i-1])
                return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5}, n = 5;

        System.out.println(issorted(a, n));
    }
}
