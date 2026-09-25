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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count = 1;
        ListNode temp = list1;
        while (count < a) {
            count++;
            temp = temp.next;
        }

        ListNode t = temp.next;
        temp.next = list2;
        while (count < b + 1) {
            count++;
            t = t.next;
        }

        ListNode bt = list2;
        while (bt.next != null) {
            bt = bt.next;
        }

        bt.next = t;
        return list1;
    }
}