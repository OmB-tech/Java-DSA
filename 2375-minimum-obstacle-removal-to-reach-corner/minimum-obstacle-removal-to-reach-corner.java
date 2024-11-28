import java.util.*;

class Solution {
    public int minimumObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dist = new int[m][n];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, 0, 0});
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int obstacles = current[0], x = current[1], y = current[2];
            if (x == m - 1 && y == n - 1) return obstacles;

            for (int[] dir : directions) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    int newObstacles = obstacles + grid[nx][ny];
                    if (newObstacles < dist[nx][ny]) {
                        dist[nx][ny] = newObstacles;
                        pq.add(new int[]{newObstacles, nx, ny});
                    }
                }
            }
        }
        return -1;
    }
}
