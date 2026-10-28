class Solution {
    public String reversePrefix(String s, int k) {
        String res="";
        StringBuilder sb=new StringBuilder(s.substring(0,k));
        for(int i=0;i<s.length();i++){
             if(i==k){
                res+=sb.reverse().toString();
                res+=s.substring(k);
                break;
             }
             res+="";
        }
        if(k==s.length()) {
            res=sb.reverse().toString();
        }
        return res;
    }
}