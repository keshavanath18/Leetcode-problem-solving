class Solution {
    public int findComplement(int num) {
        String bin=Integer.toBinaryString(num);
        String res="";
        for(int i=0;i<bin.length();i++){
            char ch=bin.charAt(i);
            if(ch=='1'){
                res+='0';
            }
            else if(ch=='0'){
                res+='1';
            }
        }
        return Integer.parseInt(res,2);
    }
}