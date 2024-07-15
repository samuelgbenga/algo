package week_7.practice1.graph_algo.algo9;// Definition for a binary tree node.


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class MaxDepthOfTree {
    private static int diameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        calculateDepth(root);
        return diameter;
    }

    private static int calculateDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        // The diameter at this node will be the sum of the depth of left and right subtrees
        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return the depth of the tree rooted at this node
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {


        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        System.out.println("Diameter (Example 1): " + MaxDepthOfTree.diameterOfBinaryTree(root1)); // Output: 3

        // Example 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        System.out.println("Diameter (Example 2): " + MaxDepthOfTree.diameterOfBinaryTree(root2)); // Output: 1
    }
}
