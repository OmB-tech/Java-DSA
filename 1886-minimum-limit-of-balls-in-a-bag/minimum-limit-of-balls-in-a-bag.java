class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = getMax(nums), result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isFeasible(nums, maxOperations, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) max = Math.max(max, num);
        return max;
    }

    private boolean isFeasible(int[] nums, int maxOperations, int penalty) {
        int operationsUsed = 0;
        for (int num : nums) {
            operationsUsed += (num - 1) / penalty;
            if (operationsUsed > maxOperations) return false;
        }
        return true;
    }
}
