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
    public int countDominantNodes(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (isDominant(temp)) {
                count++;
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return count;
    }

    boolean isDominant(TreeNode r) {
        if (r.left == null && r.right == null) {
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(r);
        int num = r.val;
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.val > num) {
                num = temp.val;
                return false;
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return true;
    }

}