class Solution {
    public int hammingWeight(int n) {
    //    String binary=Integer.toBinaryString(n);
    //    int c=0;
    //    for(int i=0;i<binary.length();i++){
    //     if(binary.charAt(i)=='1'){
    //         c++;
    //     }
    //    }
    //    return c; 
    int c=0;
    while(n>0){
       if((n&1)==1) c++;
       n=n>>>1;
    }
    return c;
    }
}