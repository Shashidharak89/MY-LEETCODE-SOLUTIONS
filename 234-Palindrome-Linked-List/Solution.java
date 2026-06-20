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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        Stack<ListNode> stack=new Stack<>();
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }

        ListNode cur=head;
        while(cur!=null){
            ListNode list=stack.pop();
            if(list.val!=cur.val){
                return false;
            }
            cur=cur.next;
        }
        return true;
    }
}