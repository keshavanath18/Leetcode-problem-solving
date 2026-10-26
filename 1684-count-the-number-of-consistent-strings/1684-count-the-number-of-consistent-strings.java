class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            boolean seen=true;
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                if(allowed.indexOf(ch)==-1){
                    seen=false;
                    break;
                }
            }
            if(seen){
                    c++;
                }
        }
        return c;
    }
}