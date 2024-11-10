package BinaryTree_DFS;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructors
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class maxDepthTreeNode {
	 // Method to calculate the maximum depth of the binary tree
    public int maxDepth(TreeNode root) {
        // Base case: if the tree is empty, depth is 0
        if (root == null) {
            return 0;
        }
        
        // Recursive calls for left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // Return the larger depth between left and right subtree + 1 (for current root node)
        return Math.max(leftDepth, rightDepth) + 1;
    }

    // Main method for testing
    public static void main(String[] args) {
    	maxDepthTreeNode solution = new maxDepthTreeNode();

        // Example 1: Tree [3,9,20,null,null,15,7]
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        System.out.println("Example 1:");
        System.out.println("Input: [3,9,20,null,null,15,7]");
        System.out.println("Expected Output: 3");
        System.out.println("Actual Output: " + solution.maxDepth(root1));
        System.out.println();

        // Example 2: Tree [1,null,2]
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        System.out.println("Example 2:");
        System.out.println("Input: [1,null,2]");
        System.out.println("Expected Output: 2");
        System.out.println("Actual Output: " + solution.maxDepth(root2));
    }
}
