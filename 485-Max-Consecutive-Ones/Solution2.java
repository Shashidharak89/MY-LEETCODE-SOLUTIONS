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
import java.util.*;
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode cur = head;
        int n = 1;
        while(cur.next!=null){
            cur=cur.next;
            ++n;
        }

        k=k%n;

        if(k==0) return head;

        cur.next=head;

        for(int i=0;i<n-k;i++){
            cur=cur.next;
        }

        head = cur.next;

        cur.next=null;

        return head;
    }
}