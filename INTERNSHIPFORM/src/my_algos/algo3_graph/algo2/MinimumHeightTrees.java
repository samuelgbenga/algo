package my_algos.algo3_graph.algo2;
import java.util.*;

public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        if (n == 1) {
            result.add(0);
            return result;
        }

        // Build the graph
        List<Set<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // Initialize the first layer of leaves
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (graph.get(i).size() == 1) {
                leaves.add(i);
            }
        }

        // Remove the leaves layer-by-layer until reaching the centroids
        while (n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (int leaf : leaves) {
                int neighbor = graph.get(leaf).iterator().next();
                graph.get(neighbor).remove(leaf);
                if (graph.get(neighbor).size() == 1) {
                    newLeaves.add(neighbor);
                }
            }
            leaves = newLeaves;
        }

        return leaves;
    }

    public static void main(String[] args) {
        MinimumHeightTrees solution = new MinimumHeightTrees();

        // Example 1
        int n1 = 4;
        int[][] edges1 = { {1, 0}, {1, 2}, {1, 3} };
        System.out.println(solution.findMinHeightTrees(n1, edges1)); // Output: [1]

        // Example 2
        int n2 = 6;
        int[][] edges2 = { {3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4} };
        System.out.println(solution.findMinHeightTrees(n2, edges2)); // Output: [3, 4]
    }
}
