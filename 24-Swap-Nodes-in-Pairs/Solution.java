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
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode f=head;
        ListNode s=head.next;

        int temp=0;
        ListNode t=head;
        int count=0;

        while(t!=null){
            count++;
            t=t.next;
        }
        count=count/2;
        int i=1;

        while(i<count){
            temp=f.val;
            f.val=s.val;
            s.val=temp;

            f=f.next.next;
            s=s.next.next;
            i++;
        }
        temp=f.val;
        f.val=s.val;
        s.val=temp;

        return head;

    }
}