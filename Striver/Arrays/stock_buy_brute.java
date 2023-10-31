public class stock_buy_brute {
    static int max_profit(int[] arr){
        int maxprofit = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i +1; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    maxprofit = Math.max(arr[j]-arr[i],maxprofit);
                }
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        int maxprofit = max_profit(arr);

        System.out.println("max profit is: "+ maxprofit);
    }

}
