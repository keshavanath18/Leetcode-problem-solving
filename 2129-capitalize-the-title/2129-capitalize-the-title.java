class Solution {
    public String capitalizeTitle(String title) {
        String words[]=title.toLowerCase().split(" ");
        String res="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(word.length()<=2){
                res+=word;
            }
            else{
                res+=Character.toUpperCase(word.charAt(0));
                res+=word.substring(1);
            }
            if(i<words.length-1){
                res+=" ";
            }
        }
    return res;
    }
}