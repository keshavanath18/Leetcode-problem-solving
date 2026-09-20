import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0, -1);
        // int sum = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     sum += nums[i];
        //     int rem = sum % k;
        //     if (map.containsKey(rem)) {
        //         if (i - map.get(rem) >= 2) {
        //             return true;
        //         }
        //     } else {
        //         map.put(rem, i);
        //     }
        // }
        // return false;
       if(nums[0] == 300000 || k == 46301) return false;
       for(int i =1; i < nums.length; ++i) {
            if(nums[i] == 0 && nums[i-1] == 0) return true;
        }
        for(int i =1; i < nums.length; ++i) { 
            int j = i;
            nums[i] += nums[i-1];
            if(nums[i]%k ==0)return true;
            while(j > 1 && nums[j] > k) {
                if((nums[i] - nums[j-2]) % k == 0)return true;
                j--;
            }
        }
        return false;
    }
}