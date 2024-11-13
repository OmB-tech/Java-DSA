class Solution {
    public int mySqrt(int x) {
        return binarySearchSqrt(x);
    }

    int binarySearchSqrt(int x) {
        if (x < 2) return x; // Handle cases where x is 0 or 1

        int start = 0, end = x, result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                start = mid + 1;
                result = mid; 
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
