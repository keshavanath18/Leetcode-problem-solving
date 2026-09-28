class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       String word[]=s.split("\\s+");
       int l=0;
       int r=word.length-1;
       while(l<r){
            String temp=word[l];
            word[l]=word[r];
            word[r]=temp;
        l++;
        r--;
       } 
       return String.join(" ",word);
    }
}