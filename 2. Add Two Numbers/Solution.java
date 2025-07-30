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

    public static ListNode create(int number, int carry){
        return new ListNode((number + carry)%10);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        ListNode ans = new ListNode ((l1.val + l2.val) % 10);
        ListNode temp = ans;

        int carry = (l1.val + l2.val) / 10;
        l1 = l1.next;
        l2 = l2.next;


        while(l1 != null && l2 != null){
            int number = l1.val + l2.val;
            temp.next = create(number, carry);
            temp = temp.next;
            carry = (number + carry) / 10;

            l1 = l1.next;
            l2 = l2.next;
        }


        while(l1 != null){
            temp.next = create(l1.val, carry);
            temp = temp.next;
            carry = (l1.val + carry) / 10;

            l1 = l1.next;
        }

        while(l2 != null){
            temp.next = create(l2.val, carry);
            temp = temp.next;
            carry = (l2.val + carry) / 10;

            l2 = l2.next;
        }

        if(carry != 0){
            ListNode newNode =  new ListNode(carry);
            temp.next = newNode;
        }

        return ans;







    }
}