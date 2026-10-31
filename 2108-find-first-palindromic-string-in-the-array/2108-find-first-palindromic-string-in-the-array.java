class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int l=0;
            int r=word.length()-1;
            boolean ispalin=true;
        while(l<r){
            if(word.charAt(l)!=word.charAt(r)){
                ispalin=false;
                break;
            }
            l++;
            r--;
        }
        if(ispalin)return word;
        }
        return "";
    }
}