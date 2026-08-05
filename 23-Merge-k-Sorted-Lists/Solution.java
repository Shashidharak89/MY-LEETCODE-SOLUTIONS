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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode head = new ListNode();
        int n = lists.length;
        for (int i = 0; i < n; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                pq.add(temp.val);
                temp = temp.next;
            }
        }
        ListNode t = head;
        int size = pq.size();
        for (int i = 0; i < size; i++) {
            t.next = new ListNode(pq.poll());
            t = t.next;
        }
        return head.next;
    }
}