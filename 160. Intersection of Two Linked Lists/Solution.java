/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) return null;

        int lengthA = 0;
        int lengthB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;

        //Calculate Lengths
        while(tempA != null){
            tempA = tempA.next;
            lengthA++;
        }

        while(tempB != null){
            tempB = tempB.next;
            lengthB++;
        }

        //Reset Pointers
        tempA = headA;
        tempB = headB;

        //Align Start
        if(lengthA > lengthB){
            int diff = lengthA - lengthB;

            while(diff > 0){
                tempA = tempA.next;
                diff--;
            }
        }else{
            int diff = lengthB - lengthA;

            while(diff > 0){
                tempB = tempB.next;
                diff--;

            }
        }

        //Move Together
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}