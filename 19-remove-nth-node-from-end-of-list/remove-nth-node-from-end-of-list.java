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
        ListNode temp=head;
        ListNode prev=head;
        ListNode curr = head;
        int cnt = 0;
        if(head.next == null){
            return null;
        }
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        if(cnt == n){
            head = curr.next;
            return head;
        }
        cnt -= n;
        int c = 1;
        
        while(c <= cnt){
            prev = curr;
            curr = curr.next;
            c++;
        }
    
        prev.next = prev.next.next;
        curr = curr.next;

        return head;
        
    }
}