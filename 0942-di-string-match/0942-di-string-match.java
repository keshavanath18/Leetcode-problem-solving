class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int perm[]=new int[n+1];
        int l=0,r=n;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I')perm[i]=l++;
            else perm[i]=r--;
        }
        perm[n]=l;
        return perm;
    }
}