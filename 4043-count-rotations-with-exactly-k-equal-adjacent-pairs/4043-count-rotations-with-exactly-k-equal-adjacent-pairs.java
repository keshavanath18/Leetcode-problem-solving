class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int cnt = 0;
        for (int i = 0;i<n;i++) {
            char c = s.charAt(i);
            char nextC = s.charAt((i+1)%n);
            if (c == nextC) cnt++;
        }
        if (cnt == k) {
            return n - cnt;
        }
        if (cnt - 1 == k) {
            return cnt;
        }
        return 0;
    }
}