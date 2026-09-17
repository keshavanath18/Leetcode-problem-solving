class Solution {
    public boolean isMatch(String s, String p) {
    //    if(s.equals(p)||p.contains("*")||p.contains("."))return true;
    // return false;
        if(p.length()==0)return s.length()==0;
        boolean firstMatch=s.length()>0&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.');
        if(p.length()>=2&&p.charAt(1)=='*')
            return isMatch(s,p.substring(2))||(firstMatch&&isMatch(s.substring(1),p));
        return firstMatch&&isMatch(s.substring(1),p.substring(1));
    }
}