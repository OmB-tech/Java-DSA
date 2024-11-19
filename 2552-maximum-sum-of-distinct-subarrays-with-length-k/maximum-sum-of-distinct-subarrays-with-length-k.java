class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < k) return 0;
        
        long maxSum = 0, currentSum = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>(); // To track the frequency of elements in the window
        
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the window
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
            currentSum += nums[i];
            
            // If the window size exceeds `k`, remove the oldest element
            if (i >= k) {
                int oldest = nums[i - k];
                currentSum -= oldest;
                if (freqMap.get(oldest) == 1) {
                    freqMap.remove(oldest);
                } else {
                    freqMap.put(oldest, freqMap.get(oldest) - 1);
                }
            }
            
            // Check if the current window has `k` distinct elements
            if (freqMap.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }
}
