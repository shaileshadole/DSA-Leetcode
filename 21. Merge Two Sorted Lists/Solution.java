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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode newHead = null;
        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        if(list1.val > list2.val){
            newHead = new ListNode(list2.val); 
            list2 = list2.next;
        }else{
            newHead = new ListNode(list1.val);
            list1 = list1.next;
        }

        ListNode ans = newHead;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                ListNode temp = new ListNode(list2.val);
                newHead.next = temp;
                newHead = temp;
                list2 = list2.next;
            }else{
                ListNode temp = new ListNode(list1.val);
                newHead.next = temp;
                newHead = temp;
                list1 = list1.next;
            }
        }

        while(list1 != null){
            ListNode temp = new ListNode(list1.val);
            newHead.next = temp;
            newHead = temp;
            list1 = list1.next;
        }


        while(list2 != null){
            ListNode temp = new ListNode(list2.val);
            newHead.next = temp;
            newHead = temp;
            list2 = list2.next;
        }

        return ans;
    }
}