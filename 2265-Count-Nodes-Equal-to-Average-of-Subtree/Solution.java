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
    public int averageOfSubtree(TreeNode root) {
        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (findAvg(temp, temp.val)) {
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

    boolean findAvg(TreeNode r, int target) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(r);
        int sum = 0;
        int n = 0;
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            sum += temp.val;
            n++;
        }
        int avg = sum / n;
        return avg == target;
    }
}