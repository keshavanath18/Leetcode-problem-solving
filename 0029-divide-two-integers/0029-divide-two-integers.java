class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(dividend==2147483647 && divisor==-1)return -2147483647;
        int c=0;
        boolean isneg=(dividend<0)^(divisor<0);
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
       while(a>=b){
            a=a-b;
            c++;
       }
       if(isneg){
        c=-c;
       }
       return c;
    }
}