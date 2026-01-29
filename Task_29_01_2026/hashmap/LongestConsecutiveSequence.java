package hashmap;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;

        for (int num : nums) {

            if (map.containsKey(num)) {
                continue;
            }

            int left = map.getOrDefault(num - 1, 0);
            int right = map.getOrDefault(num + 1, 0);

            int currLen = left + 1 + right;

            map.put(num, currLen);

            map.put(num - left, currLen);
            map.put(num + right, currLen);

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}
