
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        if(sum%3!=0) return false;
        int target=sum/3;
        int curr=0,count=0;
        for(int n:arr){
            curr+=n;
            if(curr==target) {
                count++;
                curr=0;
            }
        }
        return count>=3;
    }
}
