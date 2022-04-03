/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*/
public class Solution 
{
    public static int removeDuplicates(int[] nums) 
    {
        if(nums.length < 2)
            return nums.length;
        int current = 0;
        for(int i = 1;i < nums.length;i++)
            if(nums[current] < nums[i])
                nums[++current] = nums[i];
        return current+1;
    }
}