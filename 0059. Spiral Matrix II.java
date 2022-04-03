/*
https://leetcode.com/problems/spiral-matrix-ii/s
*/
class Solution {
    public int[][] generateMatrix(int n) 
    {
        int arr[][] = new int[n][n];
        int count = 1;
        int i,j;
        for(i = 0; count <= n*n ;i++)
        {
            for(j = i;j < n-i;j++)
                arr[i][j] = count++;
            for(j = i+1;j < n-i;j++)
                arr[j][n-i-1] = count++;
            for(j = n-2-i;j >= i;j--)
                arr[n-i-1][j] = count++;
            for(j = n-2-i;j > i;j--)
                arr[j][i] = count++;
        }
        return arr;
    }
}