/*
https://leetcode.com/problems/merge-two-sorted-lists/
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
public class Solution 
{
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        int min = 0;
        int check = 0;
        ListNode head = new ListNode();
        ListNode merged = head;
        if(l1 == null && l2 == null)
            return null;
        else if(l1 != null && l2 == null)
            return l1;
        else if(l1 == null && l2 != null)
            return l2;
        else
        {
            while(l1 != null || l2 != null)
            {
                if(l1 == null)
                {
                    head.next = new ListNode(l2.val);
                    head = head.next;
                    l2 = l2.next;
                }
                else if(l2 == null)
                {
                    head.next = new ListNode(l1.val);
                    head = head.next;
                    l1 = l1.next;
                }
                else
                {
                    if(l1.val <= l2.val)
                    {
                        min = l1.val;
                        l1 = l1.next;
                    }
                    else
                    {
                        min = l2.val;
                        l2 = l2.next;
                    }
                    head.next = new ListNode(min);
                    head = head.next;
                }
            }
        }
        return merged.next;
    }
}