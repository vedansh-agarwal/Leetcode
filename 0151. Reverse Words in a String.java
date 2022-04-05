/*
https://leetcode.com/problems/reverse-words-in-a-string/
 */
class Solution {
    public String reverseWords(String s) {
        s = s.trim()+" ";
        int n = s.length();
        int start = 0;
        int end = 0;
        String output = "";
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                if(start != end)
                    if(start == 0)
                        output = s.substring(start, end);
                    else
                        output = s.substring(start, end)+" "+output;
                start = i+1;
                end = i+1;
            }
            else
                end++;
        }
        return output;
    }
}