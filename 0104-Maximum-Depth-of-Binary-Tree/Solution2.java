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
    int d = 1;
    int max = 1;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return max;
    }

    void dfs(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                d++;
                max = Math.max(d, max);
                dfs(root.left);
                d--;
            }
            if (root.right != null) {
                d++;
                max = Math.max(d, max);
                dfs(root.right);
                d--;
            }
        }
    }
}