import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (set.contains(freq)) {
                return false;
            }
            set.add(freq);
        }
        return true;
    }
}