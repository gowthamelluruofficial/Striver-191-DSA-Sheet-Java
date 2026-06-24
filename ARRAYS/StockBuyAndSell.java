class Solution {
    public int stockBuySell(int[] arr, int n) {
        int max_profit = Integer.MIN_VALUE;
        int min_price = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min_price){
                min_price = arr[i];
            }
            max_profit = Math.max(max_profit,arr[i]-min_price);
        }
        return max_profit;
    }
}
