class Solution {
    public int longestValidParentheses(String s) {
        if(s.length()==0)return 0;
        int l=0;
        int r=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }else{
                r++;
            }
            if(l==r){
                max=Math.max(max,2*r);
            }
            if(r>l){
                l=0;
                r=0;
            }
        }
        l=0;
        r=0;
         for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                l++;
            }else{
                r++;
            }
            if(l==r){
                max=Math.max(max,2*l);
            }
            if(l>r){
                l=0;
                r=0;
            }
        }
        return max;
    }
}