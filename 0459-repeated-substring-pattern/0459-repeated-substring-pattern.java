class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1,str.length()-1).contains(s);



        // int n=s.length();
        // for(int i=1;i<=n/2;i++){
        //     if(n%i!=0)continue;
        //     String pat=s.substring(0,i);
        //     String rep="";
        //     for(int j=0;j<n/i;j++){
        //         rep+=pat;
        //     }
        //     if(rep.equals(s))return true;
        // }
        // return false;
    }
}