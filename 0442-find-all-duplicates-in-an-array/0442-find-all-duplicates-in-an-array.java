class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                al.add(num);
            }else{
                set.add(num);
            }
        }
        return al;
    }
}