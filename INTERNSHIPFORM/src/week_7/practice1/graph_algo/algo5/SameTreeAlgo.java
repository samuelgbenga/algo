package week_7.practice1.graph_algo.algo5;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class SameTreeAlgo {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Initialize queues for level-order traversal
        Queue<TreeNode> queueP = new LinkedList<>();
        Queue<TreeNode> queueQ = new LinkedList<>();

        queueP.add(p);
        queueQ.add(q);

        while (!queueP.isEmpty() && !queueQ.isEmpty()) {
            TreeNode nodeP = queueP.poll();
            TreeNode nodeQ = queueQ.poll();

            // If both nodes are null, continue to the next iteration
            if (nodeP == null && nodeQ == null) {
                continue;
            }

            // If one of the nodes is null or their values are different, return false
            if (nodeP == null || nodeQ == null || nodeP.val != nodeQ.val) {
                return false;
            }

            // Add left children to the queues
            queueP.add(nodeP.left);
            queueQ.add(nodeQ.left);

            // Add right children to the queues
            queueP.add(nodeP.right);
            queueQ.add(nodeQ.right);
        }

        // If both queues are empty, the trees are the same
        return queueP.isEmpty() && queueQ.isEmpty();
    }
}
