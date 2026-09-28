class Solution {
    public String[] findWords(String[] words) {
        String s="qwertyuiop";
        String n="asdfghjkl";
        String m="zxcvbnm";
        String wrd[]=new String[words.length];
        int k=0;
        
        for(int i=0;i<words.length;i++){
            boolean r1=true;
            boolean r2=true;
            boolean r3=true;
            String word=words[i].toLowerCase();
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(s.indexOf(ch)==-1){
                    r1=false;
                }
                if(n.indexOf(ch)==-1){
                    r2=false;
                }
                if(m.indexOf(ch)==-1){
                    r3=false;
                }
            }
            if(r1||r2||r3){
                wrd[k]=words[i];
                k++;
            }
        }
        String res[]=new String[k];
        for(int i=0;i<k;i++){
            res[i]=wrd[i];
        }
        return res;
    }
}