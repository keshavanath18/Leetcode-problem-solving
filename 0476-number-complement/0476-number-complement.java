class Solution {
    public int findComplement(int num) {
        String bin=Integer.toBinaryString(num);
        // String res="";
        // for(int i=0;i<bin.length();i++){
        //     char ch=bin.charAt(i);
        //     if(ch=='1'){
        //         res+='0';
        //     }
        //     else if(ch=='0'){
        //         res+='1';
        //     }
        // }
        // return Integer.parseInt(res,2);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<bin.length();i++){
            char ch=bin.charAt(i);
            if(ch=='0'){
                sb.append('1');
            }
            else if(ch=='1'){
                sb.append('0');
            }

        }
        return Integer.parseInt((sb.toString()),2);
    }
}