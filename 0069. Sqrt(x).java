/*
https://leetcode.com/problems/sqrtx/
*/
class Solution {
    public int mySqrt(int x) {
        int output = 0;
        for(int i = 0;i <= x;i++)
        {
           if((long)i*i <= x)
               output = i;
           else
              return output; 
        }
        return output;
    }
}