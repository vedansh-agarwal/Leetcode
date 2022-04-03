/*
https://leetcode.com/problems/plus-one/
*/
class Solution {
    public int[] plusOne(int[] digits) {
        int arr[] = new int[digits.length+1];
        for(int i = digits.length-1;i >= 0;i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            else
            {
                arr[i+1] = 0;
                digits[i] = 0;
            }
        }
        arr[0] = 1;
        return arr;
    }
}