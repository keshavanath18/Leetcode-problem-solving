class Solution {
    public int reverseDegree(String s) {
        int[] value={26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15,
               14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
               int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int indx=ch-'a';
            int prd=(i+1)*value[indx];
            sum+=prd;
            
        }
        return sum;
    }
}