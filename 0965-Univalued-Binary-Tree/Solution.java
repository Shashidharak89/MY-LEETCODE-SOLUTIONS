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
    boolean valid = true;

    public boolean isUnivalTree(TreeNode root) {
        dfs(root, root.val);
        return valid;
    }

    void dfs(TreeNode root, int num) {
        if (root != null) {
            if (root.val != num) {
                valid = false;
                return;
            }
            dfs(root.left, num);
            dfs(root.right, num);
        }
    }
}