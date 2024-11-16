class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
            for (int i = 0; i <= nums.length - k; i++) {
                boolean isCon = true;
                for (int j = i; j < i + k - 1; j++) {
                    if (nums[j] + 1 != nums[j + 1]) {
                        isCon = false;
                        break;
                    }
                }
                if (isCon) {
                    result[i] = nums[i + k - 1];
                } else {
                    result[i] = -1;
                }
            }

            return result;
    }
}