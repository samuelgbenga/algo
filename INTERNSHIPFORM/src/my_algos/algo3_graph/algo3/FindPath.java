package my_algos.algo3_graph.algo3;

import java.util.*;

public class FindPath {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Build the graph using an adjacency list
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

     ;

        // Use a queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(source);
        visited[source] = true;

        // BFS traversal
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == destination) {
                return true;
            }
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        // If we exhaust the BFS without finding the destination
        return false;
    }

    public static void main(String[] args) {
        FindPath solution = new FindPath();

        // Example 1
        int n1 = 3;
        int[][] edges1 = { {0, 1}, {1, 2}, {2, 0} };
        int source1 = 0;
        int destination1 = 2;
        System.out.println(solution.validPath(n1, edges1, source1, destination1)); // Output: true

        // Example 2
        int n2 = 6;
        int[][] edges2 = { {0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3} };
        int source2 = 0;
        int destination2 = 5;
        System.out.println(solution.validPath(n2, edges2, source2, destination2)); // Output: false
    }
}
