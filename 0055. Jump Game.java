/*
https://leetcode.com/problems/jump-game/
*/
class Solution {
    public static boolean canJump(int[] nums) {
        if(nums.length == 1)
            return true;
        int furthest = 0;
        for(int i = 0;i < nums.length-1;i++)
        {
            if(nums[i] == 0 && furthest <= i)
                return false;
            if(furthest < nums[i]+i)
                furthest = nums[i]+i;
        }
        return true;
    }
}