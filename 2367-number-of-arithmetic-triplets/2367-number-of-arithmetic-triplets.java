class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
    //     int c=0;
    //  for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         for(int k=j+1;k<nums.length;k++){
    //             if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff){
    //                 c++;
    //             }
    //         }
    //     }
    //  }
    //  return c;   
    int n=nums.length;
    int c=0;
    int i=0,j=1,k=2;
    while(i<n-2 && j<n-1 && k<n){
        int d1=nums[j]-nums[i];
        int d2=nums[k]-nums[j];
        if(d1==diff && d2==diff){
            c++;
            i++;
            j++;
            k++;
        }
        else if(d1<diff){
            j++;
        }
        else if(d1>diff){
            i++;
        }
        else if(d2<diff){
            k++;
        }
        else if(d2>diff){
            j++;
        }
    }
    return c;
    }
}