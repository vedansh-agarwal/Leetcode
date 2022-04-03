/*
https://leetcode.com/problems/search-in-rotated-sorted-array
*/
class Solution {
    public int search(int[] nums, int target) {
        int L = nums.length;
        for(int i = 0;i < L;i++)
        {
            if(target == nums[i])
                return i;
            else if(target < nums[i])
                break;
        } 
        for(int i = L-1;i >= 0;i--)
        {
            if(target == nums[i])
                return i;
            else if(target > nums[i])
                break;
        } 
        return -1;
    }
}