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
    int mindistance = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return mindistance;
    }

    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            if (Math.abs(prev - root.val) < mindistance) {
                mindistance = Math.abs(prev - root.val);
            }
            prev = root.val;
            inorder(root.right);
        }
    }
}