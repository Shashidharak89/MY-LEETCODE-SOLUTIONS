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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = new ListNode(head.val);
        ListNode prev = p;
        ListNode temp = head.next;
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        while (temp != null) {
            if (!set.contains(temp.val)) {
                prev.next = new ListNode(temp.val);
                prev = prev.next;
            }
            set.add(temp.val);
            temp = temp.next;
        }
        return p;
    }
}