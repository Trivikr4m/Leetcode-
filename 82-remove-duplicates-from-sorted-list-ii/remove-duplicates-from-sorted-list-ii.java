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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prev = dummyNode ;
        ListNode curr = head;
        ListNode adv = curr;

        while(curr.next != null){
            adv = curr.next;
            if(curr.val != adv.val){
                prev = curr;
                curr = adv;
            }else{
                while(curr.val == adv.val){
                    if(adv.next == null){
                        prev.next = null;
                        return dummyNode.next;
                    }
                    adv = adv.next;
                }
                curr = adv;
                prev.next = curr;
            }
        }

        return dummyNode.next;
    }
}