class Solution {
    public int maxSubArray(int[] nums) {
        int currs=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currs=currs+nums[i];
            max=Math.max(max,currs);
            if(currs<0)currs=0;
        }
        return max;
    }
}