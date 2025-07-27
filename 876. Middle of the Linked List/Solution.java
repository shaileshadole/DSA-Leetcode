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
        
        if(head == null) return null;

        int index = 1;
        ListNode fast = head;
        ListNode slow = head;


        while(fast.next != null){
            fast = fast.next;
            index++;

            //Even index
            if(index % 2 == 0){
                slow = slow.next;
            }
        }

        return slow;
    }
}