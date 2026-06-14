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
    public int pairSum(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int n=list.size();
        int max=0;
        for(int i=0;i<n/2;i++){
            if(list.get(i)+list.get(n-1-i)>max){
                max=list.get(i)+list.get(n-1-i);
            }
        }
        return max;
    }
}