/*
https://leetcode.com/problems/swap-nodes-in-pairs/
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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode output = new ListNode();
        ListNode temp = output;
        int arr[] = new int[100];
        int count = 0,i;
        while(head != null)
        {
            arr[count++] = head.val;
            head = head.next;
        }
        for(i = 0; i < count-1;i = i+2)
        {
            temp.next = new ListNode(arr[i+1]);
            temp = temp.next;
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        if(i == count-1)
        temp.next = new ListNode(arr[i]);
        return output.next;
    }
}