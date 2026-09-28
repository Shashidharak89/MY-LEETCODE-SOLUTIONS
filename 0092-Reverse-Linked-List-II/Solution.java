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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 1;
        Stack<ListNode> stack = new Stack<>();
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            if (count < left) {
                list.add(temp);
            } else if (count >= left && count <= right) {
                stack.push(temp);
            } else {
                while (!stack.isEmpty()) {
                    list.add(stack.pop());
                }
                list.add(temp);
            }
            count++;
            temp = temp.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }
        list.get(list.size() - 1).next = null;
        return list.get(0);
    }
}