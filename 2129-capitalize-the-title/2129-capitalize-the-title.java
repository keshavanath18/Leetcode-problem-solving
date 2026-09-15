class Solution {
    public String capitalizeTitle(String title) {
    //     String words[]=title.toLowerCase().split(" ");
    //     String res="";
    //     for(int i=0;i<words.length;i++){
    //         String word=words[i];
    //         if(word.length()<=2){
    //             res+=word;
    //         }
    //         else{
    //             res+=Character.toUpperCase(word.charAt(0));
    //             res+=word.substring(1);
    //         }
    //         if(i<words.length-1){
    //             res+=" ";
    //         }
    //     }
    // return res;
    char[] arr=title.toCharArray();
    int start=0;
    for(int i=0;i<=arr.length;i++){
        if(i==arr.length||arr[i]==' '){
        int len=i-start;
            for(int j=start;j<i;j++){
                if(arr[j]>='A'&&arr[j]<='Z'){
                    arr[j]=(char)(arr[j]+32);
                }
            }
            if(len>=3){
            if(arr[start]>='a'&&arr[start]<='z'){
                arr[start]=(char)(arr[start]-32);
            }
        }
        start=i+1;
        }
    }
    return new String(arr);
    }
}