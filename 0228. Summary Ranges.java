/**
 * https://leetcode.com/problems/summary-ranges/
 */
class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> output = new ArrayList<String>();
        if(nums.length == 0)
            return output;
        int start = nums[0];
        int current = start;
        int end;
        for(int i = 1;i < nums.length;i++)
        {
            if(nums[i] == current+1)
                current++;
            else
            {
                end = nums[i-1];
                if(end == start)
                    output.add(String.valueOf(start));
                else
                    output.add(String.valueOf(start)+"->"+String.valueOf(end));
                start = nums[i];
                current = start;
            }   
        }
        end = nums[nums.length-1];
        if(end == start)
            output.add(String.valueOf(start));
        else
            output.add(String.valueOf(start)+"->"+String.valueOf(end));
        return output;
    }
}