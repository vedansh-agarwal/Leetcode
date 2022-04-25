/*
https://leetcode.com/problems/sort-colors/
*/

class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int min = i;
            for(int j = i+1; j < nums.length; j++) 
                if(nums[min] > nums[j])
                    min = j;
            swap(nums, i, min);
        }
    }
    
    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
