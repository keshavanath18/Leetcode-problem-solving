class Solution {
    public int integerReplacement(int n) {
        int c=0;
        long x=n;
       while(x>1){
        if(x%2==0){
            x/=2;
        }
        else{
            if(x==3 || x%4==1){
                x--;
            }else{
                x++;
            }
        }
        c++;
       } 
       return c;
    }
}