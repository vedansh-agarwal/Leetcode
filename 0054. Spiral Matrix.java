/*
 https://leetcode.com/problems/spiral-matrix/
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int L = matrix.length;
        int B = matrix[0].length;
        int i,j;
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(i = 0; i < Math.max(L,B)/2 + 1;i++)
        {
            for(j = i;j < B-i;j++)
                if(count++ < L*B)
                arr.add(matrix[i][j]);
            for(j = i+1;j < L-i;j++)
                if(count++ < L*B)
                arr.add(matrix[j][B-i-1]);
            for(j = B-i-2;j >= i;j--)
                if(count++ < L*B)
                arr.add(matrix[L-i-1][j]);
            for(j = L-i-2;j > i;j--)
                if(count++ < L*B)
                arr.add(matrix[j][i]);
        }
        
        return arr;
    }
}