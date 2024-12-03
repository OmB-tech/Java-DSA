class Solution {
    public String addSpaces(String input, int[] indices) {
        Arrays.sort(indices);
        StringBuilder result = new StringBuilder(input);
        int offset = 0;
        for (int index : indices) {
            result.insert(index + offset, " ");
            offset++;
        }
        return result.toString();
    }
}