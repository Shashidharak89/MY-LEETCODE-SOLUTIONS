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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        else if((p==null && q!=null )||( q==null && p!=null)){
            return false;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);
        list1.add(p.val);
        list2.add(q.val);
        while (!q1.isEmpty()) {
            TreeNode temp = q1.poll();
            if (temp.left != null) {
                q1.add(temp.left);
                list1.add(temp.left.val);
            } else {
                list1.add(null);
            }
            if (temp.right != null) {
                q1.add(temp.right);
                list1.add(temp.right.val);
            } else {
                list1.add(null);
            }

        }
        while (!q2.isEmpty()) {
            TreeNode temp = q2.poll();
            if (temp.left != null) {
                q2.add(temp.left);
                list2.add(temp.left.val);
            } else {
                list2.add(null);
            }
            if (temp.right != null) {
                q2.add(temp.right);
                list2.add(temp.right.val);
            } else {
                list2.add(null);
            }

        }
        return list1.equals(list2);
    }

}