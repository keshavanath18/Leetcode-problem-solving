class Solution {
    public boolean isAnagram(String s, String t) {
         s=s.replaceAll("\\s", "").toLowerCase();
         t=t.replaceAll("\\s", "").toLowerCase();
         if(s.length()!=t.length())return false;
         int[] count=new int[26];
         for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;

         }
         for(int c:count){
            if(c!=0)return false;
         }
         return true;
    }
}
        //sorting method
//         s=s.replaceAll("\\s", "").toLowerCase();
//         t=t.replaceAll("\\s", "").toLowerCase();
//         char[] ar1=s.toCharArray();
//         char[] ar2=t.toCharArray();
//         Arrays.sort(ar1);
//         Arrays.sort(ar2);
//         if(Arrays.equals(ar1,ar2)){
//             return true;
//         }
//         return false;
//     }
// }