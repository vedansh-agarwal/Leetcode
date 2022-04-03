/*
https://leetcode.com/problems/jump-game-ii/
*/
public class Solution 
{
    static int n[];
    public static int jump(int[] nums) 
    {
        return recursion(nums,nums.length-1,0);
    }
    public static int recursion(int nums[],int L,int jumps)
    {
        int i;
        if(L == 0)
            return jumps;
        for(i = 0;i < L;i++)
        {
            if(nums[i] >= L-i)
                break;
        }
        return recursion(nums,i,jumps+1);
    }
}