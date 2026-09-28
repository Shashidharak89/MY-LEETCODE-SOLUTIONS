/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            if (stack.size() == k) {
                while (!stack.isEmpty()) {
                    list.add(stack.pop());
                }
            }
            temp = temp.next;
        }
        for (ListNode ele : stack) {
            list.add(ele);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            ListNode t = list.get(i);
            t.next = list.get(i + 1);
        }
        list.get(list.size() - 1).next = null;
        return list.get(0);
    }
}