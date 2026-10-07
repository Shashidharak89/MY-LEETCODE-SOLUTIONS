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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        Queue<TreeNode> q = new LinkedList<>();
        List<TreeNode> list = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            if (temp.val >= low && temp.val <= high) {
                list.add(temp);
            }

        }
        if (list.isEmpty()) {
            return null;
        }
        TreeNode t = null;
        for (int i = 0; i < list.size(); i++) {
            t = insert(t, new TreeNode(list.get(i).val));
        }
        return t;
    }

    public TreeNode insert(TreeNode root, TreeNode n) {
        if (root == null) {
            return n;
        }
        if (n.val < root.val) {
            if (root.left != null) {
                insert(root.left, n);
            } else {
                root.left = n;
            }
        }
        if (n.val > root.val) {
            if (root.right != null) {
                insert(root.right, n);
            } else {
                root.right = n;
            }
        }
        return root;
    }
}