class Solution {
    public boolean isBalanced(String num) {
       int esum=0,osum=0;
       for(int i=0;i<num.length();i++){
            int dig=num.charAt(i)-'0';
            if(i%2==0){
                esum+=dig;
            }
            else{
                osum+=dig;
            }
       }
       if(esum==osum)return true;
       return false;
    }
}