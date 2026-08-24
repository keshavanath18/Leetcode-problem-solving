class Solution {
    public boolean checkIfPangram(String sentence) {
       String low = sentence.toLowerCase();
       for(char i='a';i<='z';i++){
        if(sentence.indexOf(i)==-1)return false;
       }
       return true;
    }
}