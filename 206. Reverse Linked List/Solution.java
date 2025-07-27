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
    public ListNode reverseList(ListNode head) {

        if(head == null) return null;

        if(head.next == null) return head;

        if(head.next.next == null){
            head.next.next = head;
            head = head.next;
            head.next.next = null;
            return head;
        }
        
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = head.next.next;

        while(next != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }

        curr.next = prev;
        head.next = null;
        head = curr;
        return head;
    }
}