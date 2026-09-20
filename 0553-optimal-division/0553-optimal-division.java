class Solution {
    public String optimalDivision(int[] nums) {
    //     if(nums.length==1){
    //         return ""+nums[0];
    //     }
    //      if (nums.length == 2) {
    //         return nums[0] + "/" + nums[1];
    //     }
    //     String res=nums[0]+"/(";
    //     for(int i=1;i<nums.length;i++){
    //         res+=nums[i];
    //         if(i!=nums.length-1){
    //                 res+="/";
    //             }
    //     }
    //     res+=")";
    // return res;
    StringBuffer sb=new StringBuffer();
    sb.append(nums[0]);
    for(int i=1;i<nums.length;i++){
        sb.append("/");
        if(i==1 &&nums.length>2){
            sb.append("(");
        }
        sb.append(nums[i]);
        if(i==nums.length-1&&nums.length>2){
            sb.append(")");
        }
    }
    return sb.toString();
    }
}