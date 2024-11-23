class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;     // Number of rows in the box
        int n = box[0].length;  // Number of columns in the box
        
        // Step 1: Simulate gravity for each row
        for (int i = 0; i < m; i++) {
            int emptySlot = n - 1; // Start at the rightmost column
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '#') {
                    box[i][j] = '.';
                    box[i][emptySlot] = '#';
                    emptySlot--;
                } else if (box[i][j] == '*') {
                    emptySlot = j - 1; // Reset the empty slot pointer
                }
            }
        }

        // Step 2: Rotate the box 90 degrees clockwise
        char[][] rotatedBox = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedBox[j][m - 1 - i] = box[i][j];
            }
        }
        
        return rotatedBox;
    }
}
