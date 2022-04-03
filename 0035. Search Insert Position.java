/*
https://leetcode.com/problems/search-insert-position 
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i = 0;i < nums.length;i++)
        {
            if(target < nums[i])
                break;
        }
        if(i == 0)
            return 0;
        else if(target == nums[i-1])
            return i-1;
        else
            return i;
    }
}