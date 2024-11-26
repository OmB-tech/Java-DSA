import java.util.*;

class Solution {
    public int findChampion(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[n];
        
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int from = edge[0], to = edge[1];
            graph.get(from).add(to);
            inDegree[to]++;
        }
        
        int champion = -1;
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                if (champion != -1) {
                    return -1;
                }
                champion = i;
            }
        }
        
        if (champion == -1) return -1;
        
        boolean[] visited = new boolean[n];
        dfs(graph, champion, visited);
        
        for (int i = 0; i < n; i++) {
            if (!visited[i] && i != champion) {
                return -1;
            }
        }
        
        return champion;
    }
    
    private void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }
}
