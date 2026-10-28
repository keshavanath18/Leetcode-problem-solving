class Solution {
    public String reversePrefix(String s, int k) {
        String res="";
        StringBuilder sb=new StringBuilder(s.substring(0,k));
        res+=sb.reverse().toString();
        res+=s.substring(k);
        return res;
    }
}