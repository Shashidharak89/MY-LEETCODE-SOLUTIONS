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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        List<Integer> t = new ArrayList<>();
        t.add(root.val);
        list.add(t);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                if (temp.left != null) {
                    l.add(temp.left.val);
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    l.add(temp.right.val);
                    q.add(temp.right);
                }

            }
            if (count % 2 != 0) {
                Collections.reverse(l);
            }
            if (!l.isEmpty()) {
                list.add(l);
            }
            count++;
        }
        return list;
    }
}