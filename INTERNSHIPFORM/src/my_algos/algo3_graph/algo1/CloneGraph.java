package my_algos.algo3_graph.algo1;

import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {
    // step 1: check for null
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        //step 2:  Use a map to store the mapping from original node to its clone
        Map<Node, Node> map = new HashMap<>();

        //step 3: Initialize the queue for BFS
        Queue<Node> queue = new LinkedList<>(); // push and pull operation
        queue.add(node); // normal array


        // Create the clone for the starting node and put it in the map
        map.put(node, new Node(node.val));

        // Perform BFS
        while (!queue.isEmpty()) {
            // step 5: the current node should equal the current head node
            Node currentNode = queue.poll();


            // Iterate through all the neighbors of the current node
            // step 6: loop through the neighbors to add them to the clone
            for (Node neighbor : currentNode.neighbors) {
                if (!map.containsKey(neighbor)) {
                    // step 7: add the neighbors and the neighbors Clone to the map
                    map.put(neighbor, new Node(neighbor.val));
                    // step 8: add that neighbor to a queue
                    queue.add(neighbor);
                }
                // Add the cloned neighbor to the current node's clone's neighbors
                // step 9:  gets the clone node, then its neighbor then add the original neighbors to
                // the clone neighbors.
                map.get(currentNode).neighbors.add(map.get(neighbor));
            }
        }

        // Return the clone of the node that was initially provided
        return map.get(node);
    }



    public Node cloneGraph1(Node node){

        if(node == null) return null;

        Map<Node, Node> mappy = new HashMap<>();


        Queue<Node> queen = new LinkedList<>();
        queen.add(node);

        mappy.put(node, new Node(node.val));

        while(!queen.isEmpty()){

            Node currentNode = queen.poll();

            for(Node noddy : currentNode.neighbors){
                if(!mappy.containsKey(noddy)){

                    mappy.put(noddy, new Node(noddy.val));

                    queen.add(noddy);
                }

                mappy.get(currentNode).neighbors.add(mappy.get(noddy));

            }

        }





        return mappy.get(node);
    }


    public static void main(String[] args) {
        // Example usage:
        // Creating a graph with adjacency list [[2,4],[1,3],[2,4],[1,3]]
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        CloneGraph solution = new CloneGraph();
        Node clonedGraph = solution.cloneGraph1(node1);

        // Print cloned graph to verify
        printGraph(clonedGraph);
    }

    // Helper function to print the graph (for verification purposes)
    private static void printGraph(Node node) {
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                System.out.print("Node " + currentNode.val + " neighbors: ");
                for (Node neighbor : currentNode.neighbors) {
                    System.out.print(neighbor.val + " ");
                    queue.add(neighbor);
                }
                System.out.println();
            }
        }
    }
}
