package BinarySearchTree;

//Definition for a binary tree node.
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

public class searchBST1 {
 // Method to search for a node with a specific value in a BST
 public TreeNode searchBST(TreeNode root, int val) {
     // Base case: if root is null or if root's value equals val, return root
     if (root == null || root.val == val) {
         return root;
     }
     
     // If val is less than root's value, search in the left subtree
     if (val < root.val) {
         return searchBST(root.left, val);
     }
     
     // If val is greater than root's value, search in the right subtree
     return searchBST(root.right, val);
 }

 // Main method for testing
 public static void main(String[] args) {
     searchBST1 solution = new searchBST1();

     // Example 1: Tree [4,2,7,1,3], val = 2
     TreeNode root1 = new TreeNode(4);
     root1.left = new TreeNode(2);
     root1.right = new TreeNode(7);
     root1.left.left = new TreeNode(1);
     root1.left.right = new TreeNode(3);

     System.out.println("Example 1:");
     System.out.println("Input: root = [4,2,7,1,3], val = 2");
     TreeNode result1 = solution.searchBST(root1, 2);
     printTree(result1); // Expected output: [2,1,3]
     System.out.println();

     // Example 2: Tree [4,2,7,1,3], val = 5
     System.out.println("Example 2:");
     System.out.println("Input: root = [4,2,7,1,3], val = 5");
     TreeNode result2 = solution.searchBST(root1, 5);
     printTree(result2); // Expected output: null (or empty output)
 }

 // Helper method to print the tree in preorder
 private static void printTree(TreeNode root) {
     if (root == null) {
         System.out.print("[]");
         return;
     }
     System.out.print("[" + root.val);
     if (root.left != null || root.right != null) {
         System.out.print(",");
         printTree(root.left);
         System.out.print(",");
         printTree(root.right);
     }
     System.out.print("]");
 }
}

