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
    public int countNodes(TreeNode root) {
        int count=0;
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode temp=root;
        q.add(root);
        count++;
        while(!q.isEmpty()){
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            temp=q.poll();
            count++;
        }
        return count/2;
    }
}