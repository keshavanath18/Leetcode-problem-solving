class Solution {
    public int countDigitOne(int n) {
       long c=0;
       for(long i=1;i<=n;i*=10){
           long l=n%i;
           long curr=(n/i)%10;
           long r=n/(i*10);
           if(curr==0){
            c+=r*i;
           }else if(curr==1){
            c+=r*i+l+1;
           }else{
            c+=(r+1)*i;
           }
       } 
       return (int)c;
    }
}