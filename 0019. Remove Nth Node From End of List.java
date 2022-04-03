/*
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public static ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode x = head;
        ListNode output = head;
        ListNode y = head;
        int i,j;
        for(i = 0;y != null;i++)
        y = y.next;
        if(i == 1)
        return null;
        else if(n == i)
        return head.next;
        for(j = 0;j < i-n;j++)
        {
            output = output.next;
            if(j < i-n-1)
             x = x.next;
        }
        x.next = output.next;
        return head;
    }
}