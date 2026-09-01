class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[]=new int[prices.length];
        for(int i=0;i<prices.length;i++){
                arr[i]=prices[i];
                int j=i+1;
                while(j<prices.length){
                    if(prices[j]<=prices[i]){
                        arr[i]=prices[i]-prices[j];
                        break;
                    }
                    j++;
                }
        }
        return arr;
    }
}