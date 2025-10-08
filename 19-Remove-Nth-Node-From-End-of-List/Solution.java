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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next==null){
            head=null;
            return head;
        }
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        count=count-n;
        int num=1;
        cur=head;
        if(count==0){
            head=head.next;
            return head;
        }
        while(num<count && cur!=null){
          
            cur=cur.next;
            num++;
        }
        if(n==1){
            cur.next=null;
        }
        else
            cur.next=cur.next.next;
        return head;

    }
}