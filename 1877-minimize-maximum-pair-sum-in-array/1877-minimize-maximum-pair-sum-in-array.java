class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length/2;i++){
        //     int sum=0;
        //     sum+=nums[i]+nums[nums.length-1-i];
        //     max=Math.max(max,sum);
        // }
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int sum=0;
            sum+=nums[l]+nums[r];
            max=Math.max(max,sum);
            l++;
            r--;
        }
        return max;
    }
}