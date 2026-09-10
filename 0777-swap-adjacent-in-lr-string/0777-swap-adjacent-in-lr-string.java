class Solution {
    public boolean canTransform(String start, String end) {
    //     if (start.equals(result)) return true;
    //     while (start.contains("XL") || start.contains("RX")) {
    //         start = start.replace("XL", "LX");
    //         start = start.replace("RX", "XR");
    //     }
    // return start.equals(result);


        if (!start.replace("X", "").equals(end.replace("X", ""))) {
            return false;
        }
        int i = 0, j = 0;
        int n = start.length();
        while (i < n && j < n) {
            while (i < n && start.charAt(i) == 'X') i++;
            while (j < n && end.charAt(j) == 'X') j++;
            if (i == n || j == n) {
                return i == n && j == n;
            }
            char c = start.charAt(i);
            if (c != end.charAt(j)) {
                return false;
            }
            // L can move only left
            if (c == 'L' && i < j) {
                return false;
            }
            // R can move only right
            if (c == 'R' && i > j) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}