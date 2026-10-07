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

    public int getMinimumDifference(TreeNode root) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        dfs(root, pq);
        int prev = Integer.MAX_VALUE;
        int mindiff = prev;
        while (!pq.isEmpty()) {
            int ele = pq.poll();
            if (Math.abs(prev - ele) < mindiff) {
                mindiff = Math.abs(prev - ele);
            }
            prev = ele;
        }
        return mindiff;
    }

    void dfs(TreeNode root, PriorityQueue<Integer> pq) {
        if (root != null) {
            pq.add(root.val);
            dfs(root.left, pq);
            dfs(root.right, pq);
        }
    }
}