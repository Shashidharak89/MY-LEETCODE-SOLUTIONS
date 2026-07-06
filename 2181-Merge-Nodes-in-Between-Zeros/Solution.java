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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode ans=new ListNode(0);
        ListNode t=ans;
        temp=temp.next;
        while(temp.next!=null){
            t.val=t.val+temp.val;
            if(temp.val==0){
                ListNode tmp=new ListNode(0);
                t.next=tmp;
                t=t.next;
            }
            temp=temp.next;
            
        }
        return ans;
    }
}