class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2)return 0;
        Arrays.sort(nums);
        int diff=0;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            diff=Math.max(diff,nums[j]-nums[i]);
        }
        return diff;
    }
}