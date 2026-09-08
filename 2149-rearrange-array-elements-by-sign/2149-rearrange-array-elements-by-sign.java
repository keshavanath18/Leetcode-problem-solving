class Solution {
    public int[] rearrangeArray(int[] nums) {
      int pos[]=new int[nums.length];  
      int neg[]=new int[nums.length];
      int p=0;
      int n=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            pos[p++]=nums[i];
        }else{
            neg[n++]=nums[i];
        }
      } 
      int l=0;
      int r=1;
      for(int i=0;i<p;i++){
        nums[l]=pos[i];
        nums[r]=neg[i];
        l+=2;
        r+=2;
      }
      return nums;
    }
}