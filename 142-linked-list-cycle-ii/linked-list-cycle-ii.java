/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        int sc = 0;
        int fc = 0;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            sc += 1;
            fc += 2;
            if(slow == fast) break;
        }
        if( slow != fast){
            return null;
        }

        int d = fc - sc;
        slow = head;
        fast = head;
        int cnt = 0;

        while(cnt < d){
            fast = fast.next;
            cnt++;
        }

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
    
}