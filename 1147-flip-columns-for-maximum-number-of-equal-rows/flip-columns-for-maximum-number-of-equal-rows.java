class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> patternCount = new HashMap<>();
        
        for (int[] row : matrix) {
            StringBuilder pattern = new StringBuilder();
            
            // Generate a canonical pattern where the first element is always '0'
            int firstValue = row[0];
            for (int val : row) {
                pattern.append(val == firstValue ? '0' : '1');
            }
            
            String canonicalPattern = pattern.toString();
            patternCount.put(canonicalPattern, patternCount.getOrDefault(canonicalPattern, 0) + 1);
        }
        
        int maxCount = 0;
        for (int count : patternCount.values()) {
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}
