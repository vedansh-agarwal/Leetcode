/*
https://leetcode.com/problems/next-permutation/
*/
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for(int i = n-1; i > 0; i--) {
            if(nums[i-1] < nums[i]) {
                pivot = i-1;
                break;
            }   
        }
        if(pivot != -1)
            for(int i = n-1; i > pivot; i--) {
                if(nums[i] > nums[pivot]) {
                    swap(nums, i, pivot);
                    break;
                }   
            }
        int front = pivot+1;
        int back = n-1;
        while(front < back) {
            swap(nums, front++, back--);
        }
    }
    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}