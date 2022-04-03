/*
https://leetcode.com/problems/reverse-nodes-in-k-group/
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1 || head.next == null || head == null)
            return head;
        ListNode output = new ListNode();
        ListNode temp = output;
        int arr[] = new int[k];
        int count = 0;
        int i;
        while(head != null)
        {
            if(count < k-1)
            {
                arr[count++] = head.val;
            }
            else
            {
                arr[count++] = head.val;
                for(i = k-1;i >= 0;i--)
                {
                    temp.next = new ListNode(arr[i]);
                    temp = temp.next;
                }
                count = 0;
            }
            head = head.next;
        }
        for(i = 0;i < count;i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }   
        return output.next;
    }
}