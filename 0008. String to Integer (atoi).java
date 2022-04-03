/*
https://leetcode.com/problems/string-to-integer-atoi/
*/
public class Solution
{
    public static int myAtoi(String s) 
    {
        s = s.trim();
        if(s.length() == 0)
        return 0;
        String str;
        int sign = 0;
        int start = 0;
        int i;
        if(s.charAt(0) == '+')
        sign = 1;
        if(s.charAt(0) == '-')
        sign = -1;
        if(sign == 0)
        {
            sign = 1;
            start = 0;
        }
        else
        start = 1;
        for(i = start;i < s.length();i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            break;
        }
        str = trimmer(s.substring(start,i));
        if(str == "")
        return 0;
        if(str.length() > 10)
        if(sign == 1)
        return 2147483647;
        else
        return -2147483648;
        for(i = 0;i < 10-str.length();i++)
        str = "0"+str;
        if(str.compareTo("2147483647") > 0)
        if(sign == 1)
        return 2147483647;
        else
        return -2147483648;
        return sign*Integer.parseInt(str);
    }
    public static String trimmer(String s)
    {
        int i;
        for(i = 0;i < s.length();i++)
        if(s.charAt(i) != '0')
        break;
        return s.substring(i);
    }
}