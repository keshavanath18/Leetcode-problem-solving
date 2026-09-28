class Solution {
    public int countSegments(String s) {
    //    if (s.trim().isEmpty()) {
    //         return 0;
    //     }
    //     if(s.length()==0)return 0;
    //    String word[]=s.trim().split("\\s+");
    //    return word.length;
    int c=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=' ' && ( i==0 || s.charAt(i-1)==' ')){
            c++;
        }
    }
    return c;
    }
}