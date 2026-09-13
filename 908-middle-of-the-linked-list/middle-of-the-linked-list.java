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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int cnt = 0;
        int mid;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        mid = cnt/2 + 1;
        ListNode move = head;
        int c = 1;
        while(c < mid){
            move = move.next;
            c++;
        }
        head = move;
        return head;
    }
}