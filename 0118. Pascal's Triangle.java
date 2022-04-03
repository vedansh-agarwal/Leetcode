/**
https://leetcode.com/problems/pascals-triangle/
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        output.add(temp);
        int i,j;
        for(i = 1;i < numRows;i++)
        {
            temp = new ArrayList<>();
            temp.add(1);
            for(j = 1;j < i;j++)
                temp.add(output.get(i-1).get(j-1) + output.get(i-1).get(j));
            temp.add(1);
            output.add(temp);
        }
        return output;
    }
}