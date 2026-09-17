class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int sign=1;
        int i=0,num=0;
        if(i<s.length()&&s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(i<s.length()&&s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length()&& Character.isDigit(s.charAt(i))){
            int dig=s.charAt(i)-'0';
            if (num>Integer.MAX_VALUE / 10 ||(num == Integer.MAX_VALUE / 10 && dig > 7)) {
                if (sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            num=num*10+dig;
            i++;
        }
        return num*sign;
    }
}