/**
https://leetcode.com/problems/pascals-triangle-ii/
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        output.add(temp);
        int i,j;
        for(i = 1;i < rowIndex+1;i++)
        {
            temp = new ArrayList<>();
            temp.add(1);
            for(j = 1;j < i;j++)
                temp.add(output.get(i-1).get(j-1) + output.get(i-1).get(j));
            temp.add(1);
            output.add(temp);
        }
        return temp;
    }
}