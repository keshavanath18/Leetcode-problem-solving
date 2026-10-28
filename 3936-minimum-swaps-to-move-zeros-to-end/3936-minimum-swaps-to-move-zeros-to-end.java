class Solution {
    public int minimumSwaps(int[] nums) {
     int l=0,c=0;
     int r=nums.length-1;
     while(l<r){
        if(nums[l]!=0)l++;
        else if(nums[r]==0)r--;
        else{
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            c++;
            l++;
            r--;
        }
     }
    return c;
    }
}