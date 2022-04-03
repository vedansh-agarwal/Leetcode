/*
https://leetcode.com/problems/first-missing-positive
*/
import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        for(int j = 0;j < nums.length;j++)
        {
            if(nums[j] == i)
                i++;
            else if(nums[j] > i)
                break;
        }
        return i;
    }
}