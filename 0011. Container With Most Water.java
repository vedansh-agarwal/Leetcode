/*
https://leetcode.com/problems/container-with-most-water/
*/
public class Solution 
{
    public int maxArea(int[] height) 
    {
        int l = 0;
        int r = height.length-1;
        int area = 0;
        int h;
        while (l < r) 
        {
            h = Math.min(height[l], height[r]);
            area = Math.max(area, h*(r-l));
            
            while (height[l] <= h && l < r) 
                l++;
            
            while (height[r] <= h && l < r) 
                r--;
        }
        return area;
    }
}