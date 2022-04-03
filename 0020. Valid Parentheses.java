/*
https://leetcode.com/problems/valid-parentheses/
*/
import java.util.Stack;
import java.util.EmptyStackException;
public class Solution 
{
    public boolean isValid(String s) 
    {
        if (s.length()%2 != 0)
            return false;
        Stack <Character> brackets = new Stack<>();
        boolean output = true;
        int openC = 0;
        int closeC = 0;
        try
        {
            for (int i=0; i<s.length();i++)
            {
                if (s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[')
                {
                    brackets.push(s.charAt(i));
                    openC++;
                }  
                else if (s.charAt(i)=='}')
                {
                    if(brackets.pop() != '{')
                        return false;
                    else
                        closeC++;
                }
                else if (s.charAt(i)==')')
                {
                    if(brackets.pop() != '(')
                        return false;
                    else
                        closeC++;
                }
                else if (s.charAt(i)==']')
                {
                    if(brackets.pop() != '[')
                        return false;
                    else
                        closeC++;
                }
            }
        }
        catch(EmptyStackException e) {return false;}
        return (openC==closeC);
    }
}