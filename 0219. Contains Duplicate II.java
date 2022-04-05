/*
https://leetcode.com/problems/contains-duplicate-ii/
*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(j-i > k)
                    break;
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}