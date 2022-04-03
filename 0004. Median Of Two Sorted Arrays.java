/*
https://leetcode.com/problems/median-of-two-sorted-arrays/
*/
public class Solution
{
    public static double findMedianSortedArrays(int nums1[], int nums2[]) 
    {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int c1 = 0,c2 = 0;
        int merged[] = new int[n1+n2];
        while(c1 < n1 || c2 < n2)
        {
            if(c1 < n1 && c2 < n2)
            {
                if(nums1[c1] < nums2[c2])
                merged[c1+c2] = nums1[c1++];
                else if(nums2[c2] < nums1[c1])
                merged[c1+c2] = nums2[c2++];
                else
                {
                    merged[c1+c2] = nums1[c1++];
                    merged[c1+c2] = nums2[c2++];
                }
            }
            else if(c1 < n1 && c2 == n2)
            merged[c1+c2] = nums1[c1++];
            else if(c1 == n1 && c2 < n2)
            merged[c1+c2] = nums2[c2++];
        }
        if((n1+n2) % 2 == 1)
        return merged[(n1+n2)/2];
        else
        return (double)(merged[(n1+n2)/2 - 1] + merged[(n1+n2)/2])/2;
    }
}