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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root1);
        s2.push(root2);
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        while (!s1.isEmpty()) {
            TreeNode temp = s1.pop();
            if (temp.left != null) {
                s1.push(temp.left);
            }
            if (temp.right != null) {
                s1.push(temp.right);
            }
            if (temp.left == null && temp.right == null) {
                list1.add(temp.val);
            }
        }

        while (!s2.isEmpty()) {
            TreeNode temp = s2.pop();
            if (temp.left != null) {
                s2.push(temp.left);
            }
            if (temp.right != null) {
                s2.push(temp.right);
            }
            if (temp.left == null && temp.right == null) {
                list2.add(temp.val);
            }
        }
        System.out.println(list1);
        System.out.println(list2);

        return list1.equals(list2);

    }
}