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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        if (root1 != null) {
            Stack<TreeNode> stack1 = new Stack<>();
            stack1.push(root1);
            while (!stack1.isEmpty()) {
                TreeNode temp = stack1.pop();
                if (temp.left != null) {
                    stack1.push(temp.left);
                }
                if (temp.right != null) {
                    stack1.push(temp.right);
                }
                list.add(temp.val);
            }
        }
        if (root2 != null) {
            Stack<TreeNode> stack2 = new Stack<>();
            stack2.push(root2);
            while (!stack2.isEmpty()) {
                TreeNode temp = stack2.pop();
                if (temp.left != null) {
                    stack2.push(temp.left);
                }
                if (temp.right != null) {
                    stack2.push(temp.right);
                }
                list.add(temp.val);
            }
        }
        Collections.sort(list);
        return list;

    }
}