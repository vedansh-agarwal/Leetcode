/**
https://leetcode.com/problems/valid-palindrome/
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if (n == 0) 
        	return true;
        
        int front = 0;
        int back = n - 1;
        while(front <= back) {
        	char atFront = s.charAt(front);
        	char atBack = s.charAt(back);
        	if (!Character.isLetterOrDigit(atFront)) 
        		front++;
            else if(!Character.isLetterOrDigit(atBack))
        		back--;
            else {
        		if (Character.toLowerCase(atFront) != Character.toLowerCase(atBack)) 
        			return false;
        		front++;
        		back--;
            }
        }
        return true;
    }
}