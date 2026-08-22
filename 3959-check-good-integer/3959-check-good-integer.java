class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum=0,sqsum=0;
        int temp=n;
        while(temp>0){
            int dig=temp%10;
            dsum+=dig;
            sqsum=sqsum+(dig*dig);
            temp/=10;
        }
        if(sqsum-dsum>=50)return true;
        return false;
    }
}