class Solution {
    public boolean isHappy(int n) {
        int firstdig=n;
        int secdig=Next(n);
        while (secdig!=1 && firstdig!=secdig) {
            firstdig=Next(firstdig);
            secdig=Next(Next(secdig));
        }
        return secdig==1;
    }
    private int Next(int n){
            int sum=0;
            while(n>0){
                int dig=n%10;
                sum+=Math.pow(dig,2);
                n/=10;
            }
        return sum;
    }
}