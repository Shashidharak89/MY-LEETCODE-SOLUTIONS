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
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }
        ListNode p = new ListNode();
        ListNode prev = p;
        ListNode temp = head;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (temp != null) {
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (map.get(temp.val) == 1) {
                prev.next = new ListNode(temp.val);
                prev = prev.next;
            }
            temp = temp.next;
        }
        p = p.next;
        return p;
    }
}