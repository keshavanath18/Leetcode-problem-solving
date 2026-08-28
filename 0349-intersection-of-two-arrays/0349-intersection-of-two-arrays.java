class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> h1=new HashSet<>();
       Set<Integer> h2=new HashSet<>();
       Set<Integer> res=new HashSet<>();
        
       for(int i:nums1){
          h1.add(i);
       }
       for(int k:nums2){
          if(h1.contains(k)){
            res.add(k);
          }
       }
       int arr[]=new int[res.size()];
       int i=0;
       for(int num:res){
        arr[i]=num;
        i++;
       }
       return arr;
    }
}