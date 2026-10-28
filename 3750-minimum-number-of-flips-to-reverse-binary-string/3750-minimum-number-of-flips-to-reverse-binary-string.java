class Solution {
    public int minimumFlips(int n) {
        String num=Integer.toBinaryString(n);
        int l=0,c=0;
        int r=num.length()-1;
        while(l<r){
           if(num.charAt(l)!=num.charAt(r)){
            c+=2;
           }
            l++;
            r--;
        }
        return c;
    }
}