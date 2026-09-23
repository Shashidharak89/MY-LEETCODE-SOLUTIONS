/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    Stack<Node> stack = new Stack<>();

    public Node flatten(Node head) {
        dfs(head);
        if (stack.isEmpty()) {
            return null;
        }
        Node temp = stack.pop();
        while (!stack.isEmpty()) {
            Node t = stack.pop();
            temp.prev = t;
            t.child = null;
            t.next = temp;
            temp = t;
        }
        return temp;
    }

    void dfs(Node root) {
        if (root != null) {
            stack.push(root);
            if (root.child != null) {
                dfs(root.child);
            }
            dfs(root.next);
        }
    }
}