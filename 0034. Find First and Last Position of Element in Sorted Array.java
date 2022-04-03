/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0)
            return new int[]{-1,-1};
        int start = 0;
        int end = nums.length;
        int mid;
        int index = -1;
        int output[] = new int[2];
        while(start <= end)
        {
            mid = (start+end)/2;
            if(mid >= nums.length)
                break;
            if(nums[mid] == target)
            {
                index = mid;
                start = mid+1;
            }
            else if(nums[mid] > target)
                end = mid-1;
            else if(nums[mid] < target)
                start = mid+1;
        }
        output[1] = index;
        start = 0;
        end = nums.length;
        index = -1;
        while(start <= end)
        {
            mid = (start+end)/2;
            if(mid >= nums.length)
                break;
            if(nums[mid] == target)
            {
                index = mid;
                end = mid-1;
            }
            else if(nums[mid] > target)
                end = mid-1;
            else if(nums[mid] < target)
                start = mid+1;
        }
        output[0] = index;
        return output;
    }
}