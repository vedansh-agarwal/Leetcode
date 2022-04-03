/*
https://leetcode.com/problems/add-two-numbers/
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode sum = new ListNode();
        ListNode head = sum;
        ListNode nextNode = new ListNode();
        int digit,carry = 0;
        int m1,m2,i;
        int L1[] = new int[100];
        for(i = 0;l1 != null;l1 = l1.next)
        {
            L1[i++] = l1.val; 
        }
        m1 = i;
        for(i = 0;l2 != null || carry == 1;i++)
        {
            if(l2 != null)
            {
                L1[i] += l2.val + carry; 
                carry = L1[i]/10;
                L1[i] = L1[i]%10;
                l2 = l2.next;
            }
            else
            {
                L1[i] += carry;
                carry = L1[i]/10;
                L1[i] = L1[i]%10;
            }
        }
        m2 = i;
        m1 = Math.max(m1,m2);
        for(i = 0;i < m1;i++)
        {
            sum.val = L1[i];
            if(i != m1 - 1)
            {
                sum.next = nextNode;
                nextNode = new ListNode();
                sum = sum.next;
            }
            
        }
        return head;
    }
}
