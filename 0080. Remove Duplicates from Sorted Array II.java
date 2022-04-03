/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3)
            return nums.length;
        int current = 0;
        int count = 1;
        for(int i = 1;i < nums.length;i++)
            if(nums[current] < nums[i])
            {
                nums[++current] = nums[i];
                count = 1;
            }
            else if(count < 2)
            {
                nums[++current] = nums[i];
                count++;
            }
        return current+1;
    }
}