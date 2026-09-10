class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        int n = arr.length;

        for (int k= 1; k<= n; k += 2) {
            int windowSum = 0;
            for (int i = 0; i < k; i++) {
                windowSum += arr[i];
            }
            total += windowSum;
            for (int i = k; i < n; i++) {
                windowSum += arr[i] - arr[i - k];
                total += windowSum;
            }
        }
        return total;
    }
}