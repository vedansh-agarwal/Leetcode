/*
https://leetcode.com/problems/remove-element
*/
class Solution {
    public int removeElement(int[] nums, int val) 
    {
        if(nums.length == 1)
            return (nums[0] == val)?0:1;
        int current = 0;
        while(current < nums.length && nums[current] != val)
            current++;
        int temp;
        for(int i = current+1;i < nums.length && current < nums.length;)
        {
            if(nums[current] == val)
            {
                while(i < nums.length && nums[i] == val)
                    i++;
                if(i == nums.length)
                    break;
                temp = nums[current];
                nums[current] = nums[i];
                nums[i] = temp;
            }
            else
            {
                current++;
                if(i <= current)
                    i = current+1;
            }
        }
        return current;
    }
}