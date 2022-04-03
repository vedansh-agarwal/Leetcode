/*
https://leetcode.com/problems/longest-common-prefix/
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int i,j;
        for(i = 1;i < strs.length;i++)
        {
            j = s.length();
            if(s != strs[i])
            for(j = 0;j < Math.min(s.length(),strs[i].length());j++)
                if(s.charAt(j) != strs[i].charAt(j))
                    break;
            s = s.substring(0,j);
        }
        return s;
    }
}