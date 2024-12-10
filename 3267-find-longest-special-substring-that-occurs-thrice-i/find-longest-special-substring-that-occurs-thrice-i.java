class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        
        for (int len = n; len >= 1; len--) {
            HashMap<String, Integer> freqMap = new HashMap<>();
            
            for (int i = 0; i <= n - len; i++) {
                String substring = s.substring(i, i + len);
                
                if (isSpecial(substring)) {
                    freqMap.put(substring, freqMap.getOrDefault(substring, 0) + 1);
                }
            }
            
            for (int count : freqMap.values()) {
                if (count >= 3) {
                    return len;
                }
            }
        }
        
        return -1;
    }
    
    private boolean isSpecial(String s) {
        char firstChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != firstChar) {
                return false;
            }
        }
        return true;
    }
}
