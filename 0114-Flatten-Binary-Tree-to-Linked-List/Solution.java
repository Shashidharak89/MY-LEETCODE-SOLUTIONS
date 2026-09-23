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
    Stack<TreeNode> stack = new Stack<>();

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root);
        TreeNode prev = null;
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            temp.left = null;
            temp.right = prev;
            prev = temp;

        }
        root = prev;
    }

    void dfs(TreeNode root) {
        if (root != null) {
            stack.push(root);
            dfs(root.left);
            dfs(root.right);
        }
    }
}