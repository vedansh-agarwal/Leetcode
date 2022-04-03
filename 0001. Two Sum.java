/*
https://leetcode.com/problems/two-sum/
*/
public class Solution
{
    public static int[] twoSum(int nums[], int target)
    {
        int L = nums.length;
        int sol[] = new int[2];
        int i,j;
        for(i = 0;i < L-1;i++)
        {
            for(j = i+1;j < L;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    sol[0] = i;
                    sol[1] = j;
                    break;
                }
            }
            if(j < L)
            break;
        }
        return sol;
    }
}
