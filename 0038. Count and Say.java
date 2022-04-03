/**
 https://leetcode.com/problems/count-and-say
 */
class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String s = "1";
        for(int i = 0;i < n-1;i++)
            s = helper(s);
        return s;
    }
    public static String helper(String s) {
        String x[] = {"0","1","2","3","4","5","6","7","8","9"};
        int freq = 0;
        char current = s.charAt(0);
        String output = "";
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == current)
                freq++;
            else
            {
                output += x[freq]+x[Character.getNumericValue(current)];
                freq = 1;
                current = s.charAt(i);
            }
        }
        output += x[freq]+x[Character.getNumericValue(current)];
        return output;
    }
}