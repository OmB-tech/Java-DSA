class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (end > 0 && arr[end - 1] <= arr[end]) {
            end--;
        }
        if (end == 0) return 0;
        int ans = end;
        while (start < end && (start == 0 || arr[start - 1] <= arr[start])) {
            while (end < n && arr[start] > arr[end]) {
                end++;
            }
            ans = Math.min(ans, end - start - 1);
            start++;
        }
        return ans;
    }
}
