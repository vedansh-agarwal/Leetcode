/*
https://leetcode.com/problems/palindrome-number/
*/
public class Solution
{
    public static boolean isPalindrome(int x) 
    {
        int i;
        if(x < 0)
        return false;
        else if(x < 10)
        return true;
        String s = String.valueOf(x);
        for(i = 0;i < s.length()/2;i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-i-1))
            break;
        }
        if(i == s.length()/2)
        return true;
        else
        return false;
    }
}