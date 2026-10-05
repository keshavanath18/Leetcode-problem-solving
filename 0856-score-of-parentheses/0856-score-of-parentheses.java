class Solution {
    public int scoreOfParentheses(String s) {
        int c=0,open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)=='('){
                 open++;
            }
            else {
                open--;
                if(s.charAt(i-1)=='('){
                    c+=Math.pow(2,open);
                }
            }
        }
        return c;
    }
}