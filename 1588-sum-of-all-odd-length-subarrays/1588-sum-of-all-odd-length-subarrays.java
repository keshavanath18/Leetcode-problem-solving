class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        int n = arr.length;

        for (int len = 1; len <= n; len += 2) {
            int windowSum = 0;
            for (int i = 0; i < len; i++) {
                windowSum += arr[i];
            }
            total += windowSum;
            for (int i = len; i < n; i++) {
                windowSum += arr[i] - arr[i - len];
                total += windowSum;
            }
        }
        return total;
    }
}