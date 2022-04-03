/*
https://leetcode.com/problems/merge-k-sorted-lists/
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
    public ListNode mergeKLists(ListNode lists[]) {
        ListNode output = new ListNode();
        ListNode temp = output;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i < lists.length;i++)
        {
            while(lists[i] != null)
            {
                arr.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(arr);
        for(int i : arr)
        {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return output.next;
    }
}