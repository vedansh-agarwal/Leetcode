/*
 https://leetcode.com/problems/search-a-2d-matrix/
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++) {
            if(matrix[i][m-1] >= target) {
                int front = 0;
                int back = m-1;
                while(front <= back) {
                    int mid = (front+back)/2;
                    if(matrix[i][mid] == target)
                        return true;
                    else if(matrix[i][mid] > target)
                        back = mid-1;
                    else
                        front = mid+1;
                }
            }
        }
        return false;
    }
}