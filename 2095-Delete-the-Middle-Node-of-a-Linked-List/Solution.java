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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        int n=0;
        ListNode st=head;
        while(st!=null){
            n++;
            st=st.next;
        }
        n=n/2;
        n--;
        st=head;
        int c=0;
        while(c!=n && st!=null){
            st=st.next;
            c++;
        }
        st.next=st.next.next;
        return head;
    }
}