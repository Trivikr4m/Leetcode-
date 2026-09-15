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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        HashMap <Integer,Integer> hm = new HashMap<>();
        ListNode temp = head;
        int cnt = 0;

        

        while(temp != null){
            int val = temp.val;
            if(hm.containsKey(val)){
                if(hm.get(val) > 100) return true;
            }
            hm.put(val, hm.getOrDefault(val, 0)+1);
            temp = temp.next;
        }
        return false;
    }
}