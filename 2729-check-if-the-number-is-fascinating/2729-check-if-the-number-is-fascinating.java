class Solution {
    public boolean isFascinating(int n) {
       int a=2*n,b=3*n;
       String add=""+n+a+b;
       if(add.length() != 9) return false;
       for(int i=1;i<=9;i++){
        if(add.indexOf(String.valueOf(i))==-1)return false;
       } 
       return true;
    }
}