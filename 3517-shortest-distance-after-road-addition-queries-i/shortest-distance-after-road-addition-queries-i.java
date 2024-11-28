import java.util.*;

class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            graph.computeIfAbsent(i, k -> new ArrayList<>()).add(i + 1);
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0], v = queries[i][1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            result[i] = bfs(graph, n);
        }
        return result;
    }

    private int bfs(Map<Integer, List<Integer>> graph, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[0] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[node] + 1;
                    queue.add(neighbor);
                }
            }
        }
        return dist[n - 1];
    }
}
