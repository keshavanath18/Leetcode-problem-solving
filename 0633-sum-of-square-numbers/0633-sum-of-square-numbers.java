class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0,b=(long)Math.sqrt(c);
        while(a<=b){
            long sum=a*a+b*b;
            if(sum==c)return true;
            else if(sum<c)a++;
            else b--;
        }
    return false;






























    //     int m=(int)c/2;
    //     m=m*m;
    //     int rem=(int)c%2;
    //     rem=rem*rem;
    //     int sum=m+rem;
    //     if(sum==c)return true;
    
    }
}