/*
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
*/
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int m = n/2;
        for(int i = 0; i < m; i++) {
            if(nums[i] > nums[i+1])
                return nums[i+1];
            if(nums[n-i-1] < nums[n-i-2])
                return nums[n-i-1];
        }
        return nums[0];
    }
}