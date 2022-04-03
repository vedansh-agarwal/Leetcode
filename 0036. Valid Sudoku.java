/*
https://leetcode.com/problems/valid-sudoku
*/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        String rows[] = {"","","","","","","","",""};
        String cols[] = {"","","","","","","","",""};
        String box[][] = {{"","",""},{"","",""},{"","",""}};
        int i,j,num;
        for(i = 0;i < 9;i++)
        {
            for(j = 0;j < 9;j++)
            {
                num = Character.getNumericValue(board[i][j]);
                if(num != -1)
                {
                    if(box[i/3][j/3].indexOf(String.valueOf(num)) == -1)
                        box[i/3][j/3] = box[i/3][j/3].concat(String.valueOf(num));
                    else
                        return false;
                    if(rows[i].indexOf(String.valueOf(num)) == -1)
                        rows[i] = rows[i].concat(String.valueOf(num));
                    else
                        return false;
                    if(cols[j].indexOf(String.valueOf(num)) == -1)
                        cols[j] = cols[j].concat(String.valueOf(num));
                    else
                        return false;
                }
            }
        }
        return true;
    }
}