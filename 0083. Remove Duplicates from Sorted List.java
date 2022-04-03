/*
https://leetcode.com/problems/remove-duplicates-from-sorted-list/
*/
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
        int current;
        if(head != null)
            current = head.val;
        else 
            return head;
        ListNode output = new ListNode(current);
        ListNode temp = output;
        while(head != null)
        {
            if(head.val != current)
            {
                current = head.val;
                temp.next = new ListNode(current);
                temp = temp.next;
            }
            head = head.next;
        }
        return output;
    }
}