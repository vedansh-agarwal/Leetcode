/*
https://leetcode.com/problems/longest-consecutive-sequence/
*/
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int current = nums[0];
        int count = 1;
        int output = 0;
        for(int i = 1;i < nums.length;i++)
        {
            if(nums[i] == current+1 || nums[i] == current)
            {
                if(nums[i] != current)
                    count++;
                current = nums[i];
            }
            else
            {
                current = nums[i];
                if(output < count)
                    output = count;
                count = 1;
            }
        }
        if(output < count)
            return count;
        else
            return output;
    }
}