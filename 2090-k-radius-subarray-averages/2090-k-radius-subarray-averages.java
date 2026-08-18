class Solution {
    public int[] getAverages(int[] nums, int k) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           ans[i]=-1; 
        }
        int avg=2*k+1;
        if(avg>nums.length)return ans;
        long prefix[]=new long[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=k;i+k<nums.length;i++){
           long sum=prefix[i+k+1]-prefix[i-k];
           ans[i]=(int)(sum/avg);
        }
        return ans;
    }
}