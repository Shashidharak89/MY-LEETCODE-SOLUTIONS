import java.util.*;
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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode cur=head;
        ListNode right=head.next;

        while(cur.next!=null){
            cur.next=prev;
            prev=cur;
            cur=right;
            if(right!=null)
                right=right.next;
        }
        cur.next=prev;
        prev=cur;
        return cur;
    }
}