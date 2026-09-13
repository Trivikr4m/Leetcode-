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
        ListNode temp = head;
        ListNode prev = null;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        ListNode curr = head;
        int mid = cnt/2+1;
        if(cnt == 1){
            return null;
        }
        int count = 1;
        while(count < mid){
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = prev.next.next;
        curr = curr.next;
        return head;
    }
}