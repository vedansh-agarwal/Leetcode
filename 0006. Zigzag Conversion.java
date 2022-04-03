/*
https://leetcode.com/problems/zigzag-conversion/
*/
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length())
            return s;
        boolean up = false;
        String str[] = new String[numRows];
        String ss = "";
        int count = 0;
        int i;
        for(i = 0;i < s.length();i++)
        {    
            str[count] += s.charAt(i);
            if(up)
            {
                if(count > 0)
                    count--;
                else
                {
                    up = false;
                    count++;
                }    
            }
            else
            {
                if(count < numRows-1)
                    count++;
                else
                {
                    up = true;
                    count--;
                }
            }
        }
        for(i = 0;i < numRows;i++)
            ss += str[i].substring(4);
        return ss;
    }
}