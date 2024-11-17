class Solution {
    
    public boolean canDistribute(int maxLoad, int[] quantities, int n) {
        int storesNeeded = 0;
        for (int quantity : quantities) {
            storesNeeded += (quantity + maxLoad - 1) / maxLoad;
            if (storesNeeded > n) {
                return false;
            }
        }
        return true;
    }

    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1, right = 0;
        for (int quantity : quantities) {
            right = Math.max(right, quantity);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(mid, quantities, n)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int n1 = 6;
        int[] quantities1 = {11, 6};
        System.out.println(solution.minimizedMaximum(n1, quantities1));
        
        int n2 = 7;
        int[] quantities2 = {15, 10, 10};
        System.out.println(solution.minimizedMaximum(n2, quantities2));
        
        int n3 = 4;
        int[] quantities3 = {4, 7, 9};
        System.out.println(solution.minimizedMaximum(n3, quantities3));
    }
}
