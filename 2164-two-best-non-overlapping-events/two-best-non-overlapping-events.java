import java.util.*;

class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[1]));
        int n = events.length, maxValue = 0, result = 0;
        int[] maxSoFar = new int[n];

        for (int i = 0; i < n; i++) {
            maxValue = Math.max(maxValue, events[i][2]);
            maxSoFar[i] = maxValue;
        }

        for (int i = 0; i < n; i++) {
            result = Math.max(result, events[i][2]);
            int idx = find(events, events[i][0] - 1);
            if (idx != -1) result = Math.max(result, events[i][2] + maxSoFar[idx]);
        }

        return result;
    }

    private int find(int[][] events, int time) {
        int left = 0, right = events.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (events[mid][1] <= time) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
