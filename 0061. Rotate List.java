/*
https://leetcode.com/problems/rotate-list/
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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode output = new ListNode();
        ListNode temp = output;
        int arr[] = new int[500];
        int count = 0;
        while(head != null)
        {
            arr[count++] = head.val;
            head = head.next;
        }
        if(count == 0)
            return head;
        k = k%count;
        for(int i = count-k;i < count;i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        for(int i = 0;i < count-k;i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return output.next;
    }
}