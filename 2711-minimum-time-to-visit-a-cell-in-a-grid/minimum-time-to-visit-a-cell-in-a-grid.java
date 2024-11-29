class Solution {
    public int minimumTime(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (grid[0][1] > 1 && grid[1][0] > 1) {
            return -1;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
        pq.offer(new int[]{0, 0, 0});

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] visited = new boolean[m][n];

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int row = current[0], col = current[1], currentTime = current[2];

            if (row == m - 1 && col == n - 1) {
                return currentTime;
            }

            if (visited[row][col]) continue;
            visited[row][col] = true;

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n || visited[newRow][newCol]) {
                    continue;
                }

                int waitTime = (grid[newRow][newCol] - currentTime) % 2 == 0 ? 1 : 0;
                int newTime = Math.max(currentTime + 1, grid[newRow][newCol] + waitTime);

                pq.offer(new int[]{newRow, newCol, newTime});
            }
        }

        return -1;
    }
}
