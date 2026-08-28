class Solution {
    public int thirdMax(int[] nums) {
      TreeSet<Integer> s1=new TreeSet<>();
      for(int i:nums){
        s1.add(i);
      }
      if(s1.size()<3){
         return s1.last();
      }
      s1.pollLast();
      s1.pollLast();
      return s1.last();
    }
}