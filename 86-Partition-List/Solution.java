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
    public ListNode partition(ListNode head, int x) {
        Queue<ListNode> q = new LinkedList<>();

        ListNode temp = head;
        ListNode p = new ListNode();
        ListNode prev = p;
        while (temp != null) {
            if (temp.val >= x) {
                q.add(temp);
            } else {
                prev.next = temp;
                prev = prev.next;
            }
            temp = temp.next;
        }
        int size = q.size();
        for (int i = 0; i < size; i++) {
            prev.next = q.poll();
            prev = prev.next;
        }
        prev.next = null;
        return p.next;
    }
}