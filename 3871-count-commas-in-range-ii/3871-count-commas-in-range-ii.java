class Solution {
    public long countCommas(long n) {
        if(n<1000)return 0;
        long big=999;
        long com=0;
        while(n>big){
            com+=n-big;
            big=big*1000+999;
        }
        return com;
    }
}