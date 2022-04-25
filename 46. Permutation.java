/*
https://leetcode.com/problems/permutations/
*/

class Solution {
    List<List<Integer>> output;
    int size;
    public List<List<Integer>> permute(int[] nums) {
        output = new ArrayList<>();
        size = nums.length;
        permute(nums, 0);
        return output;
    }
    
    public void permute(int[] arr, int k) {
        if(k == size-1) {
            List<Integer> list = new ArrayList<>();
            for(int num: arr)
                list.add(num);
            output.add(list);
        }
        else {
            for(int i = k; i < size; i++) {
                swap(arr, i, k);
                permute(arr,k+1);
                swap(arr, k, i);
            }
        }
    }
    
    public void swap(int nums[], int i, int j) {
        if(i == j)
            return;
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
