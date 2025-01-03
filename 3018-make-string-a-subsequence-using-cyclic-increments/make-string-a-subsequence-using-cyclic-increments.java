class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        if (m > n) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);

            if (c1 == c2 || ((c1 - 'a' + 1) % 26 + 'a') == c2) {
                j++;
            }
            i++;
        }

        return j == m;
    }
}
