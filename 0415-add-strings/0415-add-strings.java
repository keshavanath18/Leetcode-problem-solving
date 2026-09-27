class Solution {
    public String addStrings(String num1, String num2) {
    // int n=0,m=0;
    // for(int i=0;i<num1.length();i++){
    //     n=n*10+(num1.charAt(i)-'0');
    // }
    // for(int i=0;i<num2.length();i++){
    //     m=m*10+(num2.charAt(i)-'0');
    // }
    // return String.valueOf(n+m);
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;
        String ans = "";

        while (i >= 0 || j >= 0 || carry > 0) {

            int a = 0;
            int b = 0;

            if (i >= 0) {
                a = num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                b = num2.charAt(j) - '0';
                j--;
            }
            int sum = a + b + carry;

            ans = (sum % 10) + ans;

            carry = sum / 10;
        }
        return ans;
    }
}