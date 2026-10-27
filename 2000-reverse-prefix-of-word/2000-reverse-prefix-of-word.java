class Solution {
    public String reversePrefix(String word, char ch) {
        String res="";
        int ans=word.indexOf(ch);
        if(ch==-1)return word;
        for(int i=ans;i>=0;i--){
            res+=word.charAt(i);
        }
        for(int i=ans+1;i<word.length();i++){
            res+=word.charAt(i);
        }
        return res;
    }
}