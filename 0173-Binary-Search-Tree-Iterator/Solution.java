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
class BSTIterator {
    TreeNode root;
    int counter = 0;
    ArrayList<Integer> list = new ArrayList<>();

    public void dfs(TreeNode root) {
        if (root != null) {
            dfs(root.left);
            list.add(root.val);
            dfs(root.right);
        }
    }

    public BSTIterator(TreeNode root) {
        this.root = root;
        dfs(root);
        this.counter = 0;
        System.out.println(list);
    }

    public int next() {
        return list.get(counter++);
    }

    public boolean hasNext() {
        return counter < list.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */