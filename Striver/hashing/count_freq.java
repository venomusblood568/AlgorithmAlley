//count frequency of each element of the array
public class count_freq {
    public static void main(String args[]){
        int arr[] = { 1,2,2,5,1,2};
        int n = arr.length;
        count_function(arr,n);
    }
    public static void count_function(int arr[],int n){
        boolean visited[] = new boolean[n];
        for (int i = 0; i<n;i++){
            //skip this element if already processes
            if(visited[i] ==true)
                continue;
            //count frequency
            int count = 1;
            for (int j = i+1;j<n;j++){
                if (arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " --"+ count);
        }
    }
}
