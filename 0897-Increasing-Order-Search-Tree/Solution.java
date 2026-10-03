/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        inorder(root, stack);
        TreeNode prev = null;
        TreeNode temp = null;
        while (!stack.isEmpty()) {
            temp = stack.pop();
            temp.right = prev;
            temp.left = null;
            prev = temp;
        }
        return temp;
    }

    void inorder(TreeNode root, Stack<TreeNode> stack) {
        if (root != null) {
            inorder(root.left, stack);
            stack.push(root);
            inorder(root.right, stack);
        }
    }
}