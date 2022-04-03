/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/
public class Solution
{
    public static int lengthOfLongestSubstring(String s) 
    {
        int i,L = s.length();
        int start = 0,end = 0,result = 0;
        String str = s.substring(start,end);
        for(i = 0;i < L;i++)
        {
            if(str.indexOf(s.charAt(i)) == -1)
            str = s.substring(start,++end);
            else
            {
                if(result < str.length())
                result = str.length(); 
                start += str.indexOf(s.charAt(i))+1;
                str = s.substring(start,++end);
            }
        }
        if(result < str.length())
        result = str.length(); 
        return result;
    }
}
