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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1,null);
        ListNode curr = dummyNode;
        ListNode t1 = l1, t2 = l2;
        int carry = 0;
        while(t1 != null || t2 != null){
            int sum = carry;
            if(t1 != null) sum += t1.val;
            if(t2 != null) sum += t2.val;
            ListNode newNode = new ListNode(sum%10,null);
            curr.next = newNode;
            curr = curr.next;
            carry = sum/10;
            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }
        if(carry != 0){
            ListNode carry1 = new ListNode(carry,null);
            curr.next = carry1;
            curr = curr.next;
        }
        ListNode head = dummyNode;
        head = dummyNode.next;;
        return head;
    }
}