import java.util.*;

class Solution {
    public int takeCharacters(String s, int k) {
        int n = s.length();
        int[] count = new int[3];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        if (count[0] < k || count[1] < k || count[2] < k) {
            return -1;
        }
        int left = 0, maxLength = 0;
        int[] current = new int[3]; 
        for (int right = 0; right < n; right++) {
            current[s.charAt(right) - 'a']++;
            while (current[0] > count[0] - k || current[1] > count[1] - k || current[2] > count[2] - k) {
                current[s.charAt(left) - 'a']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return n - maxLength;
    }
}
