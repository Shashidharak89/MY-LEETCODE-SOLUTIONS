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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode p = new ListNode();
        ListNode prev = p;
        int n = val;
        while (temp != null) {
            if (temp.val != n) {
                prev.next = temp;
                prev = prev.next;
            }
            temp = temp.next;
        }
        prev.next = null;
        return p.next;
    }
}